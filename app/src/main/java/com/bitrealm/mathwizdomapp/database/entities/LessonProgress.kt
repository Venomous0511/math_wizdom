package com.bitrealm.mathwizdomapp.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lesson_progress")
data class LessonProgress(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userIdentifier: String,
    val quarter: Int,
    val lessonNumber: Int,
    val activityId: String,
    val score: Int,
    val totalQuestions: Int,
    val completedAt: Long = System.currentTimeMillis()
)