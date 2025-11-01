package com.bitrealm.mathwizdomapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.google.android.material.card.MaterialCardView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selection_activity)

        setupImmersiveMode()
        setupRoleSelection()
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

    private fun setupRoleSelection() {
        val studentCard = findViewById<MaterialCardView>(R.id.cardStudent)
        val teacherCard = findViewById<MaterialCardView>(R.id.cardTeacher)

        studentCard.setOnClickListener {
            onRoleSelected("STUDENT")
        }

        teacherCard.setOnClickListener {
            onRoleSelected("TEACHER")
        }
    }

    private fun onRoleSelected(role: String) {
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("USER_ROLE", role)
        startActivity(intent)
    }
}