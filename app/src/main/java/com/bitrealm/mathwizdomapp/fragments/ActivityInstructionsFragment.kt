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

            // Quarter 2, Lesson 1, Activity 1
            "2_1_1" -> {
                tvTitleContent.text = "FINDING THE RATIO IN COLON FORM"
                tvDirection.text = "Examine each pair of figures and determine their ratio in colon form (A:B). Compare the quantities carefully, then choose the correct answer from the options provided."
                tvExample.text = "Ratio of sun to moon:\n☀️☀️☀️ 🌙\nColon form: 3:1"
            }

            // Quarter 2, Lesson 1, Activity 2
            "2_1_2" -> {
                tvTitleContent.text = "FINDING THE RATIO IN FRACTION FORM"
                tvDirection.text = "Examine each pair of figures and determine their ratio in fraction form (A/B). Compare the quantities carefully, then choose the correct answer from the options provided."
                tvExample.text = "Ratio of broom to dust pan:\n🧹 🗑️🗑️🗑️\nFraction form: ¹⁄₃"
            }

            // Quarter 2, Lesson 2, Activity 1
            "2_2_1" -> {
                tvTitleContent.text = "IDENTIFYING THE TYPE OF PROPORTION"
                tvDirection.text = "Read each word problem carefully and identify whether it shows a Direct, Inverse, or Partitive proportion. Select the correct answer for each item."
                tvExample.text = "Direct Proportion: More units → More cost (e.g., 5 apples cost more than 3 apples)\n\n" +
                        "Inverse Proportion: More workers → Less time (e.g., 10 workers finish faster than 5 workers)\n\n" +
                        "Partitive Proportion: Dividing a total into parts using ratios (e.g., sharing $100 in ratio 2:3:5)"
            }

            // Quarter 2, Lesson 2, Activity 2
            "2_2_2" -> {
                tvTitleContent.text = "ANALYZE IF PROPORTION"
                tvDirection.text = "Read the given problem carefully and decide whether it shows a Proportion or Not Proportion. Select the correct answer."
                tvExample.text = "PROPORTION:\n⁴⁄₆ , ²⁄₃\n4 × 3 = 6 × 2\n12 = 12 ✓\n\n" +
                        "NOT PROPORTION:\n⁴⁄₆ , ²⁄₅\n4 × 5 = 6 × 2\n20 ≠ 12 ✗"
            }

            // Quarter 2, Lesson 3, Activity 1
            "2_3_1" -> {
                tvTitleContent.text = "IDENTIFYING PERCENTAGE, RATE AND BASE"
                tvDirection.text = "Examine the highlighted value in the problem and identify whether it represents the Rate, Base, or Percentage. Select the correct answer."
                tvExample.text = "The school has 120 boy scouts, as 40% of 300 pupils is 120.\n\n" +
                        "R - 120 (PERCENTAGE)\n" +
                        "B - 40% (RATE)\n" +
                        "P - 300 (BASE)"
            }

            // Quarter 2, Lesson 3, Activity 2
            "2_3_2" -> {
                tvTitleContent.text = "SOLVING PERCENTAGE, RATE AND BASE"
                tvDirection.text = "Read the problem carefully, find the solution, and choose the correct answer from the given options."
                tvExample.text = "FORMULAS:\n\n" +
                        "Finding Base (B):\nB = P/R × 100\n\n" +
                        "Finding Rate (R):\nR = P/B × 100\n\n" +
                        "Finding Percentage (P):\nP = R × B / 100\n\n" +
                        "Where:\nP = Percentage Value\nR = Rate (%)\nB = Base (Total)"
            }

            // Quarter 2, Lesson 4, Activity 1
            "2_4_1" -> {
                tvTitleContent.text = "SOLVING DISCOUNT AMOUNT, SALE PRICE, DISCOUNT RATE, AND ORIGINAL PRICE"
                tvDirection.text = "Carefully study the given problem, solve it step by step, and choose the correct answer from the options provided."
                tvExample.text = "FORMULAS:\n\n" +
                        "Discount Amount:\n= Original Price × Discount Rate\n\n" +
                        "Sale Price:\n= Original Price − Discount Amount\n\n" +
                        "Discount Rate:\n= (Discount Amount / Original Price) × 100\n\n" +
                        "Original Price:\n= Sale Price / (1 − Discount Rate)"
            }

            // Quarter 2, Lesson 4, Activity 2
            "2_4_2" -> {
                tvTitleContent.text = "SOLVING MARKUP PRICE, COMMISSION, SALES TAX, SIMPLE INTEREST, PRINCIPAL"
                tvDirection.text = "Examine the given problem and the question carefully. Determine whether it's True or False."
                tvExample.text = "FORMULAS:\n\n" +
                        "Markup Price:\nSelling Price = Cost + (Cost × Markup %)\n\n" +
                        "Commission:\nCommission = Sales × Rate\n\n" +
                        "Sales Tax:\nTotal = Price + (Price × Tax Rate)\n\n" +
                        "Simple Interest:\nI = P × R × T\n\n" +
                        "Principal:\nP = I / (R × T)"
            }

            // Quarter 2, Lesson 5, Activity 1
            "2_5_1" -> {
                tvTitleContent.text = "COMPUTING THE VALUE OF NUMBERS EXPRESSED IN EXPONENTIAL FORM"
                tvDirection.text = "Carefully analyze the given exponent and compute. Choose the right answer from column B, and drag and drop the right answer into the box provided in column A."
                tvExample.text = "12² = 12 × 12 = 144\n2³ = 2 × 2 × 2 = 8\n3⁴ = 3 × 3 × 3 × 3 = 81"
            }

            // Quarter 2, Lesson 5, Activity 2
            "2_5_2" -> {
                tvTitleContent.text = "DESCRIBING AND GIVING THE VALUE OF NUMBERS EXPRESSED IN EXPONENTIAL FORM"
                tvDirection.text = "Carefully work through each problem, then choose the correct answer from the given options."
                tvExample.text = "4 × 4 × 4 × 4 × 4 = ?\n4⁵ = 4 × 4 × 4 × 4 × 4 = 1024"
            }

            // Quarter 2, Lesson 6, Activity 1
            "2_6_1" -> {
                tvTitleContent.text = "COMPUTING EXPONENTS"
                tvDirection.text = "Observe the given exponents and choose the correct answer for each. Drag the correct answer to match its corresponding exponent in the space provided."
                tvExample.text = "12² = 12 × 12 = 144\n18³ = 18 × 18 × 18 = 5,832\n22⁴ = 22 × 22 × 22 × 22 = 234,256\n5⁵ = 5 × 5 × 5 × 5 × 5 = 3,125"
            }

            // Quarter 2, Lesson 6, Activity 2
            "2_6_2" -> {
                tvTitleContent.text = "SOLVING EXPONENTS WITH THE OPERATION OF PEMDAS"
                tvDirection.text = "Carefully solve the given problem and check if the provided answer is correct. Then, choose True if it's right or False if it's wrong."
                tvExample.text = "1 × 1 = 1 ✓\n11 × 11 × 11 = 1,331 ✓"
            }

            // Quarter 2, Lesson 7, Activity 1
            "2_7_1" -> {
                tvTitleContent.text = "KNOW THE INTEGER"
                tvDirection.text = "Examine the given integer and decide whether it is POSITIVE or NEGATIVE. Select the correct answer."
                tvExample.text = "-81 → NEGATIVE\n81 → POSITIVE"
            }

            // Quarter 2, Lesson 7, Activity 2
            "2_7_2" -> {
                tvTitleContent.text = "EXAMINE IF OPPOSITE NUMBERS"
                tvDirection.text = "Solve the given numbers and identify whether they are opposite numbers or not opposite numbers. Select the correct answer."
                tvExample.text = "-9 + 9 = 0 → OPPOSITE\n14 + (-7) = 7 → NOT OPPOSITE\n\nNote: Opposite numbers sum to zero."
            }

            // Quarter 2, Lesson 8, Activity 1
            "2_8_1" -> {
                tvTitleContent.text = "INTEGER WRITTEN AS?"
                tvDirection.text = "Examine the given pair of integers and identify how they are written. Choose the correct answer from the options provided."
                tvExample.text = "+4 is to the left of +6, written as +4 < +6\n-7 is to the left of -3, written as -7 < -3\n\nRemember: Left = Less than (<)\nRight = Greater than (>)"
            }

            // Quarter 2, Lesson 8, Activity 2
            "2_8_2" -> {
                tvTitleContent.text = "COMPARISON OPERATOR"
                tvDirection.text = "Examine the given pair of integers and identify the correct comparison operator (> or <). Choose the correct answer for each pair from the options provided."
                tvExample.text = "+30 ? +25 → +30 > +25 (+30 is greater than +25)\n-4 ? +2 → -4 < +2 (-4 is less than +2)"
            }

            // Quarter 2, Lesson 9, Activity 1
            "2_9_1" -> {
                tvTitleContent.text = "ADDING AND SUBTRACTING INTEGERS"
                tvDirection.text = "Calculate the given pair of integers, then choose the correct answer from the options provided."
                tvExample.text = "+5 + (-8) = -3\n-7 + 13 = +6\n\nRemember:\n• Adding a negative = Subtract\n• Subtracting a negative = Add"
            }

            // Quarter 2, Lesson 9, Activity 2
            "2_9_2" -> {
                tvTitleContent.text = "ADDING AND SUBTRACTING INTEGERS"
                tvDirection.text = "Carefully solve the given integers, then choose the correct answer from the options provided."
                tvExample.text = "-7 + 12 = 5\n15 - (-8) = 23\n\nRules:\n• Same signs: Add and keep the sign\n• Different signs: Subtract and use the sign of the larger number"
            }

            // Quarter 2, Lesson 10, Activity 1
            "2_10_1" -> {
                tvTitleContent.text = "COMPUTING INTEGERS IN ALL OPERATIONS"
                tvDirection.text = "Carefully examine the given problem. Solve it on your own, then check if the provided answer is correct. Choose whether it is TRUE or FALSE based on your calculation."
                tvExample.text = "Addition: -7 + 4 = -3\nSubtraction: 10 - (-5) = 15\nMultiplication: (-6) × 3 = -18\nDivision: (-16) ÷ 4 = -4\n\nRules:\n• Same signs → Positive result\n• Different signs → Negative result"
            }

            // Quarter 2, Lesson 10, Activity 2
            "2_10_2" -> {
                tvTitleContent.text = "SOLVE INTEGERS IN ALL OPERATIONS"
                tvDirection.text = "Calculate the given integers, select the correct answer from Column B and cross-match it with the appropriate option in Column A."
                tvExample.text = "Operations:\n• Addition: -7 + 4 = -3\n• Subtraction: 10 - (-5) = 15\n• Multiplication: (-6) × 3 = -18\n• Division: (-16) ÷ 4 = -4"
            }

            // Quarter 2, Lesson 11, Activity 1
            "2_11_1" -> {
                tvTitleContent.text = "SOLVE INTEGERS INVOLVING BASIC OPERATIONS"
                tvDirection.text = "Solve the given integers and choose the correct answer by dragging and dropping it into the box provided."
                tvExample.text = "Addition: −7 + 4 = ?\nSubtract: 7 − 4 = 3, keep the sign of the bigger number (7 is negative).\nAnswer: −3\n\n" +
                        "Subtraction: 10 − (−5) = ?\nChange subtraction to addition: 10 + 5.\nAnswer: 15\n\n" +
                        "Multiplication: (−6) × 3 = ?\nMultiply: 6 × 3 = 18, a negative times a positive is negative.\nAnswer: −18\n\n" +
                        "Division: (−16) ÷ 4 = ?\nDivide: 16 ÷ 4 = 4, a negative divided by a positive is negative.\nAnswer: −4"
            }

            // Quarter 2, Lesson 11, Activity 2
            "2_11_2" -> {
                tvTitleContent.text = "SOLVE INTEGERS INVOLVING BASIC OPERATIONS"
                tvDirection.text = "Solve the given integers in Column A. Then, select the correct answer from Column B and drag it into the corresponding box in Column A."
                tvExample.text = "Addition: −7 + 4 = ?\nSubtract: 7 − 4 = 3, keep the sign of the bigger number (7 is negative).\nAnswer: −3\n\n" +
                        "Subtraction: 10 − (−5) = ?\nChange subtraction to addition: 10 + 5.\nAnswer: 15\n\n" +
                        "Multiplication: (−6) × 3 = ?\nMultiply: 6 × 3 = 18, a negative times a positive is negative.\nAnswer: −18\n\n" +
                        "Division: (−16) ÷ 4 = ?\nDivide: 16 ÷ 4 = 4, a negative divided by a positive is negative.\nAnswer: −4"
            }

            // Quarter 3, Lesson 1, Activity 1
            "3_1_1" -> {
                tvTitleContent.text = "EXAMINE THE FIGURES"
                tvDirection.text = "Examine each figure carefully and choose whether it is a plane figure or a solid figure."
                tvExample.text = "Plane Figure: A flat, two-dimensional shape (like a circle, square, or triangle)\n\n" +
                        "Solid Figure: A three-dimensional object with length, width, and height (like a sphere, cube, or cone)"
            }

            // Quarter 3, Lesson 1, Activity 2
            "3_1_2" -> {
                tvTitleContent.text = "KNOW THE FIGURES"
                tvDirection.text = "Carefully examine each figure and read the question, then answer Yes or No."
                tvExample.text = "Look at the image carefully:\n\n" +
                        "• If it's flat (2D) → It's a plane figure\n" +
                        "• If it has depth (3D) → It's a solid figure\n\n" +
                        "Answer the question based on what you see."
            }

            // Quarter 3, Lesson 2, Activity 1
            "3_2_1" -> {
                tvTitleContent.text = "SOLVING SEQUENCE"
                tvDirection.text = "Find the missing number in the sequence, then choose the correct answer from the options."
                tvExample.text = "Look for the pattern:\n\n" +
                        "Example 1: 49, 64, 81, __, 121\n" +
                        "Pattern: n² (squares)\n" +
                        "7² = 49, 8² = 64, 9² = 81, 10² = 100, 11² = 121\n" +
                        "Answer: 100\n\n" +
                        "Example 2: 4, __, 16, 25, 36\n" +
                        "Pattern: n² (squares)\n" +
                        "2² = 4, 3² = 9, 4² = 16, 5² = 25, 6² = 36\n" +
                        "Answer: 9"
            }

            // Quarter 3, Lesson 2, Activity 2
            "3_2_2" -> {
                tvTitleContent.text = "COMPLETE THE SEQUENCE"
                tvDirection.text = "Find the missing number in the sequence, then choose the correct answer from Column B and drag it into the matching box in Column A."
                tvExample.text = "Identify the pattern:\n\n" +
                        "• Arithmetic: Add/subtract the same number\n" +
                        "  (2, 5, 8, 11... → add 3)\n\n" +
                        "• Geometric: Multiply/divide by the same number\n" +
                        "  (2, 4, 8, 16... → multiply by 2)\n\n" +
                        "• Square numbers: n²\n" +
                        "  (1, 4, 9, 16... → 1², 2², 3², 4²...)"
            }

            // Quarter 3, Lesson 3, Activity 1
            "3_3_1" -> {
                tvTitleContent.text = "KNOW EXPRESSION AND EQUATION"
                tvDirection.text = "Look at the given mathematical statement and identify whether it is an expression or an equation."
                tvExample.text = "Expression: 2y - 7 (no equal sign)\nEquation: 5x + 3 = 18 (has equal sign)\n\nAn equation has an equal sign (=), while an expression does not."
            }

            // Quarter 3, Lesson 3, Activity 2
            "3_3_2" -> {
                tvTitleContent.text = "KNOW COEFFICIENT, VARIABLE, AND CONSTANT"
                tvDirection.text = "Examine the highlighted part of the given expression and determine whether it is a coefficient, variable, or constant."
                tvExample.text = "Expression: 2y - 7\n\n" +
                        "Coefficient: 2 (number multiplying variable)\n" +
                        "Variable: y (letter representing unknown)\n" +
                        "Constant: 7 (number alone)\n\n" +
                        "Identify which one is highlighted in red."
            }

            // Quarter 3, Lesson 4, Activity 1
            "3_4_1" -> {
                tvTitleContent.text = "ALGEBRAIC EQUATION OR EXPRESSION"
                tvDirection.text = "Examine the given statement and identify if it is an algebraic EQUATION or EXPRESSION."
                tvExample.text = "Expression: 3x + 4\n(No = sign, so it is an expression)\n\n" +
                        "Equation: 2y − 5 = 7\n(Has = sign, so it is an equation)\n\n" +
                        "Key: Look for the equal sign (=)"
            }

            // Quarter 3, Lesson 4, Activity 2
            "3_4_2" -> {
                tvTitleContent.text = "SOLVING EQUATION"
                tvDirection.text = "Solve the given equation and select the correct answer from the choices provided."
                tvExample.text = "Addition: x + 6 = 14 → Subtract 6 → x = 8\n\n" +
                        "Subtraction: y − 9 = 15 → Add 9 → y = 24\n\n" +
                        "Multiplication: 4z = 32 → Divide by 4 → z = 8\n\n" +
                        "Division: a ÷ 5 = 7 → Multiply by 5 → a = 35"
            }

            // Quarter 3, Lesson 5, Activity 1
            "3_5_1" -> {
                tvTitleContent.text = "COMPUTING THE SPEED"
                tvDirection.text = "Examine each problem and choose the right answer from the given choices."
                tvExample.text = "Formula:\nSpeed = Distance ÷ Time\n\n" +
                        "Example:\nA jeep travels 200 miles in 4 hours.\n" +
                        "Speed = 200 ÷ 4 = 50 miles per hour (mph)\n\n" +
                        "Remember: Speed tells how fast something moves."
            }

            // Quarter 3, Lesson 5, Activity 2
            "3_5_2" -> {
                tvTitleContent.text = "SPEED, DISTANCE, AND TIME"
                tvDirection.text = "Look and examine the highlighted part of the given, then identify if it's SPEED, DISTANCE or TIME."
                tvExample.text = "The car traveled 240 km at a speed of 80 km/h, taking a total time of 3 hours.\n\n" +
                        "Distance: 240 km (how far)\n" +
                        "Speed: 80 km/h (how fast)\n" +
                        "Time: 3 hours (how long)\n\n" +
                        "Identify which one is highlighted in red."
            }

            // Quarter 3, Lesson 6, Activity 1
            "3_6_1" -> {
                tvTitleContent.text = "FIND THE AREA"
                tvDirection.text = "Examine each problem and compute its area. Select the correct answer from the given choices."
                tvExample.text = "Formula for Rectangle:\nArea = Length × Width\n\n" +
                        "Example:\nA swimming pool is 44 meters long and 17 meters wide.\n" +
                        "Area = 44 m × 17 m = 748 m²\n\n" +
                        "Remember: Area measures the space inside a shape."
            }

            // Quarter 3, Lesson 6, Activity 2
            "3_6_2" -> {
                tvTitleContent.text = "ROUTINE AND NON-ROUTINE PROBLEMS INVOLVING DIVISION OF DECIMAL NUMBERS AND MONEY"
                tvDirection.text = "Watch the video carefully read and analyze the word problem, then answer the questions that follow. Write your answers on your paper."
                tvExample.text = "Follow the steps carefully to solve division word problems."
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