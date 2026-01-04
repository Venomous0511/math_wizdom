package com.bitrealm.mathwizdomapp.utils

import android.content.Context
import androidx.appcompat.app.AlertDialog

object NavigationHelper {

    fun showAboutDialog(context: Context) {
        val message = """
            📱 APPLICATION NAME
            MathWizdom
            
            📌 VERSION
            Version 1.0
            
            📖 ABOUT THE APPLICATION
            MathWizdom is an offline learning mobile application designed for Grade 6 students of Sta. Cruz Elementary School. It provides lessons for the whole school year, divided by topic, along with interactive activities, randomized questions, and video tutorials to make learning Math fun, engaging, and easy to understand. The app also allows students to track their own progress, encouraging independent learning without needing an internet connection.
            
            🎯 PURPOSE
            To make learning Math fun, interactive, and accessible even without internet connection. It aims to help students understand concepts clearly and practice effectively.
            
            👥 TARGET USERS
            • Grade 6 students of Sta. Cruz Elementary School
            
            ✨ FEATURES
            • Lessons for the whole school year (Quarter 1 – Quarter 4)
            • Lessons divided by topic
            • Fun activities: True or False, Multiple Choice, Matching, Cross-It
            • Random questions in activities
            • Video tutorials from YouTube
            • Easy to use and navigate
            • Track your own progress
            
            💡 BENEFITS
            • Improves Math understanding and problem-solving skills
            • Encourages independent learning
            • Makes Math engaging and enjoyable
            • Can be used anytime without internet
            
            🔧 HOW IT WORKS
            1. Open the App – Launch MathWizdom on your device
            2. Select a Topic – Choose the lesson or quarter to study
            3. Read the Lesson – Go through lessons with examples
            4. Complete Activities – Answer fun exercises
            5. Watch Video Tutorials – Access YouTube videos for guidance
            6. Track Your Progress – Check scores and completed topics
            7. Practice Anytime – Learn offline without internet
            
            💻 SYSTEM REQUIREMENTS
            • Android 12 (Snow Cone) or higher
            • 4 GB RAM
            • 64 GB ROM
            
            📚 CONTENT REFERENCES
            • DepEd K-12 Mathematics Curriculum
            Link: https://www.teacherph.com/wp-content/uploads/2022/08/Grade-6-Math-Most-Essential-Learning-Competencies-MELCs.pdf
            • Grade 6 Math Modules
            • Educational websites and verified online resources
            Link: https://grade6.modyul.online/
            
            👨‍💻 DEVELOPERS
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