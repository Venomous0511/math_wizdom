package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.models.ActivityType
import com.google.android.material.button.MaterialButton

class ActivityInstructionsFragment : Fragment() {

    private lateinit var activity: Activity
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private var timer: CountDownTimer? = null

    private lateinit var btnSkip: MaterialButton
    private lateinit var tvInstructionTitle: TextView
    private lateinit var tvTitleContent: TextView
    private lateinit var tvDirection: TextView
    private lateinit var tvExample: TextView
    private lateinit var tvTimer: TextView
    private lateinit var ivAnimal: ImageView
    private lateinit var btnStart: MaterialButton

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.dragon,
        4 to R.drawable.fox
    )

    companion object {
        private const val ARG_ACTIVITY = "activity"
        private const val ARG_USER_ID = "user_id"
        private const val ARG_QUARTER = "quarter"
        private const val ARG_LESSON = "lesson"
        private const val COUNTDOWN_TIME = 10000L

        fun newInstance(
            activity: Activity,
            userIdentifier: String,
            quarter: Int,
            lessonNumber: Int
        ): ActivityInstructionsFragment {
            val fragment = ActivityInstructionsFragment()
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
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_instructions_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        setupUI()
        setupListeners()
    }

    private fun initViews(view: View) {
        btnStart = view.findViewById(R.id.btnStart)
        btnSkip = view.findViewById(R.id.btnSkip)
        tvInstructionTitle = view.findViewById(R.id.tvInstructionTitle)
        tvTitleContent = view.findViewById(R.id.tvTitleContent)
        tvDirection = view.findViewById(R.id.tvDirection)
        tvExample = view.findViewById(R.id.tvExample)
        tvTimer = view.findViewById(R.id.tvTimer)
        ivAnimal = view.findViewById(R.id.ivAnimal)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvInstructionTitle.text = "ACTIVITY #${activity.activityNumber}"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)

        // Set content based on activity
        when {
            activity.title.contains("Similar", ignoreCase = true) -> {
                tvTitleContent.text = "IDENTIFYING SIMILAR AND DISSIMILAR FRACTIONS"
                tvDirection.text = "Examine each pair of fractions and determine whether they are similar or dissimilar. Choose SIMILAR or DISSIMILAR for each pair."
                tvExample.text = "Fractions are similar if they have the same bottom number (denominator) and dissimilar if they have different bottom numbers."
            }
            activity.title.contains("Matching", ignoreCase = true) ||
                    activity.title.contains("Drag", ignoreCase = true) -> {
                tvTitleContent.text = "ADDS AND SUBTRACTS SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the fractions listed in Column A. Then, choose the correct answer from Column B and drag it into the corresponding box in Column A."
                tvExample.text = "Match each problem with its correct answer by dragging from Column B to Column A."
            }
            else -> {
                tvTitleContent.text = activity.title.uppercase()
                tvDirection.text = "Complete the activity by following the instructions for each question."
                tvExample.text = "Read each question carefully and select or provide your answer."
            }
        }
    }

    private fun setupListeners() {
        btnStart.setOnClickListener {
            btnStart.visibility = View.GONE
            tvTimer.visibility = View.VISIBLE
            btnSkip.visibility = View.VISIBLE
            startCountdown()
        }

        btnSkip.setOnClickListener {
            timer?.cancel()
            startActivity()
        }
    }

    private fun startCountdown() {
        timer = object : CountDownTimer(COUNTDOWN_TIME, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = (millisUntilFinished / 1000).toInt()
                tvTimer.text = "Starting in $secondsRemaining..."
            }

            override fun onFinish() {
                startActivity()
            }
        }.start()
    }

    private fun startActivity() {
        // Load the appropriate activity fragment based on type
        val fragment = when (activity.type) {
            ActivityType.MULTIPLE_CHOICE -> MultipleChoiceFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
            ActivityType.DRAG_DROP -> DragDropFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
            ActivityType.ROUTINE_PROBLEM -> RoutineProblemFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
            else -> {
                requireActivity().finish()
                return
            }
        }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        timer?.cancel()
    }
}