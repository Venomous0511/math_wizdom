package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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
    private lateinit var tvCountdown: TextView
    private lateinit var ivAnimal: ImageView
    private lateinit var btnStart: MaterialButton
    private lateinit var btnBack: ImageButton
    private lateinit var ivGuide: ImageView

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

        fun getDirectionText(quarter: Int, lessonNumber: Int, activityNumber: Int): String {
            return when ("${quarter}_${lessonNumber}_${activityNumber}") {
                // Quarter 1
                "1_1_1" -> "Check each pair of fractions. Choose SIMILAR if the denominators are the same; DISSIMILAR if they are different."
                "1_1_2" -> "Solve the fractions in Column A, then match each answer with the correct one in Column B."
                "1_2_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_2_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_3_1" -> "Solve each fraction. Choose TRUE if the answer is correct and FALSE if it is not."
                "1_3_2" -> "Solve the given fractions and choose the right answer from the provided options."
                "1_4_1" -> "Examine each phrase and identify its correct expression. Drag the matching expression to the space next to the phrase."
                "1_4_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_5_1" -> "Solve each fraction in Column A, then find and match the correct answer from Column B."
                "1_5_2" -> "Find the correct answer for each fraction and drag it into the box."
                "1_6_1" -> "Read the word problem carefully. Decide if it uses division. Write TRUE if it does, and FALSE if it does not."
                "1_6_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_7_1" -> "Solve each fraction problem. Check if the given answer is correct. Write TRUE if it is correct, and FALSE if it is not."
                "1_7_2" -> "Solve the decimal problems in Column A. Choose the correct answer from Column B and drag it to the matching box in Column A."
                "1_8_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_8_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_9_1" -> "Solve the decimal problems. Choose the correct answer from the given choices."
                "1_9_2" -> "Solve the decimal problems in Column A. Choose the correct answer from Column B and match it with the correct item in Column A."
                "1_10_1" -> "Solve each decimal problem. Check if the given answer is correct. Write TRUE if it is correct and FALSE if it is not."
                "1_10_2" -> "Solve the decimal problems in Column A. Choose the correct answer from Column B and drag it to the matching box in Column A."
                "1_11_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_11_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_12_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_12_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_13_1" -> "Solve the decimal problems. Drag and drop the correct answer into the box provided."
                "1_13_2" -> "Solve the decimal problems. Choose the correct answer from Column B and match it with the correct item in Column A."
                "1_14_1" -> "Solve the decimal problems. Pick the correct answer from the choices given."
                "1_14_2" -> "Solve the decimal problems in Column A. Choose the correct answer from Column B and drag it into the matching box in Column A."
                "1_15_1" -> "Look at each number. Decide if it is rational or irrational. Choose the correct answer for each."
                "1_15_2" -> "Look at each decimal and decide if it is terminating or repeating. Write TRUE if the given answer is correct, FALSE if not."
                "1_16_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_16_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_17_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "1_17_2" -> "Read the word problem carefully. Change it into an equation and choose the correct equation as your answer."

                // Quarter 2
                "2_1_1" -> "Look at each pair of figures, find their ratio in colon form (A : B), and choose the correct answer."
                "2_1_2" -> "Look at each pair of figures, find their ratio in fraction form (A⁄B), and choose the correct answer."
                "2_2_1" -> "Read each word problem carefully. Decide if it shows a Direct, Inverse, or Partitive proportion. Choose the correct answer for each."
                "2_2_2" -> "Read the problem carefully. Decide if it shows a Proportion or Not a Proportion. Choose the correct answer."
                "2_3_1" -> "Look at the highlighted value in the problem. Decide if it is the Rate, Base, or Percentage. Choose the correct answer."
                "2_3_2" -> "Read the problem carefully. Solve it and choose the correct answer from the options provided."
                "2_4_1" -> "Read the problem carefully. Solve it step by step and choose the correct answer from the given options."
                "2_4_2" -> "Read the problem and the question carefully. Decide if the statement is TRUE or FALSE."
                "2_5_1" -> "Look at the given exponent and calculate its value. Choose the correct answer from Column B and drag it into the matching box in Column A."
                "2_5_2" -> "Solve each problem carefully, then choose the correct answer from the options provided."
                "2_6_1" -> "Look at each exponent and find its value. Drag the correct answer to the matching space for each exponent."
                "2_6_2" -> "Solve the problem carefully. Check if the given answer is correct. Write TRUE if it is correct, and FALSE if it is not."
                "2_7_1" -> "Look at the given integer. Decide if it is POSITIVE or NEGATIVE. Choose the correct answer."
                "2_7_2" -> "Solve the given numbers. Decide if they are opposite numbers or not. Choose the correct answer."
                "2_8_1" -> "Look at the given pair of integers. Identify how they are written and choose the correct answer from the options."
                "2_8_2" -> "Look at each pair of integers. Decide the correct comparison operator (> or <) and choose the right answer from the options."
                "2_9_1" -> "Solve the given pair of integers. Then, choose the correct answer from the options provided."
                "2_9_2" -> "Solve the given integers carefully. Then, choose the correct answer from the options."
                "2_10_1" -> "Read the problem carefully. Solve it on your own, then check if the given answer is correct. Write TRUE if it is correct, and FALSE if it is not."
                "2_10_2" -> "Solve the given integers. Choose the correct answer from Column B and match it with the correct item in Column A."
                "2_11_1" -> "Solve the given integers. Drag and drop the correct answer into the box provided."
                "2_11_2" -> "Solve the integers in Column A. Then, choose the correct answer from Column B and drag it into the matching box in Column A."

                // Quarter 3
                "3_1_1" -> "Examine each figure carefully and choose whether it is a plane figure or a solid figure."
                "3_1_2" -> "Carefully examine each figure and read the question, then answer Yes or No."
                "3_2_1" -> "Find the missing number in the sequence, then choose the correct answer from the options."
                "3_2_2" -> "Find the missing number in each sequence. Then choose the correct answer from Column B and place it in the matching box in Column A."
                "3_3_1" -> "Look at the given mathematical statement and identify whether it is an expression or an equation."
                "3_3_2" -> "Examine the highlighted part of each expression and identify whether it is a coefficient, variable, or constant."
                "3_4_1" -> "Examine the given then identify if it is algebraic EQUATION or EXPRESSION."
                "3_4_2" -> "Solve the given equation and select the correct answer from the choices provided."
                "3_5_1" -> "Examine each problem and choose the right answer from the given choices."
                "3_5_2" -> "Look at the highlighted part and identify whether it is the rate, base, or percentage."
                "3_6_1" -> "Examine each problem and find its area. Choose the correct answer from the given options."
                "3_6_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "3_7_1" -> "Examine the picture and answer each question. Choose the correct option from the given choices."
                "3_7_2" -> "Examine the given shape and answer the question by choosing True or False."
                "3_8_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "3_8_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."

                // Quarter 4
                "4_1_1" -> "Read the problem, solve it, and choose the correct answer from the given choices."
                "4_1_2" -> "Read the problem, solve it, and decide if the given answer is correct. Choose True or False."
                "4_2_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "4_2_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "4_3_1" -> "Look at the meter, examine it, and choose the correct reading from the multiple-choice options."
                "4_3_2" -> "Check the meter, calculate consumption, and match Column A to its answer in Column B."
                "4_4_1" -> "Find the angle for each section using the pie graph and choose the correct answer from the options."
                "4_4_2" -> "Read the question, examine the pie graph, express the results as a fraction, and choose the correct answer."
                "4_5_1" -> "Examine the pie graph and answer the questions using the data shown."
                "4_5_2" -> "Examine the pie graph and answer the questions using the data shown."
                "4_6_1" -> "Examine the situation and choose the correct answer: Certain, Most Likely, Likely, Unlikely, or Most Unlikely."
                "4_6_2" -> "Examine the situation and decide if it is True or False."
                "4_7_1" -> "Examine the problem and choose the number of possible outcomes."
                "4_7_2" -> "Examine the lists and diagrams and find the number of possible outcomes."
                "4_8_1" -> "Examine the situation and decide if it is Most Likely or Unlikely to happen."
                "4_8_2" -> "Examine the situation and decide if it shows Theoretical Probability or Experimental Probability."
                "4_9_1" -> "Read and analyze the word problem, then answer the questions on your paper step by step."
                "4_9_2" -> "Read and analyze the word problem, then answer the questions on your paper step by step."

                else -> "Read each question carefully and follow the instructions."
            }
        }

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
        tvCountdown = view.findViewById(R.id.tvCountdown)
        ivAnimal = view.findViewById(R.id.ivAnimal)
        btnBack = view.findViewById(R.id.btnBack)
        ivGuide = view.findViewById(R.id.ivGuide)
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
                //ivGuide.setImageResource(R.drawable.guide_1_1_1)
            }

            // Quarter 1, Lesson 1, Activity 2
            "1_1_2" -> {
                tvTitleContent.text = "ADDS AND SUBTRACTS SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the fractions listed in Column A. Then, choose the correct answer from Column B and drag it into the corresponding box in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_1_2)
            }

            // Quarter 1, Lesson 2, Activity 1
            "1_2_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING ADDITION OF FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_2_1)
            }

            // Quarter 1, Lesson 2, Activity 2
            "1_2_2" -> {
                tvTitleContent.text = "SOLVE NON-ROUTINE PROBLEMS INVOLVING SUBTRACTION OF FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_2_2)
            }

            // Quarter 1, Lesson 3, Activity 1
            "1_3_1" -> {
                tvTitleContent.text = "MULTIPLY SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and determine whether each answer provided is correct or not. Choose TRUE if the answer is correct and FALSE if it is incorrect."
                //ivGuide.setImageResource(R.drawable.guide_1_3_1)
            }

            // Quarter 1, Lesson 3, Activity 2
            "1_3_2" -> {
                tvTitleContent.text = "MULTIPLY SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and choose the right answer from the provided options."
                //ivGuide.setImageResource(R.drawable.guide_1_3_2)
            }

            // Quarter 1, Lesson 4, Activity 1
            "1_4_1" -> {
                tvTitleContent.text = "MATHEMATICAL EXPRESSION"
                tvDirection.text = "Examine the given mathematical phrases and determine their correct expressions. Drag the correct expression to match its corresponding mathematical phrase in the space provided."
                //ivGuide.setImageResource(R.drawable.guide_1_4_1)
            }

            // Quarter 1, Lesson 4, Activity 2
            "1_4_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE OR NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION, WITHOUT OR WITH SUBTRACTION OF FRACTIONS AND MIXED FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_4_2)
            }

            // Quarter 1, Lesson 5, Activity 1
            "1_5_1" -> {
                tvTitleContent.text = "DIVIDE SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding fraction in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_5_1)
            }

            // Quarter 1, Lesson 5, Activity 2
            "1_5_2" -> {
                tvTitleContent.text = "DIVIDES SIMPLE AND MIXED FRACTIONS"
                tvDirection.text = "Solve the given fractions and select the correct answer by dragging and dropping it into the box provided."
                //ivGuide.setImageResource(R.drawable.guide_1_5_2)
            }

            // Quarter 1, Lesson 6, Activity 1
            "1_6_1" -> {
                tvTitleContent.text = "TERMS IN DIVISION"
                tvDirection.text = "Analyze the given word problem and determine whether it contains terms related to division. Choose TRUE if it does, and FALSE if it does not."
                //ivGuide.setImageResource(R.drawable.guide_1_6_1)
            }

            // Quarter 1, Lesson 6, Activity 2
            "1_6_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE OR NON-ROUTINE PROBLEMS INVOLVING DIVISION, WITHOUT OR WITH SUBTRACTION OF FRACTIONS AND MIXED FRACTIONS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_6_2)
            }

            // Quarter 1, Lesson 7, Activity 1
            "1_7_1" -> {
                tvTitleContent.text = "ADDS DECIMALS AND MIXED DECIMALS THROUGH TEN THOUSANDTHS"
                tvDirection.text = "Solve the given fractions and determine whether each answer is correct or not. Choose TRUE if the answer is correct and FALSE if it is incorrect."
                //ivGuide.setImageResource(R.drawable.guide_1_7_1)
            }

            // Quarter 1, Lesson 7, Activity 2
            "1_7_2" -> {
                tvTitleContent.text = "SUBTRACTS DECIMALS AND MIXED DECIMALS THROUGH TEN THOUSANDTHS"
                tvDirection.text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_7_2)
            }

            // Quarter 1, Lesson 8, Activity 1
            "1_8_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING ADDITION OF DECIMALS AND MIXED DECIMALS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_8_1)
            }

            // Quarter 1, Lesson 8, Activity 2
            "1_8_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING SUBTRACTION OF DECIMALS"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_8_2)
            }

            // Quarter 1, Lesson 9, Activity 1
            "1_9_1" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals and choose the right answer from the provided options."
                //ivGuide.setImageResource(R.drawable.guide_1_9_1)
            }

            // Quarter 1, Lesson 9, Activity 2
            "1_9_2" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding item in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_9_2)
            }

            // Quarter 1, Lesson 10, Activity 1
            "1_10_1" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS AND MIXED DECIMALS WITH UP TO 2 DECIMAL PLACES"
                tvDirection.text = "Solve the given decimals in Column A. Then, choose the correct answer from Column B and cross-match it with its corresponding item in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_10_1)
            }

            // Quarter 1, Lesson 10, Activity 2
            "1_10_2" -> {
                tvTitleContent.text = "MULTIPLY DECIMALS UP TO 2 DECIMAL PLACES BY 0.1, 0.01, 10, AND 100"
                tvDirection.text = "Solve the given decimals in Column A. Then, select the correct answer from Column B and drag it to the corresponding box in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_10_2)
            }

            // Quarter 1, Lesson 11, Activity 1
            "1_11_1" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION OF DECIMALS AND MIXED DECIMALS, INCLUDING MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_11_1)
            }

            // Quarter 1, Lesson 11, Activity 2
            "1_11_2" -> {
                tvTitleContent.text = "SOLVE ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING MULTIPLICATION OF DECIMALS AND MIXED DECIMALS, INCLUDING MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_11_2)
            }

            // Quarter 1, Lesson 12, Activity 1
            "1_12_1" -> {
                tvTitleContent.text = "SOLVE MULTI-STEP PROBLEMS, INCLUDING MULTIPLYING, ADDING, OR SUBTRACTING DECIMALS, MIXED DECIMALS, AND WHOLE NUMBERS, SUCH AS THOSE RELATED TO MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_12_1)
            }

            // Quarter 1, Lesson 12, Activity 2
            "1_12_2" -> {
                tvTitleContent.text = "SOLVE MULTI-STEP PROBLEMS, INCLUDING MULTIPLYING, ADDING, OR SUBTRACTING DECIMALS, MIXED DECIMALS, AND WHOLE NUMBERS, SUCH AS THOSE RELATED TO MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_12_2)
            }

            // Quarter 1, Lesson 13, Activity 1
            "1_13_1" -> {
                tvTitleContent.text = "DIVIDE WHOLE NUMBERS BY DECIMALS (UP TO TWO DECIMAL PLACES), DECIMALS BY WHOLE NUMBERS, AND MIXED DECIMALS (UP TO TWO DECIMAL PLACES)"
                tvDirection.text = "Solve the given decimals and select the correct answer by dragging and dropping it into the box provided."
                //ivGuide.setImageResource(R.drawable.guide_1_13_1)
            }

            // Quarter 1, Lesson 13, Activity 2
            "1_13_2" -> {
                tvTitleContent.text = "DIVIDE WHOLE NUMBERS BY DECIMALS (UP TO TWO DECIMAL PLACES), DECIMALS BY WHOLE NUMBERS, AND MIXED DECIMALS (UP TO TWO DECIMAL PLACES)"
                tvDirection.text = "Solve the following decimals provided. Select the correct answer from Column B and cross-match it with the appropriate option in Column A."
                //ivGuide.setImageResource(R.drawable.guide_1_13_2)
            }

            // Quarter 1, Lesson 14, Activity 1
            "1_14_1" -> {
                tvTitleContent.text = "DIVIDE DECIMALS WITH UP TO FOUR DECIMAL PLACES BY 0.1, 0.01"
                tvDirection.text = "Solve the given decimals and choose the right answer from the provided choices."
                //ivGuide.setImageResource(R.drawable.guide_1_14_1)
            }

            // Quarter 1, Lesson 14, Activity 2
            "1_14_2" -> {
                tvTitleContent.text = "DIVIDE DECIMALS WITH UP TO TWO DECIMAL PLACES BY 10, 100, AND 1,000"
                tvDirection.text = "Solve the following decimals provided. Choose the right answer from column B and drag and drop it into the box provided in column A."
                //ivGuide.setImageResource(R.drawable.guide_1_14_2)
            }

            // Quarter 1, Lesson 15, Activity 1
            "1_15_1" -> {
                tvTitleContent.text = "IDENTIFYING RATIONAL AND IRRATIONAL NUMBERS"
                tvDirection.text = "Examine the given numbers and determine whether each number is rational or irrational. Select the correct answer for each."
                //ivGuide.setImageResource(R.drawable.guide_1_15_1)
            }

            // Quarter 1, Lesson 15, Activity 2
            "1_15_2" -> {
                tvTitleContent.text = "IDENTIFYING TERMINATING AND REPEATING (NON-TERMINATING) DECIMALS"
                tvDirection.text = "Examine the given decimals and determine whether they are terminating or repeating (non-terminating). Choose TRUE if the given answer is correct and FALSE if it is incorrect."
                //ivGuide.setImageResource(R.drawable.guide_1_15_2)
            }

            // Quarter 1, Lesson 16, Activity 1
            "1_16_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_16_1)
            }

            // Quarter 1, Lesson 16, Activity 2
            "1_16_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_16_2)
            }

            // Quarter 1, Lesson 17, Activity 1
            "1_17_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE INVOLVING ANY OF THE OPERATIONS INCLUDING ANY DECIMALS, WHOLE NUMBERS, AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_1_17_1)
            }

            // Quarter 1, Lesson 17, Activity 2
            "1_17_2" -> {
                tvTitleContent.text = "WORD PROBLEM TO EQUATION"
                tvDirection.text = "Read and analyze the given word problem then change it into an equation. Choose the correct answer for its equation."
                //ivGuide.setImageResource(R.drawable.guide_1_17_2)
            }

            // Quarter 2, Lesson 1, Activity 1
            "2_1_1" -> {
                tvTitleContent.text = "FINDING THE RATIO IN COLON FORM"
                tvDirection.text = "Examine each pair of figures and determine their ratio in colon form (A:B). Compare the quantities carefully, then choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_1_1)
            }

            // Quarter 2, Lesson 1, Activity 2
            "2_1_2" -> {
                tvTitleContent.text = "FINDING THE RATIO IN FRACTION FORM"
                tvDirection.text = "Examine each pair of figures and determine their ratio in fraction form (A/B). Compare the quantities carefully, then choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_1_2)
            }

            // Quarter 2, Lesson 2, Activity 1
            "2_2_1" -> {
                tvTitleContent.text = "IDENTIFYING THE TYPE OF PROPORTION"
                tvDirection.text = "Read each word problem carefully and identify whether it shows a Direct, Inverse, or Partitive proportion. Select the correct answer for each item."
                //ivGuide.setImageResource(R.drawable.guide_2_2_1)
            }

            // Quarter 2, Lesson 2, Activity 2
            "2_2_2" -> {
                tvTitleContent.text = "ANALYZE IF PROPORTION"
                tvDirection.text = "Read the given problem carefully and decide whether it shows a Proportion or Not Proportion. Select the correct answer."
                //ivGuide.setImageResource(R.drawable.guide_2_2_2)
            }

            // Quarter 2, Lesson 3, Activity 1
            "2_3_1" -> {
                tvTitleContent.text = "IDENTIFYING PERCENTAGE, RATE AND BASE"
                tvDirection.text = "Examine the highlighted value in the problem and identify whether it represents the Rate, Base, or Percentage. Select the correct answer."
                //ivGuide.setImageResource(R.drawable.guide_2_3_1)
            }

            // Quarter 2, Lesson 3, Activity 2
            "2_3_2" -> {
                tvTitleContent.text = "SOLVING PERCENTAGE, RATE AND BASE"
                tvDirection.text = "Read the problem carefully, find the solution, and choose the correct answer from the given options."
                //ivGuide.setImageResource(R.drawable.guide_2_3_2)
            }

            // Quarter 2, Lesson 4, Activity 1
            "2_4_1" -> {
                tvTitleContent.text = "SOLVING DISCOUNT AMOUNT, SALE PRICE, DISCOUNT RATE, AND ORIGINAL PRICE"
                tvDirection.text = "Carefully study the given problem, solve it step by step, and choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_4_1)
            }

            // Quarter 2, Lesson 4, Activity 2
            "2_4_2" -> {
                tvTitleContent.text = "SOLVING MARKUP PRICE, COMMISSION, SALES TAX, SIMPLE INTEREST, PRINCIPAL"
                tvDirection.text = "Examine the given problem and the question carefully. Determine whether it's True or False."
                //ivGuide.setImageResource(R.drawable.guide_2_4_2)
            }

            // Quarter 2, Lesson 5, Activity 1
            "2_5_1" -> {
                tvTitleContent.text = "COMPUTING THE VALUE OF NUMBERS EXPRESSED IN EXPONENTIAL FORM"
                tvDirection.text = "Carefully analyze the given exponent and compute. Choose the right answer from column B, and drag and drop the right answer into the box provided in column A."
                //ivGuide.setImageResource(R.drawable.guide_2_5_1)
            }

            // Quarter 2, Lesson 5, Activity 2
            "2_5_2" -> {
                tvTitleContent.text = "DESCRIBING AND GIVING THE VALUE OF NUMBERS EXPRESSED IN EXPONENTIAL FORM"
                tvDirection.text = "Carefully work through each problem, then choose the correct answer from the given options."
                //ivGuide.setImageResource(R.drawable.guide_2_5_2)
            }

            // Quarter 2, Lesson 6, Activity 1
            "2_6_1" -> {
                tvTitleContent.text = "COMPUTING EXPONENTS"
                tvDirection.text = "Observe the given exponents and choose the correct answer for each. Drag the correct answer to match its corresponding exponent in the space provided."
                //ivGuide.setImageResource(R.drawable.guide_2_6_1)
            }

            // Quarter 2, Lesson 6, Activity 2
            "2_6_2" -> {
                tvTitleContent.text = "SOLVING EXPONENTS WITH THE OPERATION OF PEMDAS"
                tvDirection.text = "Carefully solve the given problem and check if the provided answer is correct. Then, choose True if it's right or False if it's wrong."
                //ivGuide.setImageResource(R.drawable.guide_2_6_2)
            }

            // Quarter 2, Lesson 7, Activity 1
            "2_7_1" -> {
                tvTitleContent.text = "KNOW THE INTEGER"
                tvDirection.text = "Examine the given integer and decide whether it is POSITIVE or NEGATIVE. Select the correct answer."
                //ivGuide.setImageResource(R.drawable.guide_2_7_1)
            }

            // Quarter 2, Lesson 7, Activity 2
            "2_7_2" -> {
                tvTitleContent.text = "EXAMINE IF OPPOSITE NUMBERS"
                tvDirection.text = "Solve the given numbers and identify whether they are opposite numbers or not opposite numbers. Select the correct answer."
                //ivGuide.setImageResource(R.drawable.guide_2_7_2)
            }

            // Quarter 2, Lesson 8, Activity 1
            "2_8_1" -> {
                tvTitleContent.text = "INTEGER WRITTEN AS?"
                tvDirection.text = "Examine the given pair of integers and identify how they are written. Choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_8_1)
            }

            // Quarter 2, Lesson 8, Activity 2
            "2_8_2" -> {
                tvTitleContent.text = "COMPARISON OPERATOR"
                tvDirection.text = "Examine the given pair of integers and identify the correct comparison operator (> or <). Choose the correct answer for each pair from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_8_2)
            }

            // Quarter 2, Lesson 9, Activity 1
            "2_9_1" -> {
                tvTitleContent.text = "ADDING AND SUBTRACTING INTEGERS"
                tvDirection.text = "Calculate the given pair of integers, then choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_9_1)
            }

            // Quarter 2, Lesson 9, Activity 2
            "2_9_2" -> {
                tvTitleContent.text = "ADDING AND SUBTRACTING INTEGERS"
                tvDirection.text = "Carefully solve the given integers, then choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_2_9_2)
            }

            // Quarter 2, Lesson 10, Activity 1
            "2_10_1" -> {
                tvTitleContent.text = "COMPUTING INTEGERS IN ALL OPERATIONS"
                tvDirection.text = "Carefully examine the given problem. Solve it on your own, then check if the provided answer is correct. Choose whether it is TRUE or FALSE based on your calculation."
                //ivGuide.setImageResource(R.drawable.guide_2_10_1)
            }

            // Quarter 2, Lesson 10, Activity 2
            "2_10_2" -> {
                tvTitleContent.text = "SOLVE INTEGERS IN ALL OPERATIONS"
                tvDirection.text = "Calculate the given integers, select the correct answer from Column B and cross-match it with the appropriate option in Column A."
                //ivGuide.setImageResource(R.drawable.guide_2_10_2)
            }

            // Quarter 2, Lesson 11, Activity 1
            "2_11_1" -> {
                tvTitleContent.text = "SOLVE INTEGERS INVOLVING BASIC OPERATIONS"
                tvDirection.text = "Solve the given integers and choose the correct answer by dragging and dropping it into the box provided."
                //ivGuide.setImageResource(R.drawable.guide_2_11_1)
            }

            // Quarter 2, Lesson 11, Activity 2
            "2_11_2" -> {
                tvTitleContent.text = "SOLVE INTEGERS INVOLVING BASIC OPERATIONS"
                tvDirection.text = "Solve the given integers in Column A. Then, select the correct answer from Column B and drag it into the corresponding box in Column A."
                //ivGuide.setImageResource(R.drawable.guide_2_11_2)
            }

            // Quarter 3, Lesson 1, Activity 1
            "3_1_1" -> {
                tvTitleContent.text = "EXAMINE THE FIGURES"
                tvDirection.text = "Examine each figure carefully and choose whether it is a plane figure or a solid figure."
                //ivGuide.setImageResource(R.drawable.guide_3_1_1)
            }

            // Quarter 3, Lesson 1, Activity 2
            "3_1_2" -> {
                tvTitleContent.text = "KNOW THE FIGURES"
                tvDirection.text = "Carefully examine each figure and read the question, then answer Yes or No."
                //ivGuide.setImageResource(R.drawable.guide_3_1_2)
            }

            // Quarter 3, Lesson 2, Activity 1
            "3_2_1" -> {
                tvTitleContent.text = "SOLVING SEQUENCE"
                tvDirection.text = "Find the missing number in the sequence, then choose the correct answer from the options."
                //ivGuide.setImageResource(R.drawable.guide_3_2_1)
            }

            // Quarter 3, Lesson 2, Activity 2
            "3_2_2" -> {
                tvTitleContent.text = "COMPLETE THE SEQUENCE"
                tvDirection.text = "Find the missing number in the sequence, then choose the correct answer from Column B and drag it into the matching box in Column A."
                //ivGuide.setImageResource(R.drawable.guide_3_2_2)
            }

            // Quarter 3, Lesson 3, Activity 1
            "3_3_1" -> {
                tvTitleContent.text = "KNOW EXPRESSION AND EQUATION"
                tvDirection.text = "Look at the given mathematical statement and identify whether it is an expression or an equation."
                //ivGuide.setImageResource(R.drawable.guide_3_3_1)
            }

            // Quarter 3, Lesson 3, Activity 2
            "3_3_2" -> {
                tvTitleContent.text = "KNOW COEFFICIENT, VARIABLE, AND CONSTANT"
                tvDirection.text = "Examine the highlighted part of the given expression and determine whether it is a coefficient, variable, or constant."
                //ivGuide.setImageResource(R.drawable.guide_3_3_2)
            }

            // Quarter 3, Lesson 4, Activity 1
            "3_4_1" -> {
                tvTitleContent.text = "ALGEBRAIC EQUATION OR EXPRESSION"
                tvDirection.text = "Examine the given statement and identify if it is an algebraic EQUATION or EXPRESSION."
                //ivGuide.setImageResource(R.drawable.guide_3_4_1)
            }

            // Quarter 3, Lesson 4, Activity 2
            "3_4_2" -> {
                tvTitleContent.text = "SOLVING EQUATION"
                tvDirection.text = "Solve the given equation and select the correct answer from the choices provided."
                //ivGuide.setImageResource(R.drawable.guide_3_4_2)
            }

            // Quarter 3, Lesson 5, Activity 1
            "3_5_1" -> {
                tvTitleContent.text = "COMPUTING THE SPEED"
                tvDirection.text = "Examine each problem and choose the right answer from the given choices."
                //ivGuide.setImageResource(R.drawable.guide_3_5_1)
            }

            // Quarter 3, Lesson 5, Activity 2
            "3_5_2" -> {
                tvTitleContent.text = "SPEED, DISTANCE, AND TIME"
                tvDirection.text = "Look and examine the highlighted part of the given, then identify if it's SPEED, DISTANCE or TIME."
                //ivGuide.setImageResource(R.drawable.guide_3_5_2)
            }

            // Quarter 3, Lesson 6, Activity 1
            "3_6_1" -> {
                tvTitleContent.text = "FIND THE AREA"
                tvDirection.text = "Examine each problem and compute its area. Select the correct answer from the given choices."
                //ivGuide.setImageResource(R.drawable.guide_3_6_1)
            }

            // Quarter 3, Lesson 6, Activity 2
            "3_6_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_3_6_2)
            }

            // Quarter 3, Lesson 7, Activity 1
            "3_7_1" -> {
                tvTitleContent.text = "SOLID FIGURES"
                tvDirection.text = "Examine the given picture and answer each question. Select the correct option from the choices provided."
                //ivGuide.setImageResource(R.drawable.guide_3_7_1)
            }

            // Quarter 3, Lesson 7, Activity 2
            "3_7_2" -> {
                tvTitleContent.text = "SIDES"
                tvDirection.text = "Examine the given shape and answer the question by selecting True or False."
                //ivGuide.setImageResource(R.drawable.guide_3_7_2)
            }

            // Quarter 3, Lesson 8, Activity 1
            "3_8_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_3_8_1)
            }

            // Quarter 3, Lesson 8, Activity 2
            "3_8_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_3_8_2)
            }

            // Quarter 4, Lesson 1, Activity 1
            "4_1_1" -> {
                tvTitleContent.text = "RELATIONSHIP OF VOLUME OF PRISMS AND PYRAMIDS & OTHER 3D FIGURES"
                tvDirection.text = "Read the problem carefully, solve it, and select the correct answer from the given choices."
                //ivGuide.setImageResource(R.drawable.guide_4_1_1)
            }

            // Quarter 4, Lesson 1, Activity 2
            "4_1_2" -> {
                tvTitleContent.text = "RELATIONSHIP OF VOLUME OF PRISMS AND PYRAMIDS & OTHER 3D FIGURES"
                tvDirection.text = "Read the problem carefully, solve it, and check if the given answer is correct. Choose True if it is correct and False if it is incorrect."
                //ivGuide.setImageResource(R.drawable.guide_4_1_2)
            }

            // Quarter 4, Lesson 2, Activity 1
            "4_2_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_4_2_1)
            }

            // Quarter 4, Lesson 2, Activity 2
            "4_2_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_4_2_2)
            }

            // Quarter 4, Lesson 3, Activity 1
            "4_3_1" -> {
                tvTitleContent.text = "READING AND INTERPRETING ELECTRIC AND WATER METER READINGS"
                tvDirection.text = "Examine each meter image carefully and choose the correct reading from the given options."
                //ivGuide.setImageResource(R.drawable.guide_4_3_1)
            }

            // Quarter 4, Lesson 3, Activity 2
            "4_3_2" -> {
                tvTitleContent.text = "READING AND INTERPRETING ELECTRIC AND WATER METER READINGS - CONSUMPTION"
                tvDirection.text = "Calculate the consumption by subtracting the previous reading from the present reading. Match each calculation with its correct answer."
                //ivGuide.setImageResource(R.drawable.guide_4_3_2)
            }

            // Quarter 4, Lesson 4, Activity 1
            "4_4_1" -> {
                tvTitleContent.text = "INTERPRETING PIE GRAPH"
                tvDirection.text = "Find the angle for each section. Answer the question using the given pie graph."
                //ivGuide.setImageResource(R.drawable.guide_4_4_1)
            }

            // Quarter 4, Lesson 4, Activity 2
            "4_4_2" -> {
                tvTitleContent.text = "READING AND INTERPRETING PIE GRAPHS"
                tvDirection.text = "Express the results as a fraction."
                //ivGuide.setImageResource(R.drawable.guide_4_4_2)
            }

            // Quarter 4, Lesson 5, Activity 1
            "4_5_1" -> {
                tvTitleContent.text = "PROBLEM SOLVING INVOLVING DATA IN A PIE GRAPH"
                tvDirection.text = "Read each problem carefully and analyze the pie graph. Answer the questions based on the data shown."
                //ivGuide.setImageResource(R.drawable.guide_4_5_1)
            }

            // Quarter 4, Lesson 5, Activity 2
            "4_5_2" -> {
                tvTitleContent.text = "PROBLEM SOLVING INVOLVING DATA IN A PIE GRAPH"
                tvDirection.text = "Examine the pie graph and answer each question. Choose the correct answer from the options provided."
                //ivGuide.setImageResource(R.drawable.guide_4_5_2)
            }

            // Quarter 4, Lesson 6, Activity 1
            "4_6_1" -> {
                tvTitleContent.text = "PROBABILITY LEVELS"
                tvDirection.text = "Read each statement carefully and determine the probability level. Choose from: Certain, Most Likely, Likely, Unlikely, or Most Unlikely."
                //ivGuide.setImageResource(R.drawable.guide_4_6_1)
            }

            // Quarter 4, Lesson 6, Activity 2
            "4_6_2" -> {
                tvTitleContent.text = "PROBABILITY STATEMENTS"
                tvDirection.text = "Read each probability statement and determine if it is TRUE or FALSE based on the probability level described."
                //ivGuide.setImageResource(R.drawable.guide_4_6_2)
            }

            // Quarter 4, Lesson 7, Activity 1
            "4_7_1" -> {
                tvTitleContent.text = "MAKING LISTS AND DIAGRAMS OF OUTCOMES"
                tvDirection.text = "Read each problem and determine how many different combinations of two items can be made from the given set."
                //ivGuide.setImageResource(R.drawable.guide_4_7_1)
            }

            // Quarter 4, Lesson 7, Activity 2
            "4_7_2" -> {
                tvTitleContent.text = "MAKING LISTS AND DIAGRAMS OF OUTCOMES"
                tvDirection.text = "Look at each diagram carefully and count the total number of possible combinations shown. Choose the correct answer."
                //ivGuide.setImageResource(R.drawable.guide_4_7_2)
            }

            // Quarter 4, Lesson 8, Activity 1
            "4_8_1" -> {
                tvTitleContent.text = "MAKES SIMPLE PREDICTIONS OF EVENTS BASED ON RESULTS OF EXPERIMENTS"
                tvDirection.text = "Read each statement and determine if it is 'Most likely to happen' or 'Unlikely to occur' based on probability and real-world likelihood."
                //ivGuide.setImageResource(R.drawable.guide_4_8_1)
            }

            // Quarter 4, Lesson 8, Activity 2
            "4_8_2" -> {
                tvTitleContent.text = "MAKES SIMPLE PREDICTIONS OF EVENTS BASED ON RESULTS OF EXPERIMENTS"
                tvDirection.text = "Read each probability question and identify if it is asking for Theoretical Probability or Experimental Probability."
                //ivGuide.setImageResource(R.drawable.guide_4_8_2)
            }

            // Quarter 4, Lesson 2, Activity 1
            "4_9_1" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_4_9_1)
            }

            // Quarter 4, Lesson 2, Activity 2
            "4_9_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                //ivGuide.setImageResource(R.drawable.guide_4_9_2)
            }

            else -> {
                tvTitleContent.text = activity.title.uppercase()
                tvDirection.text = "Complete the activity by following the instructions for each question."
                ivGuide.setImageResource(R.drawable.ic_placeholder)
            }
        }
    }

    private fun setupListeners() {
        btnStart.setOnClickListener {
            btnStart.visibility = View.GONE
            tvCountdown.visibility = View.VISIBLE
            btnSkip.visibility = View.VISIBLE
            startCountdown()
        }

        btnSkip.setOnClickListener {
            timer?.cancel()
            startActivity()
        }

        btnBack.setOnClickListener {
            @Suppress("DEPRECATION")
            requireActivity().onBackPressed()
        }
    }

    private fun startCountdown() {
        timer = object : CountDownTimer(COUNTDOWN_TIME, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = (millisUntilFinished / 1000).toInt()
                tvCountdown.text = "Starting in $secondsRemaining..."
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