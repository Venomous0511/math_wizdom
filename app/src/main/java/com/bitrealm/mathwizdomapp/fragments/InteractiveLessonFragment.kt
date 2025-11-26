package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.TopicActivity
import com.bitrealm.mathwizdomapp.models.InteractiveLesson
import com.bitrealm.mathwizdomapp.models.Slide
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.progressindicator.LinearProgressIndicator

class InteractiveLessonFragment : Fragment() {

    private lateinit var lesson: InteractiveLesson
    private var currentSlideIndex = 0

    private lateinit var tvSlideTitle: TextView
    private lateinit var cardSlideContent: MaterialCardView
    private lateinit var slideContentContainer: ViewGroup
    private lateinit var btnPrevious: MaterialButton
    private lateinit var btnNext: MaterialButton
    private lateinit var tvProgress: TextView
    private lateinit var progressBar: LinearProgressIndicator
    private lateinit var btnFullScreen: ImageButton
    private lateinit var btnMinimize: ImageButton

    companion object {
        private const val ARG_LESSON = "lesson"

        fun newInstance(lesson: InteractiveLesson): InteractiveLessonFragment {
            val fragment = InteractiveLessonFragment()
            val args = Bundle().apply {
                putSerializable(ARG_LESSON, lesson)
            }
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            @Suppress("DEPRECATION")
            lesson = it.getSerializable(ARG_LESSON) as InteractiveLesson
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.interactive_lesson_fragment, container, false)
    }

    private fun setupCharacterImage() {
        val characterImg = view?.findViewById<ImageView>(R.id.imgCharacter)

        // Array of your character drawables
        val characters = arrayOf(
            R.drawable.girl_lesson,
            R.drawable.boy_lesson,
        )

        // Pick random character
        val randomCharacter = characters.random()
        characterImg?.setImageResource(randomCharacter)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupCharacterImage()

        initViews(view)
        setupListeners()
        loadSlide(currentSlideIndex)
    }

    private fun initViews(view: View) {
        tvSlideTitle = view.findViewById(R.id.tvSlideTitle)
        cardSlideContent = view.findViewById(R.id.cardSlideContent)
        slideContentContainer = view.findViewById(R.id.slideContentContainer)
        btnPrevious = view.findViewById(R.id.btnPrevious)
        btnNext = view.findViewById(R.id.btnNext)
        tvProgress = view.findViewById(R.id.tvProgress)
        progressBar = view.findViewById(R.id.progressBar)

        btnFullScreen = view.findViewById(R.id.btnFullScreen)
        btnMinimize = view.findViewById(R.id.btnMinimize)

        progressBar.max = 100
    }

    private fun setupListeners() {
        btnPrevious.setOnClickListener {
            if (currentSlideIndex > 0) {
                currentSlideIndex--
                loadSlide(currentSlideIndex)
            }
        }

        btnNext.setOnClickListener {
            if (currentSlideIndex < lesson.slides.size - 1) {
                currentSlideIndex++
                loadSlide(currentSlideIndex)
            }
        }

        btnFullScreen.setOnClickListener {
            (activity as? TopicActivity)?.enterFragmentFullScreen()
        }

        btnMinimize.setOnClickListener {
            (activity as? TopicActivity)?.exitFragmentFullScreen()
        }
    }

    private fun loadSlide(index: Int) {
        val slide = lesson.slides[index]
        slideContentContainer.removeAllViews()

        when (slide) {
            is Slide.IntroSlide -> renderIntroSlide(slide)
            is Slide.ConceptSlide -> renderConceptSlide(slide)
            is Slide.ExampleSlide -> renderExampleSlide(slide)
            is Slide.PracticeSlide -> renderPracticeSlide(slide)
            is Slide.SummarySlide -> renderSummarySlide(slide)
        }

        updateNavigationButtons()
        updateProgress()
    }
    private fun renderIntroSlide(slide: Slide.IntroSlide) {
        tvSlideTitle.text = slide.title

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_intro,
            slideContentContainer,
            false
        )

        view.findViewById<TextView>(R.id.tvContent).text = slide.content

        slideContentContainer.addView(view)
    }

    private fun renderConceptSlide(slide: Slide.ConceptSlide) {
        tvSlideTitle.text = slide.title

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_concept,
            slideContentContainer,
            false
        )

        view.findViewById<TextView>(R.id.tvContent).text = slide.content

        // Load image if available
        val imageView = view.findViewById<ImageView>(R.id.ivSlideImage)
        if (slide.imageResourceId != null) {
            imageView.setImageResource(slide.imageResourceId)
            imageView.visibility = View.VISIBLE
        } else {
            imageView.visibility = View.GONE
        }
        
        // Add key points
        val keyPointsContainer = view.findViewById<ViewGroup>(R.id.keyPointsContainer)
        slide.keyPoints.forEach { point ->
            val pointView = LayoutInflater.from(context).inflate(
                R.layout.item_key_point,
                keyPointsContainer,
                false
            )
            pointView.findViewById<TextView>(R.id.tvKeyPoint).text = point
            keyPointsContainer.addView(pointView)
        }

        slideContentContainer.addView(view)
    }

    @SuppressLint("UseKtx", "SetTextI18n")
    private fun renderExampleSlide(slide: Slide.ExampleSlide) {
        tvSlideTitle.text = slide.title

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_example,
            slideContentContainer,
            false
        )

        view.findViewById<TextView>(R.id.tvProblem).text = slide.problem

        // Add steps
        val stepsContainer = view.findViewById<ViewGroup>(R.id.stepsContainer)
        slide.steps.forEach { step ->
            val stepView = LayoutInflater.from(context).inflate(
                R.layout.item_step,
                stepsContainer,
                false
            )
            stepView.findViewById<TextView>(R.id.tvStep).text = step
            stepsContainer.addView(stepView)
        }

        // Answer section (initially hidden)
        val answerCard = view.findViewById<MaterialCardView>(R.id.cardAnswer)
        val tvAnswer = view.findViewById<TextView>(R.id.tvAnswer)
        val btnRevealAnswer = view.findViewById<MaterialButton>(R.id.btnRevealAnswer)

        tvAnswer.text = slide.answer
        answerCard.visibility = View.GONE

        btnRevealAnswer.setOnClickListener {
            if (answerCard.visibility == View.GONE) {
                answerCard.visibility = View.VISIBLE
                btnRevealAnswer.text = "Hide Answer"
            } else {
                answerCard.visibility = View.GONE
                btnRevealAnswer.text = "Reveal Answer"
            }
        }

        slideContentContainer.addView(view)
    }

    fun updateFullScreenButtons(isFullScreen: Boolean) {
        if (isFullScreen) {
            btnFullScreen.visibility = View.GONE
            btnMinimize.visibility = View.VISIBLE
        } else {
            btnFullScreen.visibility = View.VISIBLE
            btnMinimize.visibility = View.GONE
        }
    }

    @SuppressLint("SetTextI18n")
    private fun renderPracticeSlide(slide: Slide.PracticeSlide) {
        tvSlideTitle.text = "Practice Time!!"

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_practice,
            slideContentContainer,
            false
        )

        view.findViewById<TextView>(R.id.tvQuestion).text = slide.question

        val optionsContainer = view.findViewById<ViewGroup>(R.id.optionsContainer)
        val cardFeedback = view.findViewById<MaterialCardView>(R.id.cardFeedback)
        val tvFeedback = view.findViewById<TextView>(R.id.tvFeedback)

        cardFeedback.visibility = View.GONE

        slide.options.forEachIndexed { index, option ->
            val optionView = LayoutInflater.from(context).inflate(
                R.layout.item_option,
                optionsContainer,
                false
            ) as MaterialButton  // Fixed: Use proper inflation

            optionView.text = option
            optionView.setOnClickListener {
                // Check answer
                val isCorrect = index == slide.correctAnswer

                // Disable all buttons
                for (i in 0 until optionsContainer.childCount) {
                    optionsContainer.getChildAt(i).isEnabled = false
                }

                // Show feedback
                if (isCorrect) {
                    optionView.setBackgroundColor(
                        ContextCompat.getColor(requireContext(), android.R.color.holo_green_dark)
                    )
                    tvFeedback.text = "✓ " + slide.explanation
                    cardFeedback.setCardBackgroundColor(
                        ContextCompat.getColor(requireContext(), android.R.color.holo_green_light)
                    )
                } else {
                    optionView.setBackgroundColor(
                        ContextCompat.getColor(requireContext(), android.R.color.holo_red_dark)
                    )
                    // Highlight correct answer
                    val correctButton = optionsContainer.getChildAt(slide.correctAnswer) as MaterialButton
                    correctButton.setBackgroundColor(
                        ContextCompat.getColor(requireContext(), android.R.color.holo_green_dark)
                    )
                    tvFeedback.text = "✗ Incorrect. " + slide.explanation
                    cardFeedback.setCardBackgroundColor(
                        ContextCompat.getColor(requireContext(), android.R.color.holo_red_light)
                    )
                }

                cardFeedback.visibility = View.VISIBLE
            }

            optionsContainer.addView(optionView)
        }

        slideContentContainer.addView(view)
    }

    private fun renderSummarySlide(slide: Slide.SummarySlide) {
        tvSlideTitle.text = slide.title

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_summary,
            slideContentContainer,
            false
        )

        val keyPointsContainer = view.findViewById<ViewGroup>(R.id.keyPointsContainer)
        slide.keyPoints.forEach { point ->
            val pointView = LayoutInflater.from(context).inflate(
                R.layout.item_summary_point,
                keyPointsContainer,
                false
            )
            pointView.findViewById<TextView>(R.id.tvSummaryPoint).text = point
            keyPointsContainer.addView(pointView)
        }

        slideContentContainer.addView(view)
    }

    @SuppressLint("SetTextI18n")
    private fun updateNavigationButtons() {
        btnPrevious.isEnabled = currentSlideIndex > 0
        btnNext.isEnabled = currentSlideIndex < lesson.slides.size - 1

        if (currentSlideIndex == lesson.slides.size - 1) {
            btnNext.text = "Complete"
        } else {
            btnNext.text = "Next"
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateProgress() {
        tvProgress.text = "Slide ${currentSlideIndex + 1} of ${lesson.slides.size}"

        // Update progress bar
        val progress = ((currentSlideIndex + 1).toFloat() / lesson.slides.size * 100).toInt()
        progressBar.setProgressCompat(progress, true)
    }
}