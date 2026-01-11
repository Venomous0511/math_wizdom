@file:Suppress("DEPRECATION")

package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.adapters.WordProblemAdapter
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.database.entities.LessonProgress
import com.bitrealm.mathwizdomapp.fragments.ActivityInstructionsFragment
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.models.Question
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import kotlinx.coroutines.launch

@Suppress("UnusedVariable")
class WordProblemSelectionActivity : AppCompatActivity() {

    private lateinit var activity: Activity
    private lateinit var routineProblems: List<Question.RoutineProblem>
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    private lateinit var btnBack: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var btnFullscreen: ImageButton
    private lateinit var rvWordProblems: RecyclerView
    private lateinit var playerView: StyledPlayerView
    private lateinit var btnComplete: MaterialButton
    private lateinit var cardDirections: MaterialCardView
    private lateinit var tvDirections: TextView
    private lateinit var topBar: View
    private lateinit var cardVideo: MaterialCardView

    private var player: ExoPlayer? = null
    private var currentProblemIndex = 0
    private var progressCheckHandler: Handler? = null
    private var progressCheckRunnable: Runnable? = null
    private lateinit var lessonProgressDao: LessonProgressDao

    private var hasWatchedEnough = false
    private var videoWatchPercentage = 0
    private var isFullscreen = false

    companion object {
        private const val TAG = "WordProblemSelection"
        private const val MIN_WATCH_PERCENTAGE = 90
        const val EXTRA_ACTIVITY = "activity"
        const val EXTRA_USER_ID = "user_id"
        const val EXTRA_QUARTER = "quarter"
        const val EXTRA_LESSON = "lesson"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_problem_selection)

        // Get data from intent
        @Suppress("DEPRECATION")
        activity = intent.getSerializableExtra(EXTRA_ACTIVITY) as Activity
        userIdentifier = intent.getStringExtra(EXTRA_USER_ID) ?: ""
        quarter = intent.getIntExtra(EXTRA_QUARTER, 1)
        lessonNumber = intent.getIntExtra(EXTRA_LESSON, 1)

        // Filter routine problems
        routineProblems = activity.questions.filterIsInstance<Question.RoutineProblem>()

        if (routineProblems.isEmpty()) {
            AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("No routine problems found for this activity")
                .setPositiveButton("OK") { _, _ -> finish() }
                .show()
            return
        }

        val database = AppDatabase.getDatabase(this)
        lessonProgressDao = database.lessonProgressDao()

        initViews()
        setupRecyclerView()
        setupListeners()

        // Load first video
        loadVideo(0)

        // Pause music
        MusicManager.pauseForVideo()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        btnFullscreen = findViewById(R.id.btnFullscreen)
        rvWordProblems = findViewById(R.id.rvWordProblems)

        playerView = findViewById(R.id.playerView)
        btnComplete = findViewById(R.id.btnComplete)
        cardDirections = findViewById(R.id.cardDirections)
        tvDirections = findViewById(R.id.tvDirections)
        topBar = findViewById(R.id.topBar)
        cardVideo = findViewById(R.id.cardVideo)

        // Set directions
        tvDirections.text = ActivityInstructionsFragment.getDirectionText(quarter, lessonNumber, activity.activityNumber)

        // Initially disable complete button
        btnComplete.isEnabled = false
        btnComplete.alpha = 0.5f

        // Disable player controls
        playerView.useController = false

        // Disable touch on player to prevent pause/play
        playerView.setOnTouchListener { _, _ -> true }
    }

    private fun setupRecyclerView() {
        val adapter = WordProblemAdapter(routineProblems) { position ->
            loadVideo(position)
        }
        rvWordProblems.adapter = adapter
        rvWordProblems.layoutManager = LinearLayoutManager(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Exit Activity?")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes") { _, _ -> finish() }
                .setNegativeButton("No", null)
                .show()
        }

        btnSpeaker.setOnClickListener {
            showHelpDialog()
        }

        btnFullscreen.setOnClickListener {
            toggleFullscreen()
        }

        btnComplete.setOnClickListener {
            markAsComplete()
        }
    }

    private fun loadVideo(problemIndex: Int) {
        currentProblemIndex = problemIndex
        hasWatchedEnough = false
        videoWatchPercentage = 0

        // Disable complete button
        btnComplete.isEnabled = false
        btnComplete.alpha = 0.5f

        releasePlayer()
        initializePlayer(routineProblems[problemIndex])
    }

    @SuppressLint("UseKtx")
    private fun initializePlayer(problem: Question.RoutineProblem) {
        player = ExoPlayer.Builder(this).build().also { exoPlayer ->
            playerView.player = exoPlayer

            val fileName = problem.videoFileName
            if (fileName.isNullOrEmpty()) {
                showError("Video filename is missing")
                return
            }

            val videoPath = "quarter_$quarter/lesson_$lessonNumber/$fileName"

            try {
                val inputStream = assets.open(videoPath)
                @Suppress("unused") val fileSize = inputStream.available()
                inputStream.close()
            } catch (_: Exception) {
                showError("Video file not found:\n$videoPath")
                return
            }

            val videoUri = Uri.parse("file:///android_asset/$videoPath")
            val mediaItem = MediaItem.fromUri(videoUri)

            exoPlayer.setMediaItem(mediaItem)
            exoPlayer.repeatMode = Player.REPEAT_MODE_OFF
            exoPlayer.prepare()
            exoPlayer.playWhenReady = true

            exoPlayer.addListener(object : Player.Listener {
                override fun onPlayerError(error: PlaybackException) {
                    showError("Playback error:\n${error.message}")
                }

                @SuppressLint("SwitchIntDef")
                override fun onPlaybackStateChanged(playbackState: Int) {
                    when (playbackState) {
                        Player.STATE_READY -> {
                            Log.d(TAG, "Player ready")
                            MusicManager.pauseForVideo()
                            startProgressCheck()
                        }
                        Player.STATE_ENDED -> {
                            Log.d(TAG, "Playback ended")
                            hasWatchedEnough = true
                            videoWatchPercentage = 100
                            enableCompleteButton()
                            stopProgressCheck()
                        }
                        Player.STATE_IDLE -> {
                            stopProgressCheck()
                        }
                    }
                }

                override fun onIsPlayingChanged(isPlaying: Boolean) {
                    if (isPlaying) {
                        MusicManager.pauseForVideo()
                        startProgressCheck()
                    } else {
                        stopProgressCheck()
                    }
                }
            })
        }
    }

    private fun toggleFullscreen() {
        isFullscreen = !isFullscreen
        if (isFullscreen) {
            enterFullscreen()
        } else {
            exitFullscreen()
        }
    }

    private fun enterFullscreen() {
        window?.let { window ->
            WindowCompat.setDecorFitsSystemWindows(window, false)
            WindowInsetsControllerCompat(window, window.decorView).let { controller ->
                controller.hide(WindowInsetsCompat.Type.systemBars())
                controller.systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }

        topBar.visibility = View.GONE
        btnComplete.visibility = View.GONE
        rvWordProblems.visibility = View.GONE
        cardDirections.visibility = View.GONE

        val params = cardVideo.layoutParams as ConstraintLayout.LayoutParams

        // Clear all constraints
        params.topToBottom = ConstraintLayout.LayoutParams.UNSET
        params.bottomToTop = ConstraintLayout.LayoutParams.UNSET
        params.startToEnd = ConstraintLayout.LayoutParams.UNSET

        // Set fullscreen constraints
        params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        params.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID

        // Remove margins
        params.topMargin = 0
        params.bottomMargin = 0
        params.leftMargin = 0
        params.rightMargin = 0
        params.marginStart = 0
        params.marginEnd = 0

        cardVideo.layoutParams = params
        cardVideo.radius = 0f

        btnFullscreen.setImageResource(R.drawable.ic_fullscreen_exit)
    }

    private fun exitFullscreen() {
        window?.let { window ->
            WindowCompat.setDecorFitsSystemWindows(window, true)
            WindowInsetsControllerCompat(window, window.decorView).show(
                WindowInsetsCompat.Type.systemBars()
            )
        }

        topBar.visibility = View.VISIBLE
        btnComplete.visibility = View.VISIBLE
        rvWordProblems.visibility = View.VISIBLE
        cardDirections.visibility = View.VISIBLE

        val params = cardVideo.layoutParams as ConstraintLayout.LayoutParams
        val marginStart = (8 * resources.displayMetrics.density).toInt()
        val marginEnd = (16 * resources.displayMetrics.density).toInt()
        val marginTopBottom = (8 * resources.displayMetrics.density).toInt()

        // Reset all constraints
        params.topToTop = ConstraintLayout.LayoutParams.UNSET
        params.bottomToBottom = ConstraintLayout.LayoutParams.UNSET
        params.startToStart = ConstraintLayout.LayoutParams.UNSET
        params.endToEnd = ConstraintLayout.LayoutParams.UNSET

        // Set proper constraints back
        params.topToBottom = R.id.cardDirections
        params.bottomToTop = R.id.btnComplete
        params.startToEnd = R.id.guideline
        params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID

        // Set margins
        params.topMargin = marginTopBottom
        params.bottomMargin = marginTopBottom
        params.marginStart = marginStart
        params.marginEnd = marginEnd

        cardVideo.layoutParams = params
        cardVideo.radius = (16 * resources.displayMetrics.density)

        btnFullscreen.setImageResource(R.drawable.ic_fullscreen)
    }

    private fun startProgressCheck() {
        stopProgressCheck()

        progressCheckHandler = Handler(Looper.getMainLooper())
        progressCheckRunnable = object : Runnable {
            override fun run() {
                checkWatchProgress()
                progressCheckHandler?.postDelayed(this, 500)
            }
        }
        progressCheckHandler?.post(progressCheckRunnable!!)
    }

    private fun stopProgressCheck() {
        progressCheckRunnable?.let { runnable ->
            progressCheckHandler?.removeCallbacks(runnable)
        }
        progressCheckHandler = null
        progressCheckRunnable = null
    }

    private fun checkWatchProgress() {
        player?.let { exoPlayer ->
            val currentPosition = exoPlayer.currentPosition
            val duration = exoPlayer.duration

            if (duration > 0) {
                val percentage = ((currentPosition.toFloat() / duration.toFloat()) * 100).toInt()
                videoWatchPercentage = maxOf(videoWatchPercentage, percentage)

                Log.d(TAG, "Watch progress: $videoWatchPercentage%")

                if (videoWatchPercentage >= MIN_WATCH_PERCENTAGE && !hasWatchedEnough) {
                    hasWatchedEnough = true
                    enableCompleteButton()
                    stopProgressCheck()
                }
            }
        }
    }

    private fun enableCompleteButton() {
        runOnUiThread {
            btnComplete.isEnabled = true
            btnComplete.alpha = 1.0f
            Log.d(TAG, "Complete button enabled - watched $videoWatchPercentage%")
        }
    }

    private fun releasePlayer() {
        stopProgressCheck()
        player?.release()
        player = null
    }

    private fun showHelpDialog() {
        AlertDialog.Builder(this)
            .setTitle("Instructions")
            .setMessage("Select a word problem from the list to watch its solution video.\n\nYou must watch at least $MIN_WATCH_PERCENTAGE% of any video to complete this activity.")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun showError(message: String) {
        AlertDialog.Builder(this)
            .setTitle("Video Error")
            .setMessage(message)
            .setPositiveButton("OK") { _, _ -> finish() }
            .show()
    }

    private fun markAsComplete() {
        if (!hasWatchedEnough) {
            AlertDialog.Builder(this)
                .setTitle("Watch the Video")
                .setMessage("Please watch at least $MIN_WATCH_PERCENTAGE% of the video before marking as complete.\n\nCurrent progress: $videoWatchPercentage%")
                .setPositiveButton("OK", null)
                .show()
            return
        }

        lifecycleScope.launch {
            try {
                val totalQuestions = activity.questions.size

                val progress = LessonProgress(
                    userIdentifier = userIdentifier,
                    quarter = quarter,
                    lessonNumber = lessonNumber,
                    activityId = activity.id.toString(),
                    score = totalQuestions,
                    totalQuestions = totalQuestions
                )
                lessonProgressDao.insertProgress(progress)

                runOnUiThread {
                    val intent = Intent(this@WordProblemSelectionActivity, QuarterSelectionActivity::class.java)
                    intent.putExtra("USER_IDENTIFIER", userIdentifier)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                    finish()
                }
            } catch (e: Exception) {
                runOnUiThread {
                    AlertDialog.Builder(this@WordProblemSelectionActivity)
                        .setTitle("Error")
                        .setMessage("Failed to save progress: ${e.message}")
                        .setPositiveButton("OK") { _, _ -> finish() }
                        .show()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        MusicManager.pauseForVideo()
        player?.playWhenReady = true
    }

    override fun onPause() {
        super.onPause()
        stopProgressCheck()
        player?.playWhenReady = false
    }

    override fun onDestroy() {
        super.onDestroy()
        stopProgressCheck()
        releasePlayer()

        if (isFullscreen) {
            exitFullscreen()
        }

        MusicManager.resumeAfterVideo()
    }

    @Deprecated("This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    @SuppressLint("GestureBackNavigation")
    override fun onBackPressed() {
        if (isFullscreen) {
            exitFullscreen()
        } else {
            super.onBackPressed()
        }
    }
}