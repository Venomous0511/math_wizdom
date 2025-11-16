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
import com.bitrealm.mathwizdomapp.utils.MusicManager
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

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

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
        when ("${quarter}_${lessonNumber}_${activity.activityNumber}") {
            // Quarter 1, Lesson 1, Activity 1
            "1_1_1" -> {
                tvTitleContent.text = "IDENTIFYING SIMILAR AND DISSIMILAR FRACTIONS"
                tvDirection.text = "Examine each pair of fractions and determine whether they are similar or dissimilar. Choose SIMILAR or DISSIMILAR for each pair."
                tvExample.text = "Fractions are similar if they have the same bottom number (denominator) and dissimilar if they have different bottom numbers."
            }

            // Quarter 1, Lesson 1, Activity 2
            "1_1_2" -> {
                tvTitleContent.text = "ADDS AND SUBTRACTS SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the fractions listed in Column A. Then, choose the correct answer from Column B and drag it into the corresponding box in Column A."
                tvExample.text = "Match each problem with its correct answer by dragging from Column B to Column A."
            }

            // Quarter 1, Lesson 2, Activity 1
            "1_2_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING ADDITION OF FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Focus on the steps shown in the video. Take notes if needed."
            }

            // Quarter 1, Lesson 2, Activity 2
            "1_2_2" -> {
                tvTitleContent.text = "SOLVE NON-ROUTINE PROBLEMS INVOLVING SUBTRACTION OF FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Focus on the steps shown in the video. Take notes if needed."
            }

            // Quarter 1, Lesson 3, Activity 1
            "1_3_1" -> {
                tvTitleContent.text = "MULTIPLY SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and determine whether each answer provided is correct or not. Choose TRUE if the answer is correct and FALSE if it is incorrect."
                tvExample.text = "Check if the multiplication was done correctly. Select TRUE if correct, FALSE if incorrect."
            }

            // Quarter 1, Lesson 3, Activity 2
            "1_3_2" -> {
                tvTitleContent.text = "MULTIPLY SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and choose the right answer from the provided options."
                tvExample.text = "Multiply the fractions step by step, then select the matching answer."
            }

            // Quarter 1, Lesson 4, Activity 1
            "1_4_1" -> {
                tvTitleContent.text = "MATHEMATICAL EXPRESSION"
                tvDirection.text = "Examine the given mathematical phrases and determine their correct expressions. Drag the correct expression to match its corresponding mathematical phrase in the space provided."
                tvExample.text = "For example: Phrase: 'Twelve times twelve' matches with Expression: '12 x 12'."
            }

            // Quarter 1, Lesson 4, Activity 2
            "1_4_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE OR NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION, WITHOUT OR WITH SUBTRACTION OF FRACTIONS AND MIXED FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Learn how to solve multi-step problems involving multiplication and subtraction."
            }

            // Quarter 1, Lesson 5, Activity 1
            "1_5_1" -> {
                tvTitleContent.text = "DIVIDE SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding fraction in Column A."
                tvExample.text = "Tap the correct answer to connect it to the correct fraction. Tap again to disconnect."
            }

            // Quarter 1, Lesson 5, Activity 2
            "1_5_2" -> {
                tvTitleContent.text = "DIVIDES SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and select the correct answer by dragging and dropping it into the box provided."
                tvExample.text = "Calculate the quotient carefully, then match it with the answer."
            }

            // Quarter 1, Lesson 6, Activity 1
            "1_6_1" -> {
                tvTitleContent.text = "TERMS IN DIVISION"
                tvDirection.text = "Analyze the given word problem and determine whether it contains terms related to division. Choose TRUE if it does, and FALSE if it does not."
                tvExample.text = "Learn about dividend, divisor, and quotient in fraction division."
            }

            // Quarter 1, Lesson 6, Activity 2
            "1_6_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE OR NON-ROUTINE PROBLEMS INVOLVING DIVISION, WITHOUT OR WITH SUBTRACTION OF FRACTIONS AND MIXED FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 7, Activity 1
            "1_7_1" -> {
                tvTitleContent.text = "ADDS DECIMALS AND MIXED DECIMALS THROUGH TEN THOUSANDTHS"
                tvDirection.text = "Solve the given fractions and determine whether each answer is correct or not. Choose TRUE if the answer is correct and FALSE if it is incorrect."
                tvExample.text = "0.8779 + 1.898 = 2.7759 \n 0.8779 + 1.8989 = 2.7768 (NOT ROUND OFF)"
            }

            // Quarter 1, Lesson 7, Activity 2
            "1_7_2" -> {
                tvTitleContent.text = "SUBTRACTS DECIMALS AND MIXED DECIMALS THROUGH TEN THOUSANDTHS"
                tvDirection.text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A."
                tvExample.text = "99.8774 - 57.985 = 41.8924 \n 6.8779 - 1.2132 = 5.6647 (NOT ROUND OFF)"
            }

            // Quarter 1, Lesson 8, Activity 1
            "1_8_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING ADDITION OF DECIMALS AND MIXED DECIMALS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 8, Activity 2
            "1_8_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING SUBTRACTION OF DECIMALS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 9, Activity 1
            "1_9_1" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals and choose the right answer from the provided options."
                tvExample.text = "1.23 x 0.4 = 0.492\n 0.11 x 0.1 = 0.011 \n 1.23 x 1.23 = 1.5129 (NOT ROUND OFF)"
            }

            // Quarter 1, Lesson 9, Activity 2
            "1_9_2" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding item in Column A."
                tvExample.text = "1.23 x 0.4 = 0.492\n 0.11 x 0.1 = 0.011 \n 1.23 x 1.23 = 1.5129 (NOT ROUND OFF)"
            }

            // Quarter 1, Lesson 10, Activity 1
            "1_10_1" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding item in Column A."
                tvExample.text = "1.23 x 0.4 = 0.492\n 0.11 x 0.1 = 0.011 \n 1.23 x 1.23 = 1.5129 (NOT ROUND OFF)"
            }

            // Quarter 1, Lesson 10, Activity 2
            "1_10_2" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS UP TO 2 DECIMAL PLACES BY 0.1, 0.01, 10, AND 100"
                tvDirection.text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A."
                tvExample.text = "0.11 x 0.1 = 0.011\n 0.11 x 0.01 = 0.0011 (NOT ROUND OFF) \n 0.11 x 10 = 1.1 \n 0.11 x 100 = 11\n"
            }

            // Quarter 1, Lesson 11, Activity 1
            "1_11_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION OF DECIMALS AND MIXED DECIMALS, INCLUDING MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 11, Activity 2
            "1_11_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION OF DECIMALS AND MIXED DECIMALS, INCLUDING MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 12, Activity 1
            "1_12_1" -> {
                tvTitleContent.text = "SOLVE MULTI-STEP PROBLEMS, INCLUDING MULTIPLYING, ADDING, OR SUBTRACTING DECIMALS, MIXED DECIMALS, AND WHOLE NUMBERS, SUCH AS THOSE RELATED TO MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 12, Activity 2
            "1_12_2" -> {
                tvTitleContent.text = "SOLVE MULTI-STEP PROBLEMS, INCLUDING MULTIPLYING, ADDING, OR SUBTRACTING DECIMALS, MIXED DECIMALS, AND WHOLE NUMBERS, SUCH AS THOSE RELATED TO MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 13, Activity 1
            "1_13_1" -> {
                tvTitleContent.text = "DIVIDE WHOLE NUMBERS BY DECIMALS (UP TO TWO DECIMAL PLACES), DECIMALS BY WHOLE NUMBERS, AND MIXED DECIMALS (UP TO TWO DECIMAL PLACES)"
                tvDirection.text = "Solve the given decimals and select the correct answer by dragging and dropping it into the box provided."
                tvExample.text = "9 ÷ 0.22 = 40.9090909091 = 40.909 (Rounded off)\n 0.01 ÷ 1 = 0.01 \n 0.01 ÷ 2.01 = 0.0049751243781095 = 0.005 (Rounded off)"
            }

            // Quarter 1, Lesson 13, Activity 2
            "1_13_2" -> {
                tvTitleContent.text = "DIVIDE WHOLE NUMBERS BY DECIMALS (UP TO TWO DECIMAL PLACES), DECIMALS BY WHOLE NUMBERS, AND MIXED DECIMALS (UP TO TWO DECIMAL PLACES)"
                tvDirection.text = "Solve the following decimals provided. Select the correct answer from Column B and cross-match it with the appropriate option in Column A."
                tvExample.text = "9 ÷ 0.22 = 40.9090909091 = 40.909 (Rounded off)\n 0.01 ÷ 1 = 0.01 \n 0.01 ÷ 2.01 = 0.0049751243781095 = 0.005 (Rounded off)"
            }

            // Quarter 1, Lesson 14, Activity 1
            "1_14_1" -> {
                tvTitleContent.text = "DIVIDE DECIMALS WITH UP TO FOUR DECIMAL PLACES BY 0.1, 0.01"
                tvDirection.text = "Solve the given decimals and choose the right answer from the provided choices."
                tvExample.text = "0.1111 ÷ 0.1 = 1.111\n 0.1111 ÷ 0.01 = 11.11 \n 0.1111 ÷  0.001 = 111.1"
            }

            // Quarter 1, Lesson 14, Activity 2
            "1_14_2" -> {
                tvTitleContent.text = "DIVIDE DECIMALS WITH UP TO TWO DECIMAL PLACES BY 10, 100, AND 1,000"
                tvDirection.text = "Solve the following decimals provided. Choose the right answer from column B and drag and drop it into the box provided in column A."
                tvExample.text = "0.11 ÷ 10 = 0.011\n 0.11 ÷ 100 = 0.0011 = 0.001 (Rounded Off) \n 0.11 ÷ 1000 = 0.00011 = 0 (Rounded Off)"
            }

            // Quarter 1, Lesson 15, Activity 1
            "1_15_1" -> {
                tvTitleContent.text = "IDENTIFYING RATIONAL AND IRRATIONAL NUMBERS"
                tvDirection.text = "Examine the given numbers and determine whether each number is rational or irrational. Select the correct answer for each."
                tvExample.text = "100/1000 = RATIONAL \n √100 = IRRATIONAL"
            }

            // Quarter 1, Lesson 15, Activity 2
            "1_15_2" -> {
                tvTitleContent.text = "IDENTIFYING TERMINATING AND REPEATING (NON-TERMINATING) DECIMALS"
                tvDirection.text = "Examine the given decimals and determine whether they are terminating or repeating (non-terminating). Choose TRUE if the given answer is correct and FALSE if it is incorrect."
                tvExample.text = "0.001 TERMINATING = TRUE \n 0.0001… REPEATING = FALSE"
            }

            // Quarter 1, Lesson 16, Activity 1
            "1_16_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 16, Activity 2
            "1_16_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 17, Activity 1
            "1_17_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE INVOLVING ANY OF THE OPERATIONS INCLUDING ANY DECIMALS, WHOLE NUMBERS, AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
            }

            // Quarter 1, Lesson 17, Activity 2
            "1_17_2" -> {
                tvTitleContent.text = "WORD PROBLEM TO EQUATION"
                tvDirection.text = "Read and analyze the given word problem then change it into an equation. Choose the correct answer for its equation."
                tvExample.text = "Word problem: I am thinking of a number. Four times my number plus 12 equals 60. What is my number? \n" +
                        "Change it into equation: 4× +12 = 60"
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
            ActivityType.WIRE_MATCHING -> WireMatchingFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
            ActivityType.ROUTINE_PROBLEM -> RoutineProblemFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
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