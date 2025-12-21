package com.bitrealm.mathwizdomapp.database.dao

import androidx.room.*
import com.bitrealm.mathwizdomapp.database.entities.LessonProgress

@Dao
interface LessonProgressDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgress(progress: LessonProgress)

    @Query("SELECT * FROM lesson_progress WHERE userIdentifier = :userId AND quarter = :quarter AND lessonNumber = :lesson AND activityId = :activityId")
    suspend fun getActivityProgress(userId: String, quarter: Int, lesson: Int, activityId: String): LessonProgress?

    @Query("SELECT COUNT(DISTINCT activityId) FROM lesson_progress WHERE userIdentifier = :userId AND quarter = :quarter AND lessonNumber = :lesson AND score >= 3")
    suspend fun getCompletedActivitiesCount(userId: String, quarter: Int, lesson: Int): Int
}