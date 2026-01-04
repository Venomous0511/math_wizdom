@file:Suppress("DEPRECATION")

package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import com.bitrealm.mathwizdomapp.R
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
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.database.entities.LessonProgress
import kotlinx.coroutines.launch
import android.os.Handler
import android.os.Looper
import com.bitrealm.mathwizdomapp.QuarterSelectionActivity

class RoutineProblemFragment : Fragment() {

    private lateinit var activity: Activity
    private lateinit var question: Question.RoutineProblem
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    private lateinit var btnBack: ImageButton
    private lateinit var btnSettings: ImageButton
    private lateinit var btnFullscreen: ImageButton
    private lateinit var tvActivityTitle: TextView
    private lateinit var playerView: StyledPlayerView
    private lateinit var btnComplete: MaterialButton
    private lateinit var ivAnimal: ImageView
    private lateinit var topBar: View
    private lateinit var cardVideo: MaterialCardView
    private lateinit var tvDirections: TextView

    private var player: ExoPlayer? = null
    private var isFullscreen = false
    private var progressCheckHandler: Handler? = null
    private var progressCheckRunnable: Runnable? = null
    private lateinit var lessonProgressDao: LessonProgressDao

    // Track video completion
    private var hasWatchedEnough = false
    private var videoWatchPercentage = 0

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.dragon,
        4 to R.drawable.fox
    )

    companion object {
        private const val TAG = "RoutineProblem"
        private const val ARG_ACTIVITY = "activity"
        private const val ARG_USER_ID = "user_id"
        private const val ARG_QUARTER = "quarter"
        private const val ARG_LESSON = "lesson"
        private const val MIN_WATCH_PERCENTAGE = 90

        fun newInstance(
            activity: Activity,
            userIdentifier: String,
            quarter: Int,
            lessonNumber: Int
        ): RoutineProblemFragment {
            val fragment = RoutineProblemFragment()
            val args = Bundle().apply {
                putSerializable(ARG_ACTIVITY, activity)
                putString(ARG_USER_ID, userIdentifier)
                putInt(ARG_QUARTER, quarter)
                putInt(ARG_LESSON, lessonNumber)
            }
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            @Suppress("DEPRECATION")
            activity = it.getSerializable(ARG_ACTIVITY) as Activity
            userIdentifier = it.getString(ARG_USER_ID) ?: ""
            quarter = it.getInt(ARG_QUARTER)
            lessonNumber = it.getInt(ARG_LESSON)
        }

        val allQuestions = activity.questions.filterIsInstance<Question.RoutineProblem>()
        question = allQuestions.random()
    }

    private fun getTotalActivitiesForLesson(quarter: Int, lessonNumber: Int): Int {
        return 2
    }

    private fun checkAndShowLessonCompletion() {
        lifecycleScope.launch {
            try {
                // Count how many activities in this lesson are completed
                val completedCount = lessonProgressDao.getLessonCompletedActivitiesCount(
                    userIdentifier,
                    quarter,
                    lessonNumber
                )

                val totalActivitiesInLesson = getTotalActivitiesForLesson(quarter, lessonNumber)

                // Check if this is the passing threshold (at least 2 activities)
                if (completedCount >= totalActivitiesInLesson) {
                    // Check if we haven't shown this notification before
                    val prefs = requireActivity().getSharedPreferences("lesson_completion", Context.MODE_PRIVATE)
                    val key = "${userIdentifier}_${quarter}_${lessonNumber}"

                    if (!prefs.getBoolean(key, false)) {
                        // Mark as shown
                        prefs.edit().putBoolean(key, true).apply()

                        // Show congratulations dialog
                        requireActivity().runOnUiThread {
                            showLessonCompletionDialog()
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun showLessonCompletionDialog() {
        val dialog = AlertDialog.Builder(requireContext())
            .setTitle("🎉 Congratulations!")
            .setMessage("You have successfully passed Lesson $lessonNumber activities!")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .create()

        dialog.show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.routine_problem_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val database = AppDatabase.getDatabase(requireContext())
        lessonProgressDao = database.lessonProgressDao()

        initViews(view)
        setupListeners()
        initializePlayer()

        tvDirections.text = ActivityInstructionsFragment.getDirectionText(quarter, lessonNumber, activity.activityNumber)

        // Pause music when video fragment loads
        MusicManager.pauseForVideo()
    }

    @SuppressLint("SetTextI18n", "ClickableViewAccessibility")
    private fun initViews(view: View) {
        btnBack = view.findViewById(R.id.btnBack)
        btnSettings = view.findViewById(R.id.btnSettings)
        btnFullscreen = view.findViewById(R.id.btnFullscreen)
        tvActivityTitle = view.findViewById(R.id.tvActivityTitle)
        playerView = view.findViewById(R.id.playerView)
        btnComplete = view.findViewById(R.id.btnComplete)
        ivAnimal = view.findViewById(R.id.ivAnimal)
        topBar = view.findViewById(R.id.topBar)
        cardVideo = view.findViewById(R.id.cardVideo)

        tvActivityTitle.text = "ACTIVITY #${activity.activityNumber}"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)

        tvDirections = view.findViewById(R.id.tvDirections)

        playerView.useController = false
        playerView.setOnTouchListener { _, _ -> true }

        // Initially disable complete button
        btnComplete.isEnabled = false
        btnComplete.alpha = 0.5f
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Exit Activity?")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes") { _, _ ->
                    requireActivity().finish()
                }
                .setNegativeButton("No", null)
                .show()
        }

        btnSettings.setOnClickListener {
            showHelpDialog()
        }

        btnFullscreen.setOnClickListener {
            toggleFullscreen()
        }

        btnComplete.setOnClickListener {
            markAsComplete()
        }
    }

    @Suppress("UnusedVariable")
    @SuppressLint("UseKtx")
    private fun initializePlayer() {
        player = ExoPlayer.Builder(requireContext()).build().also { exoPlayer ->
            playerView.player = exoPlayer

            val fileName = question.videoFileName
            if (fileName.isNullOrEmpty()) {
                showError("Video filename is missing")
                return
            }

            val videoPath = "quarter_$quarter/lesson_$lessonNumber/$fileName"

            try {
                val inputStream = requireContext().assets.open(videoPath)
                @Suppress("unused") val fileSize = inputStream.available()
                inputStream.close()
            } catch (_: Exception) {
                showError("Video file not found:\n$videoPath")
                return
            }

            // Use correct URI format for assets
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

                override fun onPlaybackStateChanged(playbackState: Int) {
                    when (playbackState) {
                        Player.STATE_READY -> {
                            Log.d(TAG, "Player ready")
                            MusicManager.pauseForVideo()
                            startProgressCheck()
                        }
                        Player.STATE_BUFFERING -> Log.d(TAG, "Buffering...")
                        Player.STATE_ENDED -> {
                            Log.d(TAG, "Playback ended")
                            // Video finished playing completely
                            hasWatchedEnough = true
                            videoWatchPercentage = 100
                            enableCompleteButton()
                            stopProgressCheck()
                        }
                        Player.STATE_IDLE -> {
                            Log.d(TAG, "Player idle")
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

    private fun startProgressCheck() {
        stopProgressCheck()

        progressCheckHandler = Handler(Looper.getMainLooper())
        progressCheckRunnable = object : Runnable {
            override fun run() {
                checkWatchProgress()
                // Check progress every 500ms
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

                Log.d(TAG, "Watch progress: $videoWatchPercentage% (${currentPosition}ms / ${duration}ms)")

                // If watched at least MIN_WATCH_PERCENTAGE%, enable complete button
                if (videoWatchPercentage >= MIN_WATCH_PERCENTAGE && !hasWatchedEnough) {
                    hasWatchedEnough = true
                    enableCompleteButton()
                    stopProgressCheck()
                }
            }
        }
    }

    private fun enableCompleteButton() {
        requireActivity().runOnUiThread {
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

    private fun toggleFullscreen() {
        isFullscreen = !isFullscreen
        if (isFullscreen) {
            enterFullscreen()
        } else {
            exitFullscreen()
        }
    }

    private fun enterFullscreen() {
        requireActivity().window?.let { window ->
            WindowCompat.setDecorFitsSystemWindows(window, false)
            WindowInsetsControllerCompat(window, window.decorView).let { controller ->
                controller.hide(WindowInsetsCompat.Type.systemBars())
                controller.systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }

        topBar.visibility = View.GONE
        btnComplete.visibility = View.GONE
        ivAnimal.visibility = View.GONE

        val params = cardVideo.layoutParams as ConstraintLayout.LayoutParams
        params.topMargin = 0
        params.bottomMargin = 0
        params.leftMargin = 0
        params.rightMargin = 0
        cardVideo.layoutParams = params
        cardVideo.radius = 0f

        btnFullscreen.setImageResource(R.drawable.ic_fullscreen_exit)
    }

    private fun exitFullscreen() {
        requireActivity().window?.let { window ->
            WindowCompat.setDecorFitsSystemWindows(window, true)
            WindowInsetsControllerCompat(window, window.decorView).show(
                WindowInsetsCompat.Type.systemBars()
            )
        }

        topBar.visibility = View.VISIBLE
        btnComplete.visibility = View.VISIBLE
        ivAnimal.visibility = View.VISIBLE

        val params = cardVideo.layoutParams as ConstraintLayout.LayoutParams
        val marginDp = 16
        val marginPx = (marginDp * resources.displayMetrics.density).toInt()
        params.topMargin = (8 * resources.displayMetrics.density).toInt()
        params.bottomMargin = (8 * resources.displayMetrics.density).toInt()
        params.leftMargin = marginPx
        params.rightMargin = marginPx
        cardVideo.layoutParams = params
        cardVideo.radius = (16 * resources.displayMetrics.density)

        btnFullscreen.setImageResource(R.drawable.ic_fullscreen)
    }

    private fun showHelpDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("Instructions")
            .setMessage("Watch the video to see the routine problem. The video contains:\n\n• The word problem\n• Questions to answer\n• Step-by-step solution\n• Final answers\n\nPay close attention and learn from the example!\n\nYou must watch at least $MIN_WATCH_PERCENTAGE% of the video to complete this activity.")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun showError(message: String) {
        AlertDialog.Builder(requireContext())
            .setTitle("Video Error")
            .setMessage(message)
            .setPositiveButton("OK") { _, _ ->
                requireActivity().finish()
            }
            .show()
    }

    private fun markAsComplete() {
        // Check if video has been watched enough
        if (!hasWatchedEnough) {
            AlertDialog.Builder(requireContext())
                .setTitle("Watch the Video")
                .setMessage("Please watch at least $MIN_WATCH_PERCENTAGE% of the video before marking as complete.\n\nCurrent progress: $videoWatchPercentage%")
                .setPositiveButton("OK", null)
                .show()
            return
        }

        // Save progress to database
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

                requireActivity().runOnUiThread {
                    // Check if lesson is completed after this activity
                    checkAndShowLessonCompletion()

                    // Navigate after delay
                    lifecycleScope.launch {
                        kotlinx.coroutines.delay(500)
                        val intent = Intent(requireActivity(), QuarterSelectionActivity::class.java)
                        intent.putExtra("USER_IDENTIFIER", userIdentifier)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                        startActivity(intent)
                        requireActivity().finish()
                    }
                }
            } catch (e: Exception) {
                requireActivity().runOnUiThread {
                    AlertDialog.Builder(requireContext())
                        .setTitle("Error")
                        .setMessage("Failed to save progress: ${e.message}")
                        .setPositiveButton("OK") { _, _ ->
                            requireActivity().finish()
                        }
                        .show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        if (player == null) {
            initializePlayer()
        }
    }

    override fun onResume() {
        super.onResume()
        MusicManager.pauseForVideo()
        player?.playWhenReady = true

        if (player?.isPlaying == true) {
            startProgressCheck()
        }
    }

    override fun onPause() {
        super.onPause()
        stopProgressCheck()
        player?.playWhenReady = false
    }

    override fun onStop() {
        super.onStop()
        releasePlayer()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        stopProgressCheck()
        releasePlayer()

        if (isFullscreen) {
            exitFullscreen()
        }

        MusicManager.resumeAfterVideo()
    }
}