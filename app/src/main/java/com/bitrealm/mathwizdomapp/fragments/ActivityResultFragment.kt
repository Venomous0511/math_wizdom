package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.google.android.material.button.MaterialButton

class ActivityResultFragment : Fragment() {

    private var correctAnswers: Int = 0
    private var wrongAnswers: Int = 0
    private var totalQuestions: Int = 0
    private lateinit var activity: Activity
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    companion object {
        private const val ARG_CORRECT = "correct"
        private const val ARG_WRONG = "wrong"
        private const val ARG_TOTAL = "total"
        private const val ARG_ACTIVITY = "activity"
        private const val ARG_USER_ID = "user_id"
        private const val ARG_QUARTER = "quarter"
        private const val ARG_LESSON = "lesson"

        fun newInstance(
            correct: Int,
            wrong: Int,
            total: Int,
            activity: Activity,
            userIdentifier: String,
            quarter: Int,
            lessonNumber: Int
        ): ActivityResultFragment {
            val fragment = ActivityResultFragment()
            val args = Bundle().apply {
                putInt(ARG_CORRECT, correct)
                putInt(ARG_WRONG, wrong)
                putInt(ARG_TOTAL, total)
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
            correctAnswers = it.getInt(ARG_CORRECT)
            wrongAnswers = it.getInt(ARG_WRONG)
            totalQuestions = it.getInt(ARG_TOTAL)
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
        return inflater.inflate(R.layout.activity_result_fragment, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvScore = view.findViewById<TextView>(R.id.tvScore)
        val tvPercentage = view.findViewById<TextView>(R.id.tvPercentage)
        val tvGradeMessage = view.findViewById<TextView>(R.id.tvGradeMessage)
        val tvCorrect = view.findViewById<TextView>(R.id.tvCorrect)
        val tvWrong = view.findViewById<TextView>(R.id.tvWrong)
        val btnRetry = view.findViewById<MaterialButton>(R.id.btnRetry)
        val btnContinue = view.findViewById<MaterialButton>(R.id.btnContinue)

        // Calculate percentage
        val percentage = (correctAnswers.toFloat() / totalQuestions * 100).toInt()

        // Display results
        tvScore.text = "$correctAnswers / $totalQuestions"
        tvPercentage.text = "$percentage%"
        tvCorrect.text = correctAnswers.toString()
        tvWrong.text = wrongAnswers.toString()

        // Set grade message
        tvGradeMessage.text = when {
            percentage >= 100 -> "Excellent Work!"
            percentage >= 90 -> "Great Job!"
            percentage >= 80 -> "Good Effort!"
            percentage >= 75 -> "Keep Practicing!"
            else -> "Need More Practice"
        }

        // Button listeners
        btnRetry.setOnClickListener {
            // Restart the activity
            val fragment = MultipleChoiceFragment.newInstance(
                activity, userIdentifier, quarter, lessonNumber
            )
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
        }

        btnContinue.setOnClickListener {
            // Go back to activity list
            requireActivity().finish()
        }
    }
}