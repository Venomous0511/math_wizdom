package com.bitrealm.mathwizdomapp.utils

import android.content.Context
import androidx.appcompat.app.AlertDialog

object NavigationHelper {

    fun showAboutDialog(context: Context) {
        val message = """
            Application Name:
            MathWizdom
            
            Application Version:
            Version 1.0
            
            Brief Explanation:
            MathWizdom is an offline learning mobile application designed for Grade 6 students of Sta. Cruz Elementary School. It provides lessons for the whole school year, divided by topic, along with interactive activities, randomized questions, and video tutorials to make learning Math fun, engaging, and easy to understand.
            
            Purpose:
            To make learning Math fun, interactive, and accessible even without internet connection.
            
            Target User:
            Grade 6 students of Sta. Cruz Elementary School
            
            Features:
            • Lessons for the whole school year (Quarter 1 – Quarter 4)
            • Lessons divided by topic
            • Fun activities: True or False, Multiple Choice, Matching, Cross-It
            • Random questions in activities
            • Video tutorials from YouTube
            • Track your own progress
            
            System Requirements:
            • Android 12 or higher
            • 4 GB RAM
            • 64 GB ROM
            
            Developers:
            Kimberly M. Ga
            Amaro Jr. Q. Gianan
            Shaun Kelly S. Oyco
            Keith Pineda
        """.trimIndent()

        AlertDialog.Builder(context)
            .setTitle("All About App")
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()
    }
}