package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
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
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.google.android.material.button.MaterialButton
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch

class LessonsListActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnBack: ImageButton
    private lateinit var btnMenu: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var tvTitle: TextView
    private lateinit var ivAnimal: ImageView
    private lateinit var lessonsContainer: LinearLayout

    private lateinit var userRepository: UserRepository
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var isSpeakerEnabled = true

    // Define lesson count per quarter
    private val lessonCounts = mapOf(
        1 to 17,  // Quarter 1: 17 lessons
        2 to 11,  // Quarter 2: 11 lessons
        3 to 8,  // Quarter 3: 8 lessons
        4 to 9   // Quarter 4: 9 lessons
    )

    // Animal images for each quarter
    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.rat,  // Changed from dragon to rat to match your drawables
        4 to R.drawable.fox
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons_list)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get data from intent
        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""
        quarter = intent.getIntExtra("QUARTER", 1)

        initViews()
        setupUI()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadSpeakerPreference()
        loadUserData()
        populateLessons()
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnBack = findViewById(R.id.btnBack)
        btnMenu = findViewById(R.id.btnMenu)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        tvTitle = findViewById(R.id.tvTitle)
        ivAnimal = findViewById(R.id.ivAnimal)
        lessonsContainer = findViewById(R.id.lessonsContainer)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvTitle.text = "LESSON - QUARTER $quarter"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
        }

        btnMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        btnSpeaker.setOnClickListener {
            toggleSpeaker()
        }
    }

    private fun setupBackPressHandler() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    finish()
                }
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun populateLessons() {
        val lessonCount = lessonCounts[quarter] ?: 3

        for (i in 1..lessonCount) {
            val button = MaterialButton(this).apply {
                text = "LESSON $i"
                textSize = 18f
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    resources.getDimensionPixelSize(R.dimen.lesson_button_height)  // This will work now
                ).apply {
                    // Use the dimension resource safely
                    bottomMargin = resources.getDimensionPixelSize(R.dimen.lesson_button_margin)
                }
                gravity = Gravity.CENTER
                setBackgroundColor(resources.getColor(R.color.lesson_button_color, theme))
                setTextColor(resources.getColor(android.R.color.white, theme))
                cornerRadius = resources.getDimensionPixelSize(R.dimen.button_corner_radius)
                elevation = 8f

                setOnClickListener {
                    navigateToLessonDetail(i)
                }
            }

            lessonsContainer.addView(button)
        }
    }

    private fun navigateToLessonDetail(lessonNumber: Int) {
        val intent = Intent(this, TopicActivity::class.java)  // Changed to TopicActivity
        intent.putExtra("USER_IDENTIFIER", userIdentifier)
        intent.putExtra("QUARTER", quarter)
        intent.putExtra("LESSON_NUMBER", lessonNumber)
        startActivity(intent)
    }

    private fun loadUserData() {
        lifecycleScope.launch {
            try {
                val user = userRepository.getUserByIdentifier(userIdentifier)
                user?.let {
                    runOnUiThread {
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
                        navHeaderUserName.text = it.fullName
                    }
                }
            } catch (e: Exception) {
                println("Error loading user: ${e.message}")
            }
        }
    }

    private fun toggleSpeaker() {
        isSpeakerEnabled = !isSpeakerEnabled

        if (isSpeakerEnabled) {
            btnSpeaker.setImageResource(R.drawable.ic_volume_up)
            Toast.makeText(this, "Voice enabled", Toast.LENGTH_SHORT).show()
        } else {
            btnSpeaker.setImageResource(R.drawable.ic_volume_off)
            Toast.makeText(this, "Voice disabled", Toast.LENGTH_SHORT).show()
        }

        saveSpeakerPreference(isSpeakerEnabled)
    }

    private fun saveSpeakerPreference(enabled: Boolean) {
        val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
        prefs.edit { putBoolean("speaker_enabled", enabled) }
    }

    private fun loadSpeakerPreference() {
        val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
        isSpeakerEnabled = prefs.getBoolean("speaker_enabled", true)

        btnSpeaker.setImageResource(
            if (isSpeakerEnabled) R.drawable.ic_volume_up
            else R.drawable.ic_volume_off
        )
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                val intent = Intent(this, QuarterSelectionActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
                finish()
            }

            R.id.nav_profile -> {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_logout -> {
                showLogoutDialog()
                return true
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
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