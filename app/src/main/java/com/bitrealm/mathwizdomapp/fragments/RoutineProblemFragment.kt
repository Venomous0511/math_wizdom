@file:Suppress("DEPRECATION")

package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
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
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

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

    private var player: ExoPlayer? = null
    private var isFullscreen = false

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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.routine_problem_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        setupListeners()
        initializePlayer()
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

        playerView.useController = false
        playerView.setOnTouchListener { _, _ -> true }
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
                val fileSize = inputStream.available()
                inputStream.close()
            } catch (_: Exception) {
                showError("Video file not found:\n$videoPath")
                return
            }

            // Use correct URI format for assets
            val videoUri = Uri.parse("file:///android_asset/$videoPath")

            val mediaItem = MediaItem.fromUri(videoUri)
            exoPlayer.setMediaItem(mediaItem)
            exoPlayer.repeatMode = Player.REPEAT_MODE_ONE
            exoPlayer.prepare()
            exoPlayer.playWhenReady = true

            exoPlayer.addListener(object : Player.Listener {
                override fun onPlayerError(error: PlaybackException) {
                    showError("Playback error:\n${error.message}")
                }

                override fun onPlaybackStateChanged(playbackState: Int) {
                    when (playbackState) {
                        Player.STATE_READY -> Log.d(TAG, "Player ready")
                        Player.STATE_BUFFERING -> Log.d(TAG, "Buffering...")
                        Player.STATE_ENDED -> Log.d(TAG, "Playback ended")
                        Player.STATE_IDLE -> Log.d(TAG, "Player idle")
                    }
                }
            })
        }
    }

    private fun releasePlayer() {
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
            .setMessage("Watch the video to see the routine problem. The video contains:\n\n• The word problem\n• Questions to answer\n• Step-by-step solution\n• Final answers\n\nPay close attention and learn from the example!")
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
        AlertDialog.Builder(requireContext())
            .setTitle("Activity Completed")
            .setMessage("Great! You've watched the routine problem video.\n\nRemember to write your answers on paper for your teacher to check.")
            .setPositiveButton("OK") { _, _ ->
                requireActivity().finish()
            }
            .setCancelable(false)
            .show()
    }

    override fun onStart() {
        super.onStart()
        if (player == null) {
            initializePlayer()
        }
    }

    override fun onStop() {
        super.onStop()
        releasePlayer()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        releasePlayer()

        if (isFullscreen) {
            exitFullscreen()
        }
    }
}