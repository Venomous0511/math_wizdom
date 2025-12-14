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
        val imageResourceId: Int? = null
    ) : Slide()

    data class ConceptSlide(
        override val id: Int,
        val title: String,
        val content: String,
        val keyPoints: List<String>? = null,
        val imageResourceId: Int? = null,
        val imageResourceIds: List<Int>? = null,
        val imageItems: List<ImageItem>? = null
    ) : Slide()

    data class ExampleSlide(
        override val id: Int,
        val title: String,
        val problem: String,
        val steps: List<String>,
        val answer: String,
        val imageResourceId: Int? = null,
        val imageItems: List<ImageItem>? = null
    ) : Slide()

    data class PracticeSlide(
        override val id: Int,
        val question: String,
        val options: List<String>,
        val correctAnswer: Int,
        val explanation: String,
        val imageResourceId: Int? = null,
        val imageItems: List<ImageItem>? = null
    ) : Slide()

    data class SummarySlide(
        override val id: Int,
        val title: String,
        val keyPoints: List<String>
    ) : Slide()

    data class ImageItem(
        val imageResourceId: Int,
        val count: Int,
        val label: String? = null
    ) : Serializable
}