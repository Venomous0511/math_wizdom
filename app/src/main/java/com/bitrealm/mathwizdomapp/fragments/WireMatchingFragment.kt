package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
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

// Move Line data class outside the fragment
data class Line(
    val startX: Float,
    val startY: Float,
    val endX: Float,
    val endY: Float,
    val columnAIndex: Int,
    val columnBIndex: Int
)

class WireMatchingFragment : Fragment() {

    private lateinit var activity: Activity
    private lateinit var question: Question.WireMatching
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1

    private lateinit var btnBack: ImageButton
    private lateinit var btnSettings: ImageButton
    private lateinit var tvActivityTitle: TextView
    private lateinit var rvColumnA: RecyclerView
    private lateinit var rvColumnB: RecyclerView
    private lateinit var btnSubmit: MaterialButton
    private lateinit var btnClear: MaterialButton
    private lateinit var ivAnimal: ImageView
    private lateinit var drawingCanvas: DrawingCanvasView

    private lateinit var columnAAdapter: ColumnAdapter
    private lateinit var columnBAdapter: ColumnAdapter

    private val userMatches = mutableMapOf<Int, Int>()
    private val lines = mutableListOf<Line>()

    private var selectedColumnAIndex: Int? = null

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
        ): WireMatchingFragment {
            val fragment = WireMatchingFragment()
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

        val originalQuestion = activity.questions.filterIsInstance<Question.WireMatching>().first()
        question = selectRandomProblems(originalQuestion, QUESTIONS_TO_SHOW)
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun selectRandomProblems(
        original: Question.WireMatching,
        @Suppress("SameParameterValue") count: Int
    ): Question.WireMatching {
        val totalProblems = original.columnA.size
        val selectedIndices = (0 until totalProblems).shuffled().take(count)

        val selectedColumnA = selectedIndices.map { original.columnA[it] }
        val selectedColumnB = mutableListOf<String>()
        val newCorrectMatches = mutableMapOf<Int, Int>()

        selectedIndices.forEachIndexed { newIndex, oldIndex ->
            val correctAnswerIndex = original.correctMatches[oldIndex] ?: 0
            val correctAnswer = original.columnB[correctAnswerIndex]

            if (!selectedColumnB.contains(correctAnswer)) {
                selectedColumnB.add(correctAnswer)
            }
            newCorrectMatches[newIndex] = selectedColumnB.indexOf(correctAnswer)
        }

        val shuffledColumnB = selectedColumnB.shuffled()
        val updatedMatches = newCorrectMatches.mapValues { (_, answerIndex) ->
            shuffledColumnB.indexOf(selectedColumnB[answerIndex])
        }

        return Question.WireMatching(
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
        return inflater.inflate(R.layout.wire_matching_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        setupListeners()
        setupRecyclerViews()
    }

    @SuppressLint("SetTextI18n")
    private fun initViews(view: View) {
        btnBack = view.findViewById(R.id.btnBack)
        btnSettings = view.findViewById(R.id.btnSettings)
        tvActivityTitle = view.findViewById(R.id.tvActivityTitle)
        rvColumnA = view.findViewById(R.id.rvColumnA)
        rvColumnB = view.findViewById(R.id.rvColumnB)
        btnSubmit = view.findViewById(R.id.btnSubmit)
        btnClear = view.findViewById(R.id.btnClear)
        ivAnimal = view.findViewById(R.id.ivAnimal)
        drawingCanvas = view.findViewById(R.id.drawingCanvas)

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

        btnSubmit.setOnClickListener {
            checkAnswers()
        }

        btnClear.setOnClickListener {
            clearAllLines()
        }
    }

    private fun showHelpDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("How to Play")
            .setMessage("1. Tap a problem in Column A\n2. Tap the matching answer in Column B\n3. A line will connect them\n4. Tap the same items again to disconnect\n5. Complete all 5 problems\n6. Click Submit to check your answers")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun setupRecyclerViews() {
        columnAAdapter = ColumnAdapter(
            question.columnA,
            isColumnA = true,
            onItemClick = { index ->
                handleColumnAClick(index)
            }
        )
        rvColumnA.layoutManager = LinearLayoutManager(requireContext())
        rvColumnA.adapter = columnAAdapter

        columnBAdapter = ColumnAdapter(
            question.columnB,
            isColumnA = false,
            onItemClick = { index ->
                handleColumnBClick(index)
            }
        )
        rvColumnB.layoutManager = LinearLayoutManager(requireContext())
        rvColumnB.adapter = columnBAdapter
    }

    private fun handleColumnAClick(index: Int) {
        if (selectedColumnAIndex == index) {
            selectedColumnAIndex = null
            columnAAdapter.setSelectedIndex(null)
        } else {
            selectedColumnAIndex = index
            columnAAdapter.setSelectedIndex(index)
        }
    }

    private fun handleColumnBClick(index: Int) {
        val columnAIndex = selectedColumnAIndex ?: return

        val existingLine = lines.find {
            it.columnAIndex == columnAIndex && it.columnBIndex == index
        }

        if (existingLine != null) {
            lines.remove(existingLine)
            userMatches.remove(columnAIndex)
        } else {
            lines.removeAll { it.columnAIndex == columnAIndex }

            val columnAView = rvColumnA.layoutManager?.findViewByPosition(columnAIndex)
            val columnBView = rvColumnB.layoutManager?.findViewByPosition(index)

            if (columnAView != null && columnBView != null) {
                // Get canvas location
                val canvasLocation = IntArray(2)
                drawingCanvas.getLocationInWindow(canvasLocation)

                // Get Column A view location
                val columnALocation = IntArray(2)
                columnAView.getLocationInWindow(columnALocation)
                val startX = (columnALocation[0] - canvasLocation[0] + columnAView.width).toFloat()
                val startY = (columnALocation[1] - canvasLocation[1] + columnAView.height / 2).toFloat()

                // Get Column B view location
                val columnBLocation = IntArray(2)
                columnBView.getLocationInWindow(columnBLocation)
                val endX = (columnBLocation[0] - canvasLocation[0]).toFloat()
                val endY = (columnBLocation[1] - canvasLocation[1] + columnBView.height / 2).toFloat()

                lines.add(Line(startX, startY, endX, endY, columnAIndex, index))
                userMatches[columnAIndex] = index
            }
        }

        selectedColumnAIndex = null
        columnAAdapter.setSelectedIndex(null)
        drawingCanvas.setLines(lines)
    }

    private fun clearAllLines() {
        lines.clear()
        userMatches.clear()
        selectedColumnAIndex = null
        columnAAdapter.setSelectedIndex(null)
        drawingCanvas.setLines(lines)
    }

    private fun checkAnswers() {
        if (userMatches.size < question.columnA.size) {
            Toast.makeText(
                requireContext(),
                "Please complete all matchings before submitting",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        var correctCount = 0
        var wrongCount = 0

        question.correctMatches.forEach { (problemIndex, answerIndex) ->
            val userAnswer = userMatches[problemIndex]
            if (userAnswer == answerIndex) {
                correctCount++
            } else {
                wrongCount++
            }
        }

        showResults(correctCount, wrongCount)
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

    inner class ColumnAdapter(
        private val items: List<String>,
        @Suppress("unused") private val isColumnA: Boolean,
        private val onItemClick: (Int) -> Unit
    ) : RecyclerView.Adapter<ColumnAdapter.ViewHolder>() {

        private var selectedIndex: Int? = null

        fun setSelectedIndex(index: Int?) {
            val previousIndex = selectedIndex
            selectedIndex = index
            previousIndex?.let { notifyItemChanged(it) }
            index?.let { notifyItemChanged(it) }
        }

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvItem: TextView = view.findViewById(R.id.tvItem)
            val card: MaterialCardView = view.findViewById(R.id.cardItem)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wire_matching, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.tvItem.text = items[position]

            holder.card.setCardBackgroundColor(
                if (position == selectedIndex) {
                    "#FF9800".toColorInt()
                } else {
                    "#424242".toColorInt()
                }
            )

            holder.card.setOnClickListener {
                onItemClick(position)
            }
        }

        override fun getItemCount() = items.size
    }
}