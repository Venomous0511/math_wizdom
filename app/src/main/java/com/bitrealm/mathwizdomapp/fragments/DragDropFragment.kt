package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipDescription
import android.os.Bundle
import android.os.CountDownTimer
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.graphics.toColorInt
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.models.Question
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class DragDropFragment : Fragment() {

    private lateinit var activity: Activity
    private lateinit var question: Question.DragDrop
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    private lateinit var btnBack: ImageButton
    private lateinit var btnSettings: ImageButton
    private lateinit var tvActivityTitle: TextView
    private lateinit var rvColumnA: RecyclerView
    private lateinit var rvColumnB: RecyclerView
    private lateinit var btnSubmit: MaterialButton
    private lateinit var ivAnimal: ImageView

    private lateinit var columnAAdapter: ColumnAAdapter
    private lateinit var columnBAdapter: ColumnBAdapter

    private val userAnswers = mutableMapOf<Int, String>()
    private val availableAnswers = mutableListOf<String>()

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.dragon,
        4 to R.drawable.fox
    )

    private var countDownTimer: CountDownTimer? = null
    private var timeLeftInMillis: Long = 300000
    private lateinit var tvTimer: TextView
    private lateinit var cardTimer: MaterialCardView
    private lateinit var ivTimerIcon: ImageView
    private lateinit var tvDirections: TextView

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
        ): DragDropFragment {
            val fragment = DragDropFragment()
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

        // Get the drag-drop question and select 5 random problems
        val originalQuestion = activity.questions.filterIsInstance<Question.DragDrop>().first()
        question = selectRandomProblems(originalQuestion, 5)
    }

    private fun selectRandomProblems(original: Question.DragDrop, @Suppress("SameParameterValue") count: Int): Question.DragDrop {
        // Get random indices
        val totalProblems = original.columnA.size
        val selectedIndices = (0 until totalProblems).shuffled().take(count)

        // Select problems and answers
        val selectedColumnA = selectedIndices.map { original.columnA[it] }
        val selectedColumnB = mutableListOf<String>()
        val newCorrectMatches = mutableMapOf<Int, Int>()

        // Build Column B with correct answers and add some distractors
        selectedIndices.forEachIndexed { newIndex, oldIndex ->
            val correctAnswerIndex = original.correctMatches[oldIndex] ?: 0
            val correctAnswer = original.columnB[correctAnswerIndex]

            if (!selectedColumnB.contains(correctAnswer)) {
                selectedColumnB.add(correctAnswer)
            }
            newCorrectMatches[newIndex] = selectedColumnB.indexOf(correctAnswer)
        }

        // Add 2 distractor answers from remaining pool
        val remainingAnswers = original.columnB.filter { !selectedColumnB.contains(it) }.shuffled().take(2)
        selectedColumnB.addAll(remainingAnswers)

        // Shuffle Column B
        val shuffledColumnB = selectedColumnB.shuffled()
        val updatedMatches = newCorrectMatches.mapValues { (_, answerIndex) ->
            shuffledColumnB.indexOf(selectedColumnB[answerIndex])
        }

        return Question.DragDrop(
            id = original.id,
            text = original.text,
            columnA = selectedColumnA,
            columnB = shuffledColumnB,
            correctMatches = updatedMatches
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.drag_drop_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        setupUI()
        setupListeners()
        setupRecyclerViews()
        startTimer()

        tvDirections.text = ActivityInstructionsFragment.getDirectionText(quarter, lessonNumber, activity.activityNumber)
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    @SuppressLint("SetTextI18n")
    private fun initViews(view: View) {
        btnBack = view.findViewById(R.id.btnBack)
        btnSettings = view.findViewById(R.id.btnSettings)
        tvActivityTitle = view.findViewById(R.id.tvActivityTitle)
        rvColumnA = view.findViewById(R.id.rvColumnA)
        rvColumnB = view.findViewById(R.id.rvColumnB)
        btnSubmit = view.findViewById(R.id.btnSubmit)
        ivAnimal = view.findViewById(R.id.ivAnimal)

        tvTimer = view.findViewById(R.id.tvTimer)
        cardTimer = view.findViewById(R.id.cardTimer)
        ivTimerIcon = view.findViewById(R.id.ivTimerIcon)

        tvActivityTitle.text = "ACTIVITY #${activity.activityNumber}"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)

        tvDirections = view.findViewById(R.id.tvDirections)
    }

    private fun setupUI() {
        // Additional UI setup if needed
    }

    private fun startTimer() {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 100) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateTimerUI()
            }

            override fun onFinish() {
                onTimeUp()
            }
        }.start()
    }

    @SuppressLint("DefaultLocale")
    private fun updateTimerUI() {
        val seconds = (timeLeftInMillis / 1000).toInt()
        val minutes = seconds / 60
        val secs = seconds % 60

        tvTimer.text = String.format("%02d:%02d", minutes, secs)

        // Change color based on time remaining
        when {
            seconds <= 60 -> {
                // Red - critical (last 60 seconds)
                cardTimer.setCardBackgroundColor("#CCFF0000".toColorInt())
                tvTimer.setTextColor("#FFFFFF".toColorInt())
                ivTimerIcon.setColorFilter("#FFFFFF".toColorInt())

                // Pulse animation
                if (seconds % 2 == 0) {
                    cardTimer.animate().scaleX(1.1f).scaleY(1.1f).setDuration(500).start()
                } else {
                    cardTimer.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500).start()
                }
            }
            seconds <= 120 -> {
                // Orange - warning (last 2 minutes)
                cardTimer.setCardBackgroundColor("#CCFF9800".toColorInt())
                tvTimer.setTextColor("#FFFFFF".toColorInt())
                ivTimerIcon.setColorFilter("#FFFFFF".toColorInt())
            }
            else -> {
                // Green - normal (above 2 minutes)
                cardTimer.setCardBackgroundColor("#CC4CAF50".toColorInt())
                tvTimer.setTextColor("#FFFFFF".toColorInt())
                ivTimerIcon.setColorFilter("#FFFFFF".toColorInt())
            }
        }
    }

    private fun onTimeUp() {
        countDownTimer?.cancel()

        Toast.makeText(requireContext(), "Time's up!", Toast.LENGTH_LONG).show()

        // Auto-submit with current answers
        AlertDialog.Builder(requireContext())
            .setTitle("Time's Up!")
            .setMessage("The time is up. Your current progress will be submitted.")
            .setPositiveButton("OK") { _, _ ->
                checkAnswers()
            }
            .setCancelable(false)
            .show()
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

        btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    private fun showHelpDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("How to Play")
            .setMessage("1. Read each problem in Column A\n2. Drag the correct answer from Column B\n3. Drop it on the empty box next to the problem\n4. Complete all problems\n5. Click Submit Answers")
            .setPositiveButton("OK", null)
            .show()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setupRecyclerViews() {
        // Column A - Problems with drop zones
        columnAAdapter = ColumnAAdapter(
            question.columnA,
            onDrop = { position, answer ->
                // Remove from available answers when dropped
                if (availableAnswers.contains(answer)) {
                    availableAnswers.remove(answer)
                    columnBAdapter.notifyDataSetChanged()
                }

                // If there was a previous answer, return it to Column B
                userAnswers[position]?.let { previousAnswer ->
                    if (previousAnswer != answer && previousAnswer != "Drop here") {
                        availableAnswers.add(previousAnswer)
                        columnBAdapter.notifyDataSetChanged()
                    }
                }

                userAnswers[position] = answer
            },
            onRemove = { position ->
                // Return answer to Column B when removed
                userAnswers[position]?.let { answer ->
                    if (answer != "Drop here") {
                        availableAnswers.add(answer)
                        columnBAdapter.notifyDataSetChanged()
                    }
                }
                userAnswers.remove(position)
            }
        )
        rvColumnA.layoutManager = LinearLayoutManager(requireContext())
        rvColumnA.adapter = columnAAdapter

        // Column B - Draggable answers (initialize with all answers)
        availableAnswers.addAll(question.columnB)
        columnBAdapter = ColumnBAdapter(availableAnswers)
        rvColumnB.layoutManager = LinearLayoutManager(requireContext())
        rvColumnB.adapter = columnBAdapter
    }

    private fun checkAnswers() {
        countDownTimer?.cancel()

        if (userAnswers.size < question.columnA.size) {
            val isFromTimeUp = timeLeftInMillis <= 0

            if (isFromTimeUp) {
                var correctCount = 0
                var wrongCount = 0

                // Check answered questions
                question.correctMatches.forEach { (problemIndex, answerIndex) ->
                    val correctAnswer = question.columnB[answerIndex]
                    val userAnswer = userAnswers[problemIndex]

                    if (userAnswer == correctAnswer) {
                        correctCount++
                    } else {
                        wrongCount++
                    }
                }

                wrongCount += (question.columnA.size - userAnswers.size)

                showResults(correctCount, wrongCount)
            } else {
                // Manual submit - require all answers
                Toast.makeText(
                    requireContext(),
                    "Please complete all problems before submitting",
                    Toast.LENGTH_SHORT
                ).show()

                // Restart timer if it was paused
                if (timeLeftInMillis > 0) {
                    startTimer()
                }
            }
            return
        }

        var correctCount = 0
        var wrongCount = 0

        // Check each answer
        question.correctMatches.forEach { (problemIndex, answerIndex) ->
            val correctAnswer = question.columnB[answerIndex]
            val userAnswer = userAnswers[problemIndex]

            if (userAnswer == correctAnswer) {
                correctCount++
            } else {
                wrongCount++
            }
        }

        showResults(correctCount, wrongCount)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        countDownTimer?.cancel()
    }

    private fun showResults(correct: Int, wrong: Int) {
        val fragment = ActivityResultFragment.newInstance(
            correct,
            wrong,
            question.columnA.size,
            activity,
            userIdentifier,
            quarter,
            lessonNumber
        )

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    // Column A Adapter (Problems with drop zones)
    inner class ColumnAAdapter(
        private val problems: List<String>,
        private val onDrop: (Int, String) -> Unit,
        private val onRemove: (Int) -> Unit
    ) : RecyclerView.Adapter<ColumnAAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvProblem: TextView = view.findViewById(R.id.tvProblem)
            val tvAnswer: TextView = view.findViewById(R.id.tvAnswer)
            val dropZone: MaterialCardView = view.findViewById(R.id.dropZone)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_column_a, parent, false)
            return ViewHolder(view)
        }

        @SuppressLint("SetTextI18n")
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.tvProblem.text = problems[position]

            // Display current answer if exists
            val currentAnswer = userAnswers[position]
            if (currentAnswer != null) {
                holder.tvAnswer.text = currentAnswer
                holder.tvAnswer.visibility = View.VISIBLE
            } else {
                holder.tvAnswer.text = "Drop here"
                holder.tvAnswer.visibility = View.VISIBLE
            }

            // Allow clicking the answer to remove it
            holder.tvAnswer.setOnClickListener {
                if (userAnswers.containsKey(position)) {
                    holder.tvAnswer.text = "Drop here"
                    onRemove(position)
                }
            }

            // Setup drop zone
            holder.dropZone.setOnDragListener { v, event ->
                when (event.action) {
                    DragEvent.ACTION_DRAG_STARTED -> {
                        event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
                    }
                    DragEvent.ACTION_DRAG_ENTERED -> {
                        holder.dropZone.setCardBackgroundColor("#4CAF50".toColorInt())
                        true
                    }
                    DragEvent.ACTION_DRAG_EXITED -> {
                        holder.dropZone.setCardBackgroundColor("#424242".toColorInt())
                        true
                    }
                    DragEvent.ACTION_DROP -> {
                        val item = event.clipData.getItemAt(0)
                        val answer = item.text.toString()

                        holder.tvAnswer.text = answer
                        holder.tvAnswer.visibility = View.VISIBLE
                        holder.dropZone.setCardBackgroundColor("#2196F3".toColorInt())

                        onDrop(position, answer)
                        true
                    }
                    DragEvent.ACTION_DRAG_ENDED -> {
                        holder.dropZone.setCardBackgroundColor("#424242".toColorInt())
                        true
                    }
                    else -> false
                }
            }
        }

        override fun getItemCount() = problems.size
    }

    // Column B Adapter (Draggable answers)
    inner class ColumnBAdapter(
        private val answers: List<String>
    ) : RecyclerView.Adapter<ColumnBAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvAnswer: TextView = view.findViewById(R.id.tvAnswer)
            val card: MaterialCardView = view.findViewById(R.id.cardAnswer)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_column_b, parent, false)
            return ViewHolder(view)
        }

        @SuppressLint("ClickableViewAccessibility")
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            if (position >= answers.size) return

            val answer = answers[position]
            holder.tvAnswer.text = answer

            // Make draggable
            holder.card.setOnTouchListener { v, event ->
                if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                    val item = ClipData.Item(answer)
                    val dragData = ClipData(
                        answer,
                        arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN),
                        item
                    )

                    val shadowBuilder = View.DragShadowBuilder(v)
                    v.startDragAndDrop(dragData, shadowBuilder, v, 0)
                    true
                } else {
                    false
                }
            }
        }

        override fun getItemCount() = answers.size
    }
}