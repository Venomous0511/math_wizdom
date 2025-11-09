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
    private lateinit var btnSimilar: MaterialButton
    private lateinit var btnDissimilar: MaterialButton
    private lateinit var ivAnimal: ImageView

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

        // Randomize questions
        questions = activity.questions
            .filterIsInstance<Question.MultipleChoice>()
            .shuffled()
            .toMutableList()
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
        btnSimilar = view.findViewById(R.id.btnSimilar)
        btnDissimilar = view.findViewById(R.id.btnDissimilar)
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

        btnSimilar.setOnClickListener {
            if (!isAnswered) {
                checkAnswer(0)
            }
        }

        btnDissimilar.setOnClickListener {
            if (!isAnswered) {
                checkAnswer(1)
            }
        }
    }

    private fun showHelpDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("Help")
            .setMessage("Fractions are similar if they have the same bottom number (denominator) and dissimilar if they have different bottom numbers.\n\nExample:\n2/20 and 5/20 = SIMILAR\n2/13 and 5/14 = DISSIMILAR")
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

        // Reset button colors
        btnSimilar.setBackgroundColor("#4DD0E1".toColorInt())
        btnDissimilar.setBackgroundColor("#EF5350".toColorInt())
        btnSimilar.isEnabled = true
        btnDissimilar.isEnabled = true

        // Animate question card
        animateQuestionCard()
    }

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
            // Show green for correct
            if (selectedAnswer == 0) {
                btnSimilar.setBackgroundColor("#4CAF50".toColorInt())
            } else {
                btnDissimilar.setBackgroundColor("#4CAF50".toColorInt())
            }
        } else {
            wrongAnswers++
            // Show red for wrong
            if (selectedAnswer == 0) {
                btnSimilar.setBackgroundColor("#F44336".toColorInt())
            } else {
                btnDissimilar.setBackgroundColor("#F44336".toColorInt())
            }
            // Show correct answer in green
            if (question.correctAnswer == 0) {
                btnSimilar.setBackgroundColor("#4CAF50".toColorInt())
            } else {
                btnDissimilar.setBackgroundColor("#4CAF50".toColorInt())
            }
        }

        // Disable buttons
        btnSimilar.isEnabled = false
        btnDissimilar.isEnabled = false

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