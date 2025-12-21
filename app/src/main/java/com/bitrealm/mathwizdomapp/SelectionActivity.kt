package com.bitrealm.mathwizdomapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.utils.MusicManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        // Keep splash screen visible while loading
        var keepSplashScreen = true
        splashScreen.setKeepOnScreenCondition { keepSplashScreen }

        setupImmersiveMode()

        // Do ALL initialization in background
        lifecycleScope.launch {
            // Initialize in background thread
            withContext(Dispatchers.IO) {
                // Initialize music
                MusicManager.init(this@SelectionActivity)

                // Load music preference
                val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
                val savedVolume = prefs.getFloat("music_volume", 0.5f)
                MusicManager.setVolume(savedVolume)
            }

            // Back to main thread to play music
            withContext(Dispatchers.Main) {
                MusicManager.play()
            }

            // Minimum splash time
            delay(2000)
            keepSplashScreen = false

            // Navigate directly to Student Login
            navigateToStudentLogin()
        }
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)

        windowInsetsController.apply {
            isAppearanceLightStatusBars = true
            isAppearanceLightNavigationBars = true

            hide(WindowInsetsCompat.Type.statusBars())
            hide(WindowInsetsCompat.Type.navigationBars())

            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            setupImmersiveMode()
        }
    }

    private fun navigateToStudentLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("USER_ROLE", "STUDENT")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
}

// OLD SELECTION SCREEN
//package com.bitrealm.mathwizdomapp
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
//import androidx.core.view.WindowCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.core.view.WindowInsetsControllerCompat
//import androidx.lifecycle.lifecycleScope
//import com.bitrealm.mathwizdomapp.utils.MusicManager
//import com.google.android.material.card.MaterialCardView
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.withContext
//
//class SelectionActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        val splashScreen = installSplashScreen()
//
//        super.onCreate(savedInstanceState)
//
//        // Keep splash screen visible while loading
//        var keepSplashScreen = true
//        splashScreen.setKeepOnScreenCondition { keepSplashScreen }
//
//        setContentView(R.layout.selection_activity)
//
//        setupImmersiveMode()
//        setupRoleSelection()
//
//        // Do ALL initialization in background
//        lifecycleScope.launch {
//            // Initialize in background thread
//            withContext(Dispatchers.IO) {
//                // Initialize music
//                MusicManager.init(this@SelectionActivity)
//
//                // Load music preference
//                val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
//                val savedVolume = prefs.getFloat("music_volume", 0.5f)
//                MusicManager.setVolume(savedVolume)
//            }
//
//            // Back to main thread to play music
//            withContext(Dispatchers.Main) {
//                MusicManager.play()
//            }
//
//            // Minimum splash time
//            delay(2000) // Reduced to 2 seconds
//            keepSplashScreen = false
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//        MusicManager.play()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        MusicManager.pause()
//    }
//
//    private fun setupImmersiveMode() {
//        WindowCompat.setDecorFitsSystemWindows(window, false)
//
//        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
//
//        windowInsetsController.apply {
//            isAppearanceLightStatusBars = true
//            isAppearanceLightNavigationBars = true
//
//            hide(WindowInsetsCompat.Type.statusBars())
//            hide(WindowInsetsCompat.Type.navigationBars())
//
//            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
//        }
//    }
//
//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
//        if (hasFocus) {
//            setupImmersiveMode()
//        }
//    }
//
//    private fun setupRoleSelection() {
//        val studentCard = findViewById<MaterialCardView>(R.id.cardStudent)
//        val teacherCard = findViewById<MaterialCardView>(R.id.cardTeacher)
//
//        studentCard.setOnClickListener {
//            onRoleSelected("STUDENT")
//        }
//
//        teacherCard.setOnClickListener {
//            onRoleSelected("TEACHER")
//        }
//    }
//
//    private fun onRoleSelected(role: String) {
//        val intent = Intent(this, LoginActivity::class.java)
//        intent.putExtra("USER_ROLE", role)
//        startActivity(intent)
//    }
//}