package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.edit
import androidx.core.view.GravityCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.adapters.SubtopicAdapter
import com.bitrealm.mathwizdomapp.data.InteractiveLessonProvider
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.dialogs.VolumeControlDialog
import com.bitrealm.mathwizdomapp.fragments.InteractiveLessonFragment
import com.bitrealm.mathwizdomapp.models.InteractiveLesson
import com.bitrealm.mathwizdomapp.models.Subtopic
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.bitrealm.mathwizdomapp.utils.NavigationHelper
import com.bitrealm.mathwizdomapp.utils.loadAvatarUri
import com.google.android.material.card.MaterialCardView
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch

class TopicActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnBack: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var tvTopicTitle: TextView
    private lateinit var tvObjective: TextView
    private lateinit var cardObjective: MaterialCardView
    private lateinit var rvSubtopics: RecyclerView
    private lateinit var lessonContainer: View
    private lateinit var guideline: View
    private lateinit var topBar: View
    private lateinit var mainContent: ConstraintLayout

    private lateinit var userRepository: UserRepository
    private lateinit var subtopicAdapter: SubtopicAdapter
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private var isFullScreen = false

    // Store original constraints
    private val originalConstraints = ConstraintSet()

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    fun enterFragmentFullScreen() {
        enterFullScreen()
    }

    fun exitFragmentFullScreen() {
        exitFullScreen()
    }

    companion object {
        // Define subtopics for each lesson
        private val lessonSubtopics = mapOf(
            // QUARTER 1
            "1_1" to listOf(
                Subtopic(1, "Similar and Dissimilar Fractions", "topic_1.pdf"),
                Subtopic(
                    2,
                    "Add Simple and Mixed Fractions with Regrouping or without Regrouping",
                    "topic_2.pdf"
                ),
                Subtopic(
                    3,
                    "Subtract Simple and Mixed Fractions with Regrouping or without Regrouping",
                    "topic_3.pdf"
                )
            ),
            "1_2" to listOf(
                Subtopic(1, "Routine and Non-Routine", "topic_1.pdf"),
            ),
            "1_3" to listOf(
                Subtopic(1, "Multiplies Simple Fractions", "topic_1.pdf"),
                Subtopic(2, "Cancellation Method", "topic_2.pdf"),
                Subtopic(3, "Multiplies Mixed Fractions", "topic_3.pdf"),
            ),
            "1_4" to listOf(
                Subtopic(1, "Mathematical Phrases", "topic_1.pdf"),
                Subtopic(2, "Steps in Problem Solving", "topic_2.pdf"),
            ),
            "1_5" to listOf(
                Subtopic(1, "Dividing Simple Fractions", "topic_1.pdf"),
            ),
            "1_6" to listOf(
                Subtopic(1, "Some Terms in Division", "topic_1.pdf"),
                Subtopic(2, "Solving Routine or Non-Routine in Division", "topic_2.pdf"),
            ),
            "1_7" to listOf(
                Subtopic(1, "Rounding off Decimals", "topic_1.pdf"),
                Subtopic(2, "Adding and Subtracting Decimals", "topic_2.pdf"),
            ),
            "1_8" to listOf(
                Subtopic(
                    1,
                    "Routine and Non-routine in Addition and Subtraction of Decimal",
                    "topic_1.pdf"
                ),
            ),
            "1_9" to listOf(
                Subtopic(1, "Multiplying Decimals", "topic_1.pdf"),
            ),
            "1_10" to listOf(
                Subtopic(1, "Multiplying Decimals by power of 10", "topic_1.pdf"),
            ),
            "1_11" to listOf(
                Subtopic(1, "Words problems involving multiplying decimals", "topic_1.pdf"),
            ),
            "1_12" to listOf(
                Subtopic(1, "Steps to Understand and Solve Words Problems", "topic_1.pdf"),
            ),
            "1_13" to listOf(
                Subtopic(1, "Dividing Whole and Decimal Numbers", "topic_1.pdf"),
            ),
            "1_14" to listOf(
                Subtopic(1, "Dividing Decimals by 10", "topic_1.pdf"),
            ),
            "1_15" to listOf(
                Subtopic(1, "Rational and Irrational Numbers", "topic_1.pdf"),
                Subtopic(
                    2,
                    "Terminating Decimal and Repeating or Non-terminating decimals",
                    "topic_2.pdf"
                ),
            ),
            "1_16" to listOf(
                Subtopic(
                    1,
                    "Routine and Non-routine problems involving division of Decimal Numbers and Money",
                    "topic_1.pdf"
                ),
                Subtopic(2, "Step by Step Procedure in Problem Solving", "topic_2.pdf"),
            ),
            "1_17" to listOf(
                Subtopic(
                    1,
                    "Routine and Non-routine involving any of the Operations including any Decimals, Whole Numbers, and Money",
                    "topic_1.pdf"
                ),
                Subtopic(2, "Creating a Problem", "topic_2.pdf"),
                Subtopic(
                    3,
                    "A Multi-Step Routine Problem Solving involves using two or more Arithmetic Operations",
                    "topic_3.pdf"
                ),
            ),

            // QUARTER 2
            "2_1" to listOf(
                Subtopic(1, "Relating Fraction and Ratio", "topic_1.pdf"),
            ),
            "2_2" to listOf(
                Subtopic(1, "Proportion", "topic_1.pdf"),
                Subtopic(2, "Types of Proportion", "topic_2.pdf"),
            ),
            "2_3" to listOf(
                Subtopic(1, "Learning what is Percentage, Rate, and Base", "topic_1.pdf"),
                Subtopic(2, "Finding Percentage, Rate, and Base", "topic_2.pdf"),
                Subtopic(
                    3,
                    "Routine and Non-routine Problem involving Percentage, Rate, and Base",
                    "topic_3.pdf"
                ),
            ),
            "2_4" to listOf(
                Subtopic(
                    1,
                    "Solving Discount, Original Price, Discount Rate, and Sale Price",
                    "topic_1.pdf"
                ),
                Subtopic(2, "Solving Markup Price", "topic_2.pdf"),
                Subtopic(3, "Solving Commission", "topic_3.pdf"),
                Subtopic(4, "Solving Sales Tax", "topic_4.pdf"),
                Subtopic(5, "Solving Simple Interest and Principal", "topic_5.pdf"),
            ),
            "2_5" to listOf(
                Subtopic(1, "Exponent and Base", "topic_1.pdf"),
            ),
            "2_6" to listOf(
                Subtopic(1, "GEMDAS", "topic_1.pdf"),
            ),
            "2_7" to listOf(
                Subtopic(1, "Integers", "topic_1.pdf"),
            ),
            "2_8" to listOf(
                Subtopic(1, "Number Line", "topic_1.pdf"),
            ),
            "2_9" to listOf(
                Subtopic(
                    1,
                    "Adding and Subtracting of Integers using Algebra Tiles",
                    "topic_1.pdf"
                ),
            ),
            "2_10" to listOf(
                Subtopic(
                    1,
                    "Multiplication, Division, Addition, and Subtraction of Integers",
                    "topic_1.pdf"
                ),
            ),
            "2_11" to listOf(
                Subtopic(
                    1,
                    "Routine and Non-routine involving basic Operations of Integers",
                    "topic_1.pdf"
                ),
            ),

            // QUARTER 3
            "3_1" to listOf(
                Subtopic(1, "Planes and Solid Figures and its Features", "topic_1.pdf"),
            ),
            "3_2" to listOf(
                Subtopic(1, "Formulating Rules for Sequence", "topic_1.pdf"),
            ),
            "3_3" to listOf(
                Subtopic(1, "Expressions and Equations", "topic_1.pdf"),
                Subtopic(2, "Translating Word Phrases into Algebraic Expressions", "topic_2.pdf"),
                Subtopic(3, "Variable and Constant", "topic_3.pdf"),
            ),
            "3_4" to listOf(
                Subtopic(1, "Algebraic Expression and Equation", "topic_1.pdf"),
                Subtopic(2, "The Four Basic Rules for Solving an Equation", "topic_2.pdf"),
            ),
            "3_5" to listOf(
                Subtopic(1, "Speed", "topic_1.pdf"),
                Subtopic(2, "Distance and Time", "topic_2.pdf"),
            ),
            "3_6" to listOf(
                Subtopic(1, "Strategies for Solving the area of Composite Figures", "topic_1.pdf"),
            ),
            "3_7" to listOf(
                Subtopic(1, "Visualizing the Surface Area of a Solid Figure", "topic_1.pdf"),
                Subtopic(2, "Surface Area of a Solid Figures", "topic_2.pdf"),
            ),
            "3_8" to listOf(
                Subtopic(
                    1,
                    "Finding the Surface Area and Solving Word Problems Related to it",
                    "topic_1.pdf"
                ),
            ),

            // QUARTER 4
            "4_1" to listOf(
                Subtopic(
                    1,
                    "Understanding the Volume of Prisms, Pyramids, and Other 3D Shapes and Solving Word Problems Related to it",
                    "topic_1.pdf"
                ),
            ),
            "4_2" to listOf(
                Subtopic(
                    1,
                    "Finds the Volume of a Cylinder, Pyramids, Cones, and Spheres, and Solves Routine and Non-routine Problems Related to it",
                    "topic_1.pdf"
                ),
            ),
            "4_3" to listOf(
                Subtopic(1, "Electric Meter", "topic_1.pdf"),
                Subtopic(2, "Water Meter", "topic_2.pdf"),
                Subtopic(
                    3,
                    "Compute Water or Electric Meter Consumption for a Particular Period of Time",
                    "topic_3.pdf"
                ),
            ),
            "4_4" to listOf(
                Subtopic(1, "Constructing Pie Graph", "topic_1.pdf"),
            ),
            "4_5" to listOf(
                Subtopic(
                    1,
                    "Solving Routine and Non-routine Problems using Data Presented in a Pie Graph",
                    "topic_1.pdf"
                ),
            ),
            "4_6" to listOf(
                Subtopic(1, "Probability", "topic_1.pdf"),
            ),
            "4_7" to listOf(
                Subtopic(
                    1,
                    "Using Listing Outcomes, Tree Diagrams, and Table or Grid of Outcomes",
                    "topic_1.pdf"
                ),
            ),
            "4_8" to listOf(
                Subtopic(1, "Simple Predictions of Events with Problem Solving", "topic_1.pdf"),
            ),
            "4_9" to listOf(
                Subtopic(
                    1,
                    "Four-Step Plan used in Solving Experimental and Theoretical Probability",
                    "topic_1.pdf"
                ),
            ),
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get data from intent
        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""
        quarter = intent.getIntExtra("QUARTER", 1)
        lessonNumber = intent.getIntExtra("LESSON_NUMBER", 1)

        initViews()
        setupUI()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadUserData()
        setupSubtopics()

        // Save original constraints for restoring later
        originalConstraints.clone(mainContent)
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnBack = findViewById(R.id.btnBack)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        tvTopicTitle = findViewById(R.id.tvTopicTitle)
        tvObjective = findViewById(R.id.tvObjective)
        cardObjective = findViewById(R.id.cardObjective)
        rvSubtopics = findViewById(R.id.rvSubtopics)
        lessonContainer = findViewById(R.id.lessonContainer)
        guideline = findViewById(R.id.guideline)
        topBar = findViewById(R.id.topBar)
        mainContent = findViewById(R.id.main)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvTopicTitle.text = "LESSON $lessonNumber - TOPIC"

        // Set objective text based on lesson
        tvObjective.text = getObjectiveText()
    }

    private fun getObjectiveText(): String {
        return when ("${quarter}_$lessonNumber") {
            // Quarter 1
            "1_1" -> getString(R.string.objective_lesson_1_1)
            "1_2" -> getString(R.string.objective_lesson_1_2)
            "1_3" -> getString(R.string.objective_lesson_1_3)
            "1_4" -> getString(R.string.objective_lesson_1_4)
            "1_5" -> getString(R.string.objective_lesson_1_5)
            "1_6" -> getString(R.string.objective_lesson_1_6)
            "1_7" -> getString(R.string.objective_lesson_1_7)
            "1_8" -> getString(R.string.objective_lesson_1_8)
            "1_9" -> getString(R.string.objective_lesson_1_9)
            "1_10" -> getString(R.string.objective_lesson_1_10)
            "1_11" -> getString(R.string.objective_lesson_1_11)
            "1_12" -> getString(R.string.objective_lesson_1_12)
            "1_13" -> getString(R.string.objective_lesson_1_13)
            "1_14" -> getString(R.string.objective_lesson_1_14)
            "1_15" -> getString(R.string.objective_lesson_1_15)
            "1_16" -> getString(R.string.objective_lesson_1_16)
            "1_17" -> getString(R.string.objective_lesson_1_17)

            // Quarter 2
            "2_1" -> getString(R.string.objective_lesson_2_1)
            "2_2" -> getString(R.string.objective_lesson_2_2)
            "2_3" -> getString(R.string.objective_lesson_2_3)
            "2_4" -> getString(R.string.objective_lesson_2_4)
            "2_5" -> getString(R.string.objective_lesson_2_5)
            "2_6" -> getString(R.string.objective_lesson_2_6)
            "2_7" -> getString(R.string.objective_lesson_2_7)
            "2_8" -> getString(R.string.objective_lesson_2_8)
            "2_9" -> getString(R.string.objective_lesson_2_9)
            "2_10" -> getString(R.string.objective_lesson_2_10)
            "2_11" -> getString(R.string.objective_lesson_2_11)

            // Quarter 3
            "3_1" -> getString(R.string.objective_lesson_3_1)
            "3_2" -> getString(R.string.objective_lesson_3_2)
            "3_3" -> getString(R.string.objective_lesson_3_3)
            "3_4" -> getString(R.string.objective_lesson_3_4)
            "3_5" -> getString(R.string.objective_lesson_3_5)
            "3_6" -> getString(R.string.objective_lesson_3_6)
            "3_7" -> getString(R.string.objective_lesson_3_7)
            "3_8" -> getString(R.string.objective_lesson_3_8)

            // Quarter 4
            "4_1" -> getString(R.string.objective_lesson_4_1)
            "4_2" -> getString(R.string.objective_lesson_4_2)
            "4_3" -> getString(R.string.objective_lesson_4_3)
            "4_4" -> getString(R.string.objective_lesson_4_4)
            "4_5" -> getString(R.string.objective_lesson_4_5)
            "4_6" -> getString(R.string.objective_lesson_4_6)
            "4_7" -> getString(R.string.objective_lesson_4_7)
            "4_8" -> getString(R.string.objective_lesson_4_8)
            "4_9" -> getString(R.string.objective_lesson_4_9)

            else -> getString(R.string.objective_default)
        }
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            if (isFullScreen) {
                exitFullScreen()
            } else {
                finish()
            }
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
                if (isFullScreen) {
                    exitFullScreen()
                } else if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    finish()
                }
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun setupSubtopics() {
        val lessonKey = "${quarter}_$lessonNumber"
        val subtopics = lessonSubtopics[lessonKey] ?: emptyList()

        // Update subtopics with interactive lessons
        val updatedSubtopics = subtopics.mapIndexed { index, subtopic ->
            val interactiveLesson = InteractiveLessonProvider.getLesson(quarter, lessonNumber, index + 1)
            subtopic.copy(interactiveLesson = interactiveLesson)
        }

        subtopicAdapter = SubtopicAdapter(updatedSubtopics) { subtopic ->
            if (subtopic.interactiveLesson != null) {
                // Show interactive lesson
                loadInteractiveLesson(subtopic.interactiveLesson)
            } else {
                // Show message that lesson is not available yet
                Toast.makeText(this, "Interactive lesson not available yet", Toast.LENGTH_SHORT).show()
            }
        }

        rvSubtopics.adapter = subtopicAdapter

        // Load first subtopic by default
        if (updatedSubtopics.isNotEmpty()) {
            val firstSubtopic = updatedSubtopics[0]
            if (firstSubtopic.interactiveLesson != null) {
                loadInteractiveLesson(firstSubtopic.interactiveLesson)
            }
        }
    }

    private fun loadInteractiveLesson(lesson: InteractiveLesson) {
        // Show interactive lesson fragment in lessonContainer
        val fragment = InteractiveLessonFragment.newInstance(lesson)

        supportFragmentManager.beginTransaction()
            .replace(R.id.lessonContainer, fragment)
            .commit()
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

    private fun enterFullScreen() {
        isFullScreen = true
        updateFullScreenButtons()

        // Hide UI elements
        topBar.visibility = View.GONE
        cardObjective.visibility = View.GONE
        rvSubtopics.visibility = View.GONE
        guideline.visibility = View.GONE

        // Make lesson container full screen using ConstraintSet
        val constraintSet = ConstraintSet()
        constraintSet.clone(mainContent)

        // Clear all constraints from lesson container
        constraintSet.clear(lessonContainer.id)

        // Set lesson container to match parent
        constraintSet.connect(
            lessonContainer.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START
        )
        constraintSet.connect(
            lessonContainer.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END
        )
        constraintSet.connect(
            lessonContainer.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP
        )
        constraintSet.connect(
            lessonContainer.id,
            ConstraintSet.BOTTOM,
            ConstraintSet.PARENT_ID,
            ConstraintSet.BOTTOM
        )

        // Remove margins
        constraintSet.setMargin(lessonContainer.id, ConstraintSet.START, 0)
        constraintSet.setMargin(lessonContainer.id, ConstraintSet.END, 0)
        constraintSet.setMargin(lessonContainer.id, ConstraintSet.TOP, 0)
        constraintSet.setMargin(lessonContainer.id, ConstraintSet.BOTTOM, 0)

        // Apply the constraints
        constraintSet.applyTo(mainContent)

        // Enable full immersive mode
        setupFullImmersiveMode()

        Toast.makeText(this, getString(R.string.full_screen_mode), Toast.LENGTH_SHORT).show()
    }

    private fun exitFullScreen() {
        isFullScreen = false
        updateFullScreenButtons()

        // Show UI elements
        topBar.visibility = View.VISIBLE
        cardObjective.visibility = View.VISIBLE
        rvSubtopics.visibility = View.VISIBLE
        guideline.visibility = View.VISIBLE

        // Restore original constraints using the saved ConstraintSet
        originalConstraints.applyTo(mainContent)

        setupImmersiveMode()

        Toast.makeText(this, getString(R.string.normal_mode), Toast.LENGTH_SHORT).show()
    }

    private fun updateFullScreenButtons() {
        val fragment = supportFragmentManager.findFragmentById(R.id.lessonContainer) as? InteractiveLessonFragment
        fragment?.updateFullScreenButtons(isFullScreen)
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
            .setTitle(getString(R.string.logout_title))
            .setMessage(getString(R.string.logout_message))
            .setPositiveButton(getString(R.string.yes)) { dialog, _ ->
                logout()
                dialog.dismiss()
            }
            .setNegativeButton(getString(R.string.no)) { dialog, _ ->
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

        Toast.makeText(this, getString(R.string.logged_out_successfully), Toast.LENGTH_SHORT).show()
    }

    private fun setupFullImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
        windowInsetsController.hide(WindowInsetsCompat.Type.navigationBars())
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            if (isFullScreen) {
                setupFullImmersiveMode()
            } else {
                setupImmersiveMode()
            }
        }
    }
}