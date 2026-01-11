package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.core.view.GravityCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.dialogs.VolumeControlDialog
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.card.MaterialCardView
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch
import com.bitrealm.mathwizdomapp.utils.NavigationHelper
import com.bitrealm.mathwizdomapp.utils.TestingModeHelper
import com.bitrealm.mathwizdomapp.utils.loadAvatarUri
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.core.graphics.toColorInt

class QuarterSelectionActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnMenu: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var card1stQuarter: MaterialCardView
    private lateinit var card2ndQuarter: MaterialCardView
    private lateinit var card3rdQuarter: MaterialCardView
    private lateinit var card4thQuarter: MaterialCardView

    private lateinit var tvTitle: TextView

    private lateinit var userRepository: UserRepository
    private lateinit var lessonProgressDao: LessonProgressDao
    private var userIdentifier: String = ""
    @Suppress("unused")
    private var isSpeakerEnabled = true

    private val lastLessonPerQuarter = mapOf(
        1 to 17,
        2 to 11,
        3 to 8,
        4 to 9
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarter_selection)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())
        lessonProgressDao = database.lessonProgressDao()

        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""

        initViews()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadUserData()
        checkQuarterLocks()
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnMenu = findViewById(R.id.btnMenu)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        card1stQuarter = findViewById(R.id.card1stQuarter)
        card2ndQuarter = findViewById(R.id.card2ndQuarter)
        card3rdQuarter = findViewById(R.id.card3rdQuarter)
        card4thQuarter = findViewById(R.id.card4thQuarter)
        tvTitle = findViewById(R.id.tvTitle)
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        btnSpeaker.setOnClickListener {
            showVolumeDialog()
        }

        card1stQuarter.setOnClickListener { onQuarterSelected(1) }
        card2ndQuarter.setOnClickListener { onQuarterSelected(2) }
        card3rdQuarter.setOnClickListener { onQuarterSelected(3) }
        card4thQuarter.setOnClickListener { onQuarterSelected(4) }
    }

    private fun checkQuarterLocks() {
        lifecycleScope.launch {
            // If testing mode is enabled, unlock everything
            if (TestingModeHelper.isTestingModeEnabled(this@QuarterSelectionActivity)) {
                updateQuarterUI(1, true)
                updateQuarterUI(2, true)
                updateQuarterUI(3, true)
                updateQuarterUI(4, true)
                return@launch
            }

            // Normal progression logic
            updateQuarterUI(1, true)

            val q1Completed = isQuarterCompleted(1)
            updateQuarterUI(2, q1Completed)

            val q2Completed = isQuarterCompleted(2)
            updateQuarterUI(3, q2Completed)

            val q3Completed = isQuarterCompleted(3)
            updateQuarterUI(4, q3Completed)
        }
    }

    @SuppressLint("UseKtx")
    private fun checkAndShowLessonCompletion() {
        lifecycleScope.launch {
            try {
                for (q in 1..4) {
                    val lastLesson = lastLessonPerQuarter[q] ?: continue
                    for (lesson in 1..lastLesson) {
                        val completedCount = lessonProgressDao.getCompletedActivitiesCount(
                            userIdentifier, q, lesson
                        )
                        if (completedCount >= 2) {
                            val prefs = getSharedPreferences("lesson_completion", MODE_PRIVATE)
                            val key = "${userIdentifier}_${q}_${lesson}"
                            if (!prefs.getBoolean(key, false)) {
                                prefs.edit().putBoolean(key, true).apply()
                                runOnUiThread {
                                    AlertDialog.Builder(this@QuarterSelectionActivity)
                                        .setTitle("🎉 Congratulations!")
                                        .setMessage("You have successfully passed Quarter $q - Lesson $lesson activities!")
                                        .setPositiveButton("OK", null)
                                        .show()
                                }
                                return@launch
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private suspend fun isQuarterCompleted(quarter: Int): Boolean {
        val lastLesson = lastLessonPerQuarter[quarter] ?: return false
        val completedCount = lessonProgressDao.getLastLessonCompletedActivitiesCount(
            userIdentifier,
            quarter,
            lastLesson
        )
        return completedCount >= 2
    }

    @SuppressLint("UseKtx")
    private fun updateQuarterUI(quarter: Int, isUnlocked: Boolean) {
        runOnUiThread {
            val card = when (quarter) {
                1 -> card1stQuarter
                2 -> card2ndQuarter
                3 -> card3rdQuarter
                4 -> card4thQuarter
                else -> return@runOnUiThread
            }

            if (isUnlocked) {
                card.isEnabled = true
                card.alpha = 1.0f
                card.foreground = null
            } else {
                card.isEnabled = false
                card.alpha = 1.0f
                card.foreground = ColorDrawable(Color.parseColor("#BB000000"))
            }
        }
    }

    private fun onQuarterSelected(quarter: Int) {
        lifecycleScope.launch {
            // If testing mode is enabled, allow all quarters
            val isUnlocked = if (TestingModeHelper.isTestingModeEnabled(this@QuarterSelectionActivity)) {
                true
            } else {
                when (quarter) {
                    1 -> true
                    2 -> isQuarterCompleted(1)
                    3 -> isQuarterCompleted(2)
                    4 -> isQuarterCompleted(3)
                    else -> false
                }
            }

            if (!isUnlocked) {
                runOnUiThread {
                    val previousQuarter = quarter - 1
                    AlertDialog.Builder(this@QuarterSelectionActivity)
                        .setTitle("Quarter Locked")
                        .setMessage("Complete the last lesson of Quarter $previousQuarter to unlock Quarter $quarter.\n\nYou need to pass at least 2 activities in the last lesson.")
                        .setPositiveButton("OK", null)
                        .show()
                }
                return@launch
            }

            runOnUiThread {
                val intent = Intent(this@QuarterSelectionActivity, LessonsListActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                intent.putExtra("QUARTER", quarter)
                startActivity(intent)
            }
        }
    }

    private fun showVolumeDialog() {
        val dialog = VolumeControlDialog(this)
        dialog.show(btnSpeaker)
    }

    private fun setupBackPressHandler() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    showExitDialog()
                }
            }
        })
    }

    @SuppressLint("UseKtx")
    private fun loadUserData() {
        lifecycleScope.launch {
            try {
                val user = userRepository.getUserByIdentifier(userIdentifier)
                user?.let {
                    runOnUiThread {
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
                        val navHeaderAvatar = headerView.findViewById<com.google.android.material.imageview.ShapeableImageView>(R.id.navHeaderAvatar)

                        navHeaderUserName.text = it.fullName

                        navHeaderAvatar.loadAvatarUri(it.avatarUri, R.drawable.ic_profile)
                    }
                }
            } catch (e: Exception) {
                println("Error loading user: ${e.message}")
            }
        }
    }

    @SuppressLint("SetTextI18n", "UseKtx")
    override fun onResume() {
        super.onResume()
        MusicManager.play()
        updateVolumeIcon()
        checkQuarterLocks()
        checkAndShowLessonCompletion()

        // Show testing mode indicator
        if (TestingModeHelper.isTestingModeEnabled(this)) {
            tvTitle.text = "QUARTER'S SELECTION (TEST MODE)"
            tvTitle.setTextColor("#FF9800".toColorInt())
        } else {
            tvTitle.text = "QUARTER'S SELECTION"
            tvTitle.setTextColor(Color.WHITE)
        }
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun updateVolumeIcon() {
        btnSpeaker.setImageResource(
            if (MusicManager.isMuted()) {
                R.drawable.ic_volume_off
            } else {
                R.drawable.ic_volume_up
            }
        )
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                Toast.makeText(this, "Already on Home", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_profile -> {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_progress -> {
                val intent = Intent(this, ProgressActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_about -> {
                NavigationHelper.showAboutDialog(this)
            }

            R.id.nav_testing_mode -> {
                TestingModeHelper.toggleTestingMode(this)
                val isEnabled = TestingModeHelper.isTestingModeEnabled(this)

                Toast.makeText(
                    this,
                    if (isEnabled) "Testing Mode ENABLED - All quarters unlocked"
                    else "Testing Mode DISABLED - Normal progression",
                    Toast.LENGTH_LONG
                ).show()

                checkQuarterLocks()
            }

            R.id.nav_logout -> {
                showLogoutDialog()
                return true
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun showExitDialog() {
        AlertDialog.Builder(this)
            .setTitle("Exit")
            .setMessage("Do you want to exit the app?")
            .setPositiveButton("Yes") { dialog, _ ->
                finishAffinity()
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun showLogoutDialog() {
        AlertDialog.Builder(this)
            .setTitle("Logout")
            .setMessage("Are you sure you want to logout?")
            .setPositiveButton("Yes") { dialog, _ ->
                logout()
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun logout() {
        val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
        prefs.edit { clear() }

        val intent = Intent(this, SelectionActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()

        Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
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
}