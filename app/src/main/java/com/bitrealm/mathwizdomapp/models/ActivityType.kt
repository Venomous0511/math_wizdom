package com.bitrealm.mathwizdomapp.models

import java.io.Serializable

enum class ActivityType {
    MULTIPLE_CHOICE,      // Similar/Dissimilar, True/False
    DRAG_DROP,           // Matching Type
    ROUTINE_PROBLEM,     // Step-by-step solutions
    WIRE_MATCHING,       // Matching Type
}

data class Activity(
    val id: Int,
    val quarter: Int,
    val lessonNumber: Int,
    val activityNumber: Int,
    val title: String,
    val type: ActivityType,
    val questions: List<Question>
): Serializable

sealed class Question {
    abstract val id: Int
    abstract val text: String
    abstract val imageUrl: String?

    data class MultipleChoice(
        override val id: Int,
        override val text: String,
        override val imageUrl: String? = null,
        val options: List<String>,
        val correctAnswer: Int
    ) : Question()

    data class DragDrop(
        override val id: Int,
        override val text: String,
        override val imageUrl: String? = null,
        val columnA: List<String>,
        val columnB: List<String>,
        val correctMatches: Map<Int, Int>
    ) : Question()

    data class WireMatching(
        override val id: Int,
        override val text: String = "",
        override val imageUrl: String? = null,
        val columnA: List<String>,
        val columnB: List<String>,
        val correctMatches: Map<Int, Int>
    ) : Question()

    data class RoutineProblem(
        override val id: Int,
        override val text: String = "",
        override val imageUrl: String? = null,
        val videoFileName: String? = null,
        val description: String = "",
        val steps: List<String> = emptyList(),
        val finalAnswer: String = ""
    ) : Question()
}