package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import androidx.appcompat.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.models.Question
import com.google.android.material.button.MaterialButton
import androidx.core.graphics.toColorInt
import android.widget.LinearLayout

class MultipleChoiceFragment : Fragment() {

    private lateinit var activity: Activity
    private lateinit var questions: MutableList<Question.MultipleChoice>
    private var currentQuestionIndex = 0
    private var correctAnswers = 0
    private var wrongAnswers = 0
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private var isAnswered = false

    // Views
    private lateinit var btnBack: ImageButton
    private lateinit var btnSettings: ImageButton
    private lateinit var tvActivityTitle: TextView
    private lateinit var tvProgress: TextView
    private lateinit var tvQuestion: TextView
    private lateinit var layoutAnswers: LinearLayout
    private lateinit var ivAnimal: ImageView

    private val answerButtons = mutableListOf<MaterialButton>()

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
        private const val QUESTIONS_TO_SHOW = 5

        fun newInstance(
            activity: Activity,
            userIdentifier: String,
            quarter: Int,
            lessonNumber: Int
        ): MultipleChoiceFragment {
            val fragment = MultipleChoiceFragment()
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

        // Always select 5 random questions
        val allQuestions = activity.questions.filterIsInstance<Question.MultipleChoice>()
        questions = allQuestions.shuffled().take(QUESTIONS_TO_SHOW).toMutableList()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.multiple_choice_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        setupListeners()
        loadQuestion()
    }

    @SuppressLint("SetTextI18n")
    private fun initViews(view: View) {
        btnBack = view.findViewById(R.id.btnBack)
        btnSettings = view.findViewById(R.id.btnSettings)
        tvActivityTitle = view.findViewById(R.id.tvActivityTitle)
        tvProgress = view.findViewById(R.id.tvProgress)
        tvQuestion = view.findViewById(R.id.tvQuestion)
        layoutAnswers = view.findViewById(R.id.layoutAnswers)
        ivAnimal = view.findViewById(R.id.ivAnimal)

        tvActivityTitle.text = "ACTIVITY #${activity.activityNumber}"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Exit Activity?")
                .setMessage("Your progress will be lost. Are you sure?")
                .setPositiveButton("Yes") { _, _ ->
                    requireActivity().finish()
                }
                .setNegativeButton("No", null)
                .show()
        }

        btnSettings.setOnClickListener {
            showHelpDialog()
        }
    }

    private fun showHelpDialog() {
        val helpMessage = when {
            activity.title.contains("Similar", ignoreCase = true) ->
                "Fractions are similar if they have the same bottom number (denominator) and dissimilar if they have different bottom numbers."
            activity.title.contains("Multiply", ignoreCase = true) ->
                "To multiply fractions:\n1. Multiply the numerators (top numbers)\n2. Multiply the denominators (bottom numbers)\n3. Simplify if possible\n\nFor mixed numbers, convert to improper fractions first."
            else ->
                "Read each question carefully and choose the correct answer."
        }

        AlertDialog.Builder(requireContext())
            .setTitle("Help")
            .setMessage(helpMessage)
            .setPositiveButton("OK", null)
            .show()
    }

    @SuppressLint("SetTextI18n")
    private fun loadQuestion() {
        if (currentQuestionIndex >= questions.size) {
            showResults()
            return
        }

        isAnswered = false
        val question = questions[currentQuestionIndex]

        // Update UI
        tvProgress.text = "${currentQuestionIndex + 1} / ${questions.size}"
        tvQuestion.text = question.text

        // Clear previous buttons
        layoutAnswers.removeAllViews()
        answerButtons.clear()

        // Create layout based on number of options
        createHorizontalLayout(question)

        // Animate question card
        animateQuestionCard()
    }

    private fun createHorizontalLayout(question: Question.MultipleChoice) {
        val labels = listOf("A", "B", "C", "D", "E", "F") // Support up to 6 options
        val colors = listOf("#2196F3", "#4CAF50", "#FF9800", "#9C27B0", "#E91E63", "#00BCD4")

        // Create horizontal container
        val horizontalLayout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            gravity = android.view.Gravity.CENTER
        }

        question.options.forEachIndexed { index, option ->
            val button = MaterialButton(requireContext()).apply {
                // Add label for 4+ options, no label for 2 options
                text = if (question.options.size >= 4) {
                    "${labels[index]}: $option"
                } else {
                    option
                }

                textSize = when (question.options.size) {
                    2 -> 20f
                    3 -> 18f
                    4 -> 16f
                    else -> 14f
                }

                layoutParams = LinearLayout.LayoutParams(
                    0,
                    200,
                    1f
                ).apply {
                    // Add margins between buttons
                    when (index) {
                        0 -> setMargins(0, 0, 4, 0)
                        question.options.size - 1 -> setMargins(4, 0, 0, 0)
                        else -> setMargins(4, 0, 4, 0)
                    }
                }

                // Set color based on number of options
                setBackgroundColor(
                    when (question.options.size) {
                        2 -> if (index == 0) "#4DD0E1".toColorInt() else "#EF5350".toColorInt()
                        else -> colors[index].toColorInt()
                    }
                )

                cornerRadius = 16
                elevation = 8f

                setOnClickListener {
                    if (!isAnswered) {
                        checkAnswer(index)
                    }
                }
            }

            answerButtons.add(button)
            horizontalLayout.addView(button)
        }

        layoutAnswers.addView(horizontalLayout)
    }

//    private fun createTwoOptionsLayout(question: Question.MultipleChoice) {
//        // Create horizontal container for 2 options
//        val horizontalLayout = LinearLayout(requireContext()).apply {
//            orientation = LinearLayout.HORIZONTAL
//            layoutParams = LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//            )
//            gravity = android.view.Gravity.CENTER
//        }
//
//        question.options.forEachIndexed { index, option ->
//            val button = MaterialButton(requireContext()).apply {
//                text = option
//                textSize = 20f
//                layoutParams = LinearLayout.LayoutParams(
//                    0,
//                    200,
//                    1f
//                ).apply {
//                    if (index == 0) setMargins(0, 0, 8, 0)
//                    else setMargins(8, 0, 0, 0)
//                }
//
//                setBackgroundColor(
//                    if (index == 0) "#4DD0E1".toColorInt() else "#EF5350".toColorInt()
//                )
//
//                cornerRadius = 16
//                elevation = 8f
//
//                setOnClickListener {
//                    if (!isAnswered) {
//                        checkAnswer(index)
//                    }
//                }
//            }
//
//            answerButtons.add(button)
//            horizontalLayout.addView(button)
//        }
//
//        layoutAnswers.addView(horizontalLayout)
//    }
//
//    private fun createFourOptionsLayout(question: Question.MultipleChoice) {
//        val labels = listOf("A", "B", "C", "D")
//        val colors = listOf("#2196F3", "#4CAF50", "#FF9800", "#9C27B0")
//
//        // Create 2x2 grid
//        // First row
//        val row1 = LinearLayout(requireContext()).apply {
//            orientation = LinearLayout.HORIZONTAL
//            layoutParams = LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//            ).apply {
//                setMargins(0, 0, 0, 16)
//            }
//        }
//
//        // Second row
//        val row2 = LinearLayout(requireContext()).apply {
//            orientation = LinearLayout.HORIZONTAL
//            layoutParams = LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//            )
//        }
//
//        question.options.forEachIndexed { index, option ->
//            val button = MaterialButton(requireContext()).apply {
//                text = "${labels[index]}: $option"
//                textSize = 18f
//                layoutParams = LinearLayout.LayoutParams(
//                    0,
//                    200,
//                    1f
//                ).apply {
//                    if (index % 2 == 0) setMargins(0, 0, 8, 0)
//                    else setMargins(8, 0, 0, 0)
//                }
//
//                setBackgroundColor(colors[index].toColorInt())
//                cornerRadius = 16
//                elevation = 8f
//
//                setOnClickListener {
//                    if (!isAnswered) {
//                        checkAnswer(index)
//                    }
//                }
//            }
//
//            answerButtons.add(button)
//
//            // Add to appropriate row
//            if (index < 2) {
//                row1.addView(button)
//            } else {
//                row2.addView(button)
//            }
//        }
//
//        layoutAnswers.addView(row1)
//        layoutAnswers.addView(row2)
//    }
//
//    private fun createDefaultLayout(question: Question.MultipleChoice) {
//        // Fallback for other option counts (vertical layout)
//        question.options.forEachIndexed { index, option ->
//            val button = MaterialButton(requireContext()).apply {
//                text = option
//                textSize = 20f
//                layoutParams = LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT
//                ).apply {
//                    setMargins(0, 8, 0, 8)
//                }
//
//                setBackgroundColor("#FF9800".toColorInt())
//                cornerRadius = 16
//                elevation = 8f
//
//                setOnClickListener {
//                    if (!isAnswered) {
//                        checkAnswer(index)
//                    }
//                }
//            }
//
//            answerButtons.add(button)
//            layoutAnswers.addView(button)
//        }
//    }

    private fun animateQuestionCard() {
        val cardView = view?.findViewById<View>(R.id.cardQuestion)
        cardView?.let {
            it.scaleX = 0.8f
            it.scaleY = 0.8f
            it.alpha = 0f

            it.animate()
                .scaleX(1f)
                .scaleY(1f)
                .alpha(1f)
                .setDuration(300)
                .start()
        }
    }

    private fun checkAnswer(selectedAnswer: Int) {
        isAnswered = true
        val question = questions[currentQuestionIndex]
        val isCorrect = selectedAnswer == question.correctAnswer

        if (isCorrect) {
            correctAnswers++
            // Show green for correct answer only
            answerButtons[selectedAnswer].setBackgroundColor("#4CAF50".toColorInt())

            // Show all wrong answers in red
            answerButtons.forEachIndexed { index, button ->
                if (index != selectedAnswer) {
                    button.setBackgroundColor("#F44336".toColorInt())
                }
            }
        } else {
            wrongAnswers++
            // Show red for wrong selected answer
            answerButtons[selectedAnswer].setBackgroundColor("#F44336".toColorInt())

            // Show green for correct answer
            answerButtons[question.correctAnswer].setBackgroundColor("#4CAF50".toColorInt())

            // Show all other wrong answers in red
            answerButtons.forEachIndexed { index, button ->
                if (index != selectedAnswer && index != question.correctAnswer) {
                    button.setBackgroundColor("#F44336".toColorInt())
                }
            }
        }

        // Disable all buttons
        answerButtons.forEach { it.isEnabled = false }

        // Move to next question after delay
        Handler(Looper.getMainLooper()).postDelayed({
            currentQuestionIndex++
            loadQuestion()
        }, 1500)
    }

    private fun showResults() {
        val fragment = ActivityResultFragment.newInstance(
            correctAnswers,
            wrongAnswers,
            questions.size,
            activity,
            userIdentifier,
            quarter,
            lessonNumber
        )

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}