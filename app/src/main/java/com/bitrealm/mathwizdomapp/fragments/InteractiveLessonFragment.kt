package com.bitrealm.mathwizdomapp.fragments

import android.annotation.SuppressLint
import android.graphics.text.LineBreaker
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
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
    private var isPracticeAnswered = false

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
            R.drawable.girl_lesson_1,
            R.drawable.girl_lesson_2,
            R.drawable.girl_lesson_3,
            R.drawable.boy_lesson_1,
            R.drawable.boy_lesson_2,
            R.drawable.boy_lesson_3,
            R.drawable.boy_lesson_4,
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
            val currentSlide = lesson.slides[currentSlideIndex]
            if (currentSlide is Slide.PracticeSlide && !isPracticeAnswered) {
                // Show message that they need to answer first
                android.widget.Toast.makeText(
                    requireContext(),
                    "Please answer the practice question before proceeding",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

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

    private fun setJustifiedText(textView: TextView, text: String) {
        // justificationMode is already set in XML, so we just need to handle indentation
        textView.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD

        val indentSize = 50
        val paragraphs = text.split("\n\n")
        val spannableString = android.text.SpannableString(text)

        var currentIndex = 0
        paragraphs.forEach { paragraph ->
            if (currentIndex < text.length) {
                spannableString.setSpan(
                    android.text.style.LeadingMarginSpan.Standard(indentSize, 0),
                    currentIndex,
                    currentIndex + paragraph.length,
                    android.text.Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                currentIndex += paragraph.length + 2
            }
        }

        textView.text = spannableString
    }

    private fun setJustifiedTextNoIndent(textView: TextView, text: String) {
        // Just set justification mode without indentation
        textView.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
        textView.text = text
    }

    private fun loadSlide(index: Int) {
        val slide = lesson.slides[index]
        slideContentContainer.removeAllViews()

        if (slide is Slide.PracticeSlide) {
            isPracticeAnswered = false
        }

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

        setJustifiedText(view.findViewById(R.id.tvContent), slide.content)

        // Load image if available
        val imageView = view.findViewById<ImageView>(R.id.ivSlideImage)
        if (slide.imageResourceId != null) {
            imageView.setImageResource(slide.imageResourceId)
            imageView.visibility = View.VISIBLE
        } else {
            imageView.visibility = View.GONE
        }

        slideContentContainer.addView(view)
    }

    private fun renderConceptSlide(slide: Slide.ConceptSlide) {
        tvSlideTitle.text = slide.title

        val view = LayoutInflater.from(context).inflate(
            R.layout.slide_concept,
            slideContentContainer,
            false
        )

        setJustifiedText(view.findViewById(R.id.tvContent), slide.content)

        // Load image if available
        val singleImageView = view.findViewById<ImageView>(R.id.ivSlideImage)
        val multiImageContainer = view.findViewById<ViewGroup>(R.id.multiImageContainer)

        if (!slide.imageResourceIds.isNullOrEmpty()) {
            singleImageView.visibility = View.GONE
            multiImageContainer.visibility = View.VISIBLE

            slide.imageResourceIds.forEach { imageResId ->
                val imageView = ImageView(requireContext()).apply {
                    setImageResource(imageResId)
                    adjustViewBounds = true
                    layoutParams = ViewGroup.MarginLayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    ).apply {
                        bottomMargin = 16.dpToPx()
                    }
                }
                multiImageContainer.addView(imageView)
            }
        } else if (slide.imageResourceId != null) {
            singleImageView.setImageResource(slide.imageResourceId)
            singleImageView.visibility = View.VISIBLE
            multiImageContainer.visibility = View.GONE
        } else {
            singleImageView.visibility = View.GONE
            multiImageContainer.visibility = View.GONE
        }

        // Add key points
        val keyPointsHeader = view.findViewById<ViewGroup>(R.id.keyPointsHeader)
        val keyPointsContainer = view.findViewById<ViewGroup>(R.id.keyPointsContainer)

        if (slide.keyPoints != null && slide.keyPoints.isNotEmpty()) {
            keyPointsHeader.visibility = View.VISIBLE
            keyPointsContainer.visibility = View.VISIBLE
            slide.keyPoints.forEach { point ->
                val pointView = LayoutInflater.from(context).inflate(
                    R.layout.item_key_point,
                    keyPointsContainer,
                    false
                )
                pointView.findViewById<TextView>(R.id.tvKeyPoint).text = point
                keyPointsContainer.addView(pointView)
            }
        } else {
            keyPointsHeader.visibility = View.GONE
            keyPointsContainer.visibility = View.GONE
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

        setJustifiedTextNoIndent(view.findViewById(R.id.tvProblem), slide.problem)

        // Display image items if available
        val imageItemsContainer = view.findViewById<ViewGroup>(R.id.imageItemsContainer)
        if (slide.imageItems != null && slide.imageItems.isNotEmpty()) {
            imageItemsContainer.visibility = View.VISIBLE
            displayImageItems(imageItemsContainer, slide.imageItems)
        } else {
            imageItemsContainer.visibility = View.GONE
        }

        // Add steps
        val stepsContainer = view.findViewById<ViewGroup>(R.id.stepsContainer)
        slide.steps.forEach { step ->
            val stepView = LayoutInflater.from(context).inflate(
                R.layout.item_step,
                stepsContainer,
                false
            )
            val tvStep = stepView.findViewById<TextView>(R.id.tvStep)
            setJustifiedTextNoIndent(tvStep, step)
            stepsContainer.addView(stepView)
        }

        // Answer section (initially hidden)
        val answerCard = view.findViewById<MaterialCardView>(R.id.cardAnswer)
        val tvAnswer = view.findViewById<TextView>(R.id.tvAnswer)
        val btnRevealAnswer = view.findViewById<MaterialButton>(R.id.btnRevealAnswer)

        setJustifiedTextNoIndent(tvAnswer, slide.answer)
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
            adjustLayoutForFullscreen(true)
        } else {
            btnFullScreen.visibility = View.VISIBLE
            btnMinimize.visibility = View.GONE
            adjustLayoutForFullscreen(false)
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

        setJustifiedTextNoIndent(view.findViewById(R.id.tvQuestion), slide.question)

        // Load image if available
        val imageView = view.findViewById<ImageView>(R.id.ivSlideImage)
        if (slide.imageResourceId != null) {
            imageView.setImageResource(slide.imageResourceId)
            imageView.visibility = View.VISIBLE
        } else {
            imageView.visibility = View.GONE
        }

        // Display image items if available
        val imageItemsContainer = view.findViewById<ViewGroup>(R.id.imageItemsContainer)
        if (slide.imageItems != null && slide.imageItems.isNotEmpty()) {
            imageItemsContainer.visibility = View.VISIBLE
            displayImageItems(imageItemsContainer, slide.imageItems)
        } else {
            imageItemsContainer.visibility = View.GONE
        }

        val optionsContainer = view.findViewById<ViewGroup>(R.id.optionsContainer)
        val cardFeedback = view.findViewById<MaterialCardView>(R.id.cardFeedback)
        val tvFeedback = view.findViewById<TextView>(R.id.tvFeedback)

        cardFeedback.visibility = View.GONE

        slide.options.forEachIndexed { index, option ->
            val optionView = LayoutInflater.from(context).inflate(
                R.layout.item_option,
                optionsContainer,
                false
            ) as MaterialButton

            optionView.text = option
            optionView.setOnClickListener {
                isPracticeAnswered = true

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
                    setJustifiedTextNoIndent(tvFeedback, "✓ " + slide.explanation)
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
                    setJustifiedTextNoIndent(tvFeedback, "✗ Incorrect. " + slide.explanation)
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
            val tvSummaryPoint = pointView.findViewById<TextView>(R.id.tvSummaryPoint)
            setJustifiedText(tvSummaryPoint, point)
            keyPointsContainer.addView(pointView)
        }

        slideContentContainer.addView(view)
    }

    // Function to display image items
    private fun displayImageItems(container: ViewGroup, imageItems: List<Slide.ImageItem>) {
        container.removeAllViews()

        imageItems.forEach { item ->
            val itemView = LayoutInflater.from(context).inflate(
                R.layout.item_image_group,
                container,
                false
            )

            // Set label if provided
            val labelView = itemView.findViewById<TextView>(R.id.tvImageLabel)
            if (!item.label.isNullOrEmpty()) {
                labelView.text = item.label
                labelView.visibility = View.VISIBLE
            } else {
                labelView.visibility = View.GONE
            }

            // Create image grid
            val gridLayout = itemView.findViewById<GridLayout>(R.id.imageGrid)
            createImageGrid(gridLayout, item.imageResourceId, item.count)

            container.addView(itemView)
        }
    }

    // Function to create grid of images
    private fun createImageGrid(gridLayout: GridLayout, imageResId: Int, count: Int) {
        gridLayout.removeAllViews()

        repeat(count) {
            val imageView = ImageView(requireContext()).apply {
                setImageResource(imageResId)
                layoutParams = GridLayout.LayoutParams().apply {
                    width = 48.dpToPx()
                    height = 48.dpToPx()
                    setMargins(4.dpToPx(), 4.dpToPx(), 4.dpToPx(), 4.dpToPx())
                }
                scaleType = ImageView.ScaleType.FIT_CENTER
            }
            gridLayout.addView(imageView)
        }
    }

    // Extension function for dp to px conversion
    private fun Int.dpToPx(): Int {
        return (this * resources.displayMetrics.density).toInt()
    }

    fun adjustLayoutForFullscreen(isFullscreen: Boolean) {
        val params = cardSlideContent.layoutParams as androidx.constraintlayout.widget.ConstraintLayout.LayoutParams

        if (isFullscreen) {
            // Reduce margins in fullscreen
            params.setMargins(12.dpToPx(), 5.dpToPx(), 12.dpToPx(), 2.dpToPx())
        } else {
            // Normal margins
            params.setMargins(24.dpToPx(), 5.dpToPx(), 24.dpToPx(), 2.dpToPx())
        }

        cardSlideContent.layoutParams = params
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