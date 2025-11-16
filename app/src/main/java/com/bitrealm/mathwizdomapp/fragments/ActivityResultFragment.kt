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
        val tvGradeMessage = view.findViewById<TextView>(R.id.tvGradeMessage)
        val tvStar1 = view.findViewById<TextView>(R.id.tvStar1)
        val tvStar2 = view.findViewById<TextView>(R.id.tvStar2)
        val tvStar3 = view.findViewById<TextView>(R.id.tvStar3)
        val tvStar4 = view.findViewById<TextView>(R.id.tvStar4)
        val tvStar5 = view.findViewById<TextView>(R.id.tvStar5)
        val btnRetry = view.findViewById<MaterialButton>(R.id.btnRetry)
        val btnContinue = view.findViewById<MaterialButton>(R.id.btnContinue)

        // Calculate percentage
        val percentage = (correctAnswers.toFloat() / totalQuestions * 100).toInt()

        // Display score
        tvScore.text = "$correctAnswers / $totalQuestions"

        // Determine star rating based on percentage
        val stars = when {
            percentage >= 100 -> 5  // 5 stars for 100%
            percentage >= 80 -> 4  // 4 stars for 80-99%
            percentage >= 60 -> 3  // 3 stars for 60-79%
            percentage >= 40 -> 2  // 2 stars for 40-59%
            percentage >= 20 -> 1  // 1 star for 20-39%
            else -> 0              // 0 stars for below 20%
        }

        // Set star visibility and message
        when (stars) {
            5 -> {
                tvStar1.text = "⭐"
                tvStar2.text = "⭐"
                tvStar3.text = "⭐"
                tvStar4.text = "⭐"
                tvStar5.text = "⭐"
                tvGradeMessage.text = "Excellent Work!"
            }
            4 -> {
                tvStar1.text = "⭐"
                tvStar2.text = "⭐"
                tvStar3.text = "⭐"
                tvStar4.text = "⭐"
                tvStar5.text = "☆"
                tvStar5.alpha = 0.3f
                tvGradeMessage.text = "Perfect!"
            }
            3 -> {
                tvStar1.text = "⭐"
                tvStar2.text = "⭐"
                tvStar3.text = "⭐"
                tvStar4.text = "☆"
                tvStar4.alpha = 0.3f
                tvStar5.text = "☆"
                tvStar5.alpha = 0.3f
                tvGradeMessage.text = "Nice Work!"
            }
            2 -> {
                tvStar1.text = "⭐"
                tvStar2.text = "⭐"
                tvStar3.text = "☆"
                tvStar3.alpha = 0.3f
                tvStar4.text = "☆"
                tvStar4.alpha = 0.3f
                tvStar5.text = "☆"
                tvStar5.alpha = 0.3f
                tvGradeMessage.text = "Great Job!"
            }
            1 -> {
                tvStar1.text = "⭐"
                tvStar2.text = "☆"
                tvStar2.alpha = 0.3f
                tvStar3.text = "☆"
                tvStar3.alpha = 0.3f
                tvStar4.text = "☆"
                tvStar4.alpha = 0.3f
                tvStar5.text = "☆"
                tvStar5.alpha = 0.3f
                tvGradeMessage.text = "Good Effort!"
            }
            else -> {
                tvStar1.text = "☆"
                tvStar1.alpha = 0.3f
                tvStar2.text = "☆"
                tvStar2.alpha = 0.3f
                tvStar3.text = "☆"
                tvStar3.alpha = 0.3f
                tvStar4.text = "☆"
                tvStar4.alpha = 0.3f
                tvStar5.text = "☆"
                tvStar5.alpha = 0.3f
                tvGradeMessage.text = "Keep Practicing!"
            }
        }

        // Button listeners
        btnRetry.setOnClickListener {
            // Restart the activity - check activity type
            val fragment = when {
                activity.questions.any { it is com.bitrealm.mathwizdomapp.models.Question.DragDrop } -> {
                    DragDropFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
                else -> {
                    MultipleChoiceFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
            }
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