package com.bitrealm.mathwizdomapp

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.bitrealm.mathwizdomapp.utils.NetworkValidator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SelectionActivity : AppCompatActivity() {
    private lateinit var networkValidator: NetworkValidator

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1001
    }

    @SuppressLint("ObsoleteSdkInt")
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        // Keep splash screen visible while loading
        var keepSplashScreen = true
        splashScreen.setKeepOnScreenCondition { keepSplashScreen }

        setupImmersiveMode()

        networkValidator = NetworkValidator(this)

        // Request location permission if needed (for WiFi SSID access on Android 10+)
        if (!networkValidator.hasLocationPermission() && Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            requestLocationPermission()
        }

        // Check network access
        if (!networkValidator.canUseApp()) {
            val intent = Intent(this, NetworkCheckActivity::class.java)
            startActivity(intent)
            finish()
            return
        }

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

    /**
     * Request location permission for WiFi SSID access on Android 10+
     */
    @SuppressLint("ObsoleteSdkInt")
    private fun requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        }
    }

    /**
     * Handle permission request result
     */
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission granted - recheck network
                    if (!networkValidator.canUseApp()) {
                        val intent = Intent(this, NetworkCheckActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                } else {
                    // Permission denied - still proceed but won't be able to read SSID
                    // App will show "<unknown ssid>" and rely on IP validation only
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()

        if (!networkValidator.canUseApp()) {
            val intent = Intent(this, NetworkCheckActivity::class.java)
            startActivity(intent)
            finish()
        }
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