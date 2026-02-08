package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.QuarterSelectionActivity
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.database.entities.LessonProgress
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.launch

class ActivityResultFragment : Fragment() {

    private var correctAnswers: Int = 0
    private var wrongAnswers: Int = 0
    private var totalQuestions: Int = 0
    private lateinit var activity: Activity
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private lateinit var lessonProgressDao: LessonProgressDao

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

            activity = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                it.getSerializable(ARG_ACTIVITY, Activity::class.java)
            } else {
                @Suppress("DEPRECATION")
                it.getSerializable(ARG_ACTIVITY) as? Activity
            } ?: run {
                Toast.makeText(context, "Error loading activity", Toast.LENGTH_SHORT).show()
                requireActivity().finish()
                return
            }

            userIdentifier = it.getString(ARG_USER_ID) ?: ""
            quarter = it.getInt(ARG_QUARTER)
            lessonNumber = it.getInt(ARG_LESSON)
        }
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

    override fun onResume() {
        super.onResume()
        MusicManager.resume()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
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

        val database = AppDatabase.getDatabase(requireContext())
        lessonProgressDao = database.lessonProgressDao()

        // Save progress
        lifecycleScope.launch {
            val progress = LessonProgress(
                userIdentifier = userIdentifier,
                quarter = quarter,
                lessonNumber = lessonNumber,
                activityId = activity.id.toString(),
                score = correctAnswers,
                totalQuestions = totalQuestions
            )
            lessonProgressDao.insertProgress(progress)
        }

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
            // Restart the activity based on question type
            val fragment = when {
                // Check for Wire Matching
                activity.questions.any { it is com.bitrealm.mathwizdomapp.models.Question.WireMatching } -> {
                    WireMatchingFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
                // Check for Drag and Drop
                activity.questions.any { it is com.bitrealm.mathwizdomapp.models.Question.DragDrop } -> {
                    DragDropFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
                // Check for Routine Problem
                activity.questions.any { it is com.bitrealm.mathwizdomapp.models.Question.RoutineProblem } -> {
                    RoutineProblemFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
                // Default to Multiple Choice
                else -> {
                    MultipleChoiceFragment.newInstance(activity, userIdentifier, quarter, lessonNumber)
                }
            }
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
        }

        btnContinue.setOnClickListener {
            // Check if lesson is completed
            checkAndShowLessonCompletion()

            val intent = Intent(requireActivity(), QuarterSelectionActivity::class.java)
            intent.putExtra("USER_IDENTIFIER", userIdentifier)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            requireActivity().finish()
        }
    }
}