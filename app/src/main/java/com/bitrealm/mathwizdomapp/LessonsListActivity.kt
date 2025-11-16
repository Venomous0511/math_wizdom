package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
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
        3 to 8,   // Quarter 3: 8 lessons
        4 to 9    // Quarter 4: 9 lessons
    )

    // Animal images for each quarter
    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.rat,
        4 to R.drawable.fox
    )

    // Quarter 1 Lesson Names
    private val quarter1LessonNames = listOf(
        "Similar and dissimilar Fraction",
        "Routine and Non-routine Problem",
        "Multiplies simple fractions",
        "Mathematical Phrases",
        "Dividing Simple fractions",
        "Some terms in Division",
        "Rounding Off Decimals",
        "Routine and Non-routine in Addition and Subtraction of Decimal",
        "Multiplying Decimals",
        "Multiplying Decimals by power of 10",
        "Word problems involving multiplying decimals",
        "STEPS TO UNDERSTAND AND SOLVE WORD PROBLEMS",
        "Dividing Whole and Decimals Numbers",
        "Dividing Decimals by 10",
        "Rational and Irrational Number",
        "Routine and Non-routine problems involving division of Decimal Numbers and Money",
        "ROUTINE AND NON-ROUTINE INVOLVING ANY OF THE OPERATIONS INCLUDING AN DECIMALS, WHOLE NUMBERS, AND MONEY"
    )

    // Quarter 2 Lesson Names
    private val quarter2LessonNames = listOf(
        "Relating Fraction and Ratio",
        "Proportion",
        "Learning what is Percentage, Rate, and Base",
        "Solving Discount, Original Price, Discount Rate, and Sale Price",
        "Exponent and Base",
        "Gemdas",
        "Integers",
        "Number Line",
        "Adding and Subtracting of Integers using Algebra tiles",
        "Multiplication, Division, Addition, and Subtraction of Integers",
        "Routine and Non-routine involving basic Operations of Integers"
    )

    // Quarter 3 Lesson Names
    private val quarter3LessonNames = listOf(
        "Plane and Solid Figures and its Features (Geometry)",
        "Formulating Rules for Sequence",
        "Expressions and Equations",
        "Algebraic Expression and Equation",
        "Speed",
        "Strategies for solving the area of composite figures",
        "Visualizing the Surface Area of a Solid Figure",
        "FINDING THE SURFACE AREA AND SOLVING WORD PROBLEMS RELATED TO IT"
    )

    // Quarter 4 Lesson Names
    private val quarter4LessonNames = listOf(
        "Understanding the Volume of Prisms, Pyramids, and other 3D shapes and solving word problems related to it",
        "Finds the Volume of Cylinders, Pyramids, Cones, and Spheres, and Solves Routine and Non-Routine Problems Related to it",
        "Electric Meter",
        "CONSTRUCTING PIE GRAPH",
        "Solving routine and non-routine problems using data presented in a pie graph",
        "Probability",
        "Using Listing Outcomes, Tree Diagrams, and Table or grid of Outcomes",
        "SIMPLE PREDICTIONS OF EVENTS WITH PROBLEM SOLVING",
        "FOUR-STEP PLAN USED IN SOLVING EXPERIMENTAL AND THEORETICAL PROBABILITY"
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
            val lessonName = getLessonName(quarter, i)
            val button = MaterialButton(this).apply {
                text = lessonName
                textSize = 14f // Slightly smaller text to fit longer lesson names
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    resources.getDimensionPixelSize(R.dimen.lesson_button_height)
                ).apply {
                    bottomMargin = resources.getDimensionPixelSize(R.dimen.lesson_button_margin)
                }
                gravity = Gravity.CENTER
                setBackgroundColor(resources.getColor(R.color.lesson_button_color, theme))
                setTextColor(resources.getColor(android.R.color.white, theme))
                cornerRadius = resources.getDimensionPixelSize(R.dimen.button_corner_radius)
                elevation = 8f
                isAllCaps = false // Disable all caps to preserve proper capitalization
                maxLines = 2 // Allow text to wrap to 2 lines
                lineHeight = (textSize * 1.2).toInt() // Adjust line height for better readability

                setOnClickListener {
                    navigateToLessonDetail(i)
                }
            }

            lessonsContainer.addView(button)
        }
    }

    private fun getLessonName(quarter: Int, lessonNumber: Int): String {
        return when (quarter) {
            1 -> {
                if (lessonNumber <= quarter1LessonNames.size) {
                    quarter1LessonNames[lessonNumber - 1]
                } else {
                    "Lesson $lessonNumber"
                }
            }
            2 -> {
                if (lessonNumber <= quarter2LessonNames.size) {
                    quarter2LessonNames[lessonNumber - 1]
                } else {
                    "Lesson $lessonNumber"
                }
            }
            3 -> {
                if (lessonNumber <= quarter3LessonNames.size) {
                    quarter3LessonNames[lessonNumber - 1]
                } else {
                    "Lesson $lessonNumber"
                }
            }
            4 -> {
                if (lessonNumber <= quarter4LessonNames.size) {
                    quarter4LessonNames[lessonNumber - 1]
                } else {
                    "Lesson $lessonNumber"
                }
            }
            else -> "Lesson $lessonNumber"
        }
    }

    private fun navigateToLessonDetail(lessonNumber: Int) {
        val intent = Intent(this, LessonDetailActivity::class.java)
        intent.putExtra("USER_IDENTIFIER", userIdentifier)
        intent.putExtra("QUARTER", quarter)
        intent.putExtra("LESSON_NUMBER", lessonNumber)
        intent.putExtra("LESSON_NAME", getLessonName(quarter, lessonNumber)) // Pass lesson name
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