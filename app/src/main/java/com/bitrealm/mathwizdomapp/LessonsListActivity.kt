package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
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
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.bitrealm.mathwizdomapp.adapters.LessonItem
import com.bitrealm.mathwizdomapp.adapters.LessonsAdapter
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.dialogs.VolumeControlDialog
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.bitrealm.mathwizdomapp.utils.NavigationHelper
import com.bitrealm.mathwizdomapp.utils.loadAvatarUri
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
    private lateinit var lessonsContainer: RecyclerView

    private lateinit var userRepository: UserRepository
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private lateinit var lessonProgressDao: LessonProgressDao

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

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    @Suppress("unused")
    private fun updateVolumeIcon() {
        btnSpeaker.setImageResource(
            if (MusicManager.isMuted()) {
                R.drawable.ic_volume_off
            } else {
                R.drawable.ic_volume_up
            }
        )
    }

    // Quarter 1 Lesson Names
    private val quarter1LessonNames = listOf(
        "Adds and Subtracts Simple Fractions and Mixed",
        "Solve Routine and Non-routine Problems Involving Addition and/or Subtraction of Fractions",
        "Multiplies Simple Fractions and Mixed Fractions",
        "Solves Routine or Non-routine Problems Involving Multiplication without or with Addition or Subtraction of Fractions and Mixed Fractions",
        "Divides Simple Fractions and Mixed Fractions",
        "Solves Routine or Non-routine Problems Involving Division of Fractions using appropriate Problem Solving strategies and tools",
        "Adds and Subtracts Decimals and Mixed Decimals Through Ten Thousandths",
        "Problem Solving Involving Addition and Subtraction of Decimal Numbers",
        "Multiplication of Numbers With Two Decimal Place Factors",
        "Multiplies Decimals Numbers Mentally by Powers of 10",
        "Problem Solving Involving Decimal Numbers",
        "Multi-step Problem Solving Involving Whole Numbers and Decimals",
        "Division of Whole Numbers and Decimal Numbers",
        "Divide Decimal Numbers by Powers of 10",
        "Types of Decimal Numbers",
        "Problem Solving Involving Division of Decimal Numbers and Money",
        "Problem Solving Involving Multiplication of Decimal Numbers and Money"
    )

    // Quarter 2 Lesson Names
    private val quarter2LessonNames = listOf(
        "Expressing One Value as a Fraction of another Given their Ratio and Vice Versa",
        "Concept of Ratio and Proportion and Different Types of Proportion",
        "Percentage, Rate and Base",
        "Solving Percent Problems",
        "Describing and Giving the Value of Numbers Expressed in Exponential Form",
        "Interpreting the GEMDAS Rule and Performing Two or More Different Operations",
        "Describing the Set of Integers and Identifying Real-life Situations that Make Use of It",
        "Comparing and Arranging Integers",
        "Addition and Subtraction of Integer",
        "Performs Basic Operations on Integers",
        "Solving Basic Operations on Integers"
    )

    // Quarter 3 Lesson Names
    private val quarter3LessonNames = listOf(
        "Visualizes and describes the different solid figures",
        "Writing Rules for Sequence",
        "Translating Real-life Verbal Expressions and Equations into Letters and Symbols and Vice Versa",
        "Representing Quantities in Real-life Situations Using Algebraic Expressions and Equations",
        "The Relationship of Speed, Distance and Time",
        "Finds the area, solving routine and non-routine problems involving areas of composite figures formed",
        "Visualizes and describes surface area and names the unit of measure used for measuring the surface area of solid/space figures",
        "Problem Solving Involving Surface Area of Solid Figures"
    )

    // Quarter 4 Lesson Names
    private val quarter4LessonNames = listOf(
        "Relationship of Volume of Prisms and Pyramids & Other 3D Figures",
        "Volume of Solid Figures",
        "Reading and Interpreting Electric and Water Meter Readings",
        "The Pie Graph",
        "Problem Solving involving Data in a Pie Graph",
        "Describing probability, performing experiments, and recording outcomes",
        "Making Lists and Diagrams of Outcomes and Telling the Number of Favorable Outcomes and Chances",
        "Makes simple predictions of events based on the results of experiments",
        "Solving Routine and Non-Routine Problems Involving Experimental and Theoretical Probability"
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

        lessonProgressDao = database.lessonProgressDao()

        initViews()
        setupUI()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
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
        tvTitle.text = "QUARTER $quarter LESSONS"
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
            showVolumeDialog()
        }
    }

    private fun showVolumeDialog() {
        val dialog = VolumeControlDialog(this)
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
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

    private fun populateLessons() {
        lifecycleScope.launch {
            val lessonCount = lessonCounts[quarter] ?: 3
            val lessons = mutableListOf<LessonItem>()

            for (i in 1..lessonCount) {
                val isLocked = !isLessonUnlocked(i)
                lessons.add(LessonItem(i, getLessonName(quarter, i), isLocked))
            }

            runOnUiThread {
                lessonsContainer.layoutManager = GridLayoutManager(this@LessonsListActivity, 3)
                val adapter = LessonsAdapter(lessons) { lessonNumber ->
                    navigateToLessonDetail(lessonNumber)
                }
                lessonsContainer.adapter = adapter
            }
        }
    }

    private suspend fun isLessonUnlocked(lessonNumber: Int): Boolean {
        // Lesson 1 is always unlocked
        if (lessonNumber == 1) return true

        // Check if previous lesson has at least 2 activities completed with score >= 3
        val previousLesson = lessonNumber - 1
        val completedCount = lessonProgressDao.getCompletedActivitiesCount(
            userIdentifier,
            quarter,
            previousLesson
        )

        return completedCount >= 2
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
        intent.putExtra("LESSON_NAME", getLessonName(quarter, lessonNumber))
        startActivity(intent)
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

                        // Load avatar from URI
                        navHeaderAvatar.loadAvatarUri(it.avatarUri, R.drawable.ic_profile)
                    }
                }
            } catch (e: Exception) {
                println("Error loading user: ${e.message}")
            }
        }
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

            R.id.nav_progress -> {
                val intent = Intent(this, ProgressActivity::class.java)
                intent.putExtra("USER_IDENTIFIER", userIdentifier)
                startActivity(intent)
            }

            R.id.nav_about -> {
                NavigationHelper.showAboutDialog(this)
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