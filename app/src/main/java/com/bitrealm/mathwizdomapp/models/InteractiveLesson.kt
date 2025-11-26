package com.bitrealm.mathwizdomapp.models

import java.io.Serializable

data class InteractiveLesson(
    val id: Int,
    val title: String,
    val slides: List<Slide>
) : Serializable

sealed class Slide : Serializable {
    abstract val id: Int

    data class IntroSlide(
        override val id: Int,
        val title: String,
        val content: String,
        val imageRes: Int? = null
    ) : Slide()

    data class ConceptSlide(
        override val id: Int,
        val title: String,
        val content: String,
        val keyPoints: List<String> = emptyList(),
        val imageResourceId: Int? = null
    ) : Slide()

    data class ExampleSlide(
        override val id: Int,
        val title: String,
        val problem: String,
        val steps: List<String>,
        val answer: String,
        val imageRes: Int? = null
    ) : Slide()

    data class PracticeSlide(
        override val id: Int,
        val question: String,
        val options: List<String>,
        val correctAnswer: Int,
        val explanation: String
    ) : Slide()

    data class SummarySlide(
        override val id: Int,
        val title: String,
        val keyPoints: List<String>
    ) : Slide()
}