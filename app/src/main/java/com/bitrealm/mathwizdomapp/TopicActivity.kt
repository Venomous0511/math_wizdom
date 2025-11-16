package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
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
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.models.Subtopic
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.android.material.card.MaterialCardView
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch

class TopicActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnBack: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var btnPdfFullScreen: ImageButton
    private lateinit var btnPdfMinimize: ImageButton
    private lateinit var tvTopicTitle: TextView
    private lateinit var tvObjective: TextView
    private lateinit var cardObjective: MaterialCardView
    private lateinit var rvSubtopics: RecyclerView
    private lateinit var pdfView: PDFView
    private lateinit var pdfContainer: View
    private lateinit var ivAnimal: ImageView
    private lateinit var guideline: View
    private lateinit var topBar: View
    private lateinit var mainContent: ConstraintLayout

    private lateinit var userRepository: UserRepository
    private lateinit var subtopicAdapter: SubtopicAdapter
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private var isSpeakerEnabled = true
    private var isFullScreen = false

    // Store original constraints
    private val originalConstraints = ConstraintSet()
    private var currentPdfFileName: String = ""
    private var successfulPdfPath: String? = null

    companion object {
        private val quarterAnimals = mapOf(
            1 to R.drawable.cat,
            2 to R.drawable.bird,
            3 to R.drawable.rat,
            4 to R.drawable.fox
        )

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
        loadSpeakerPreference()
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
        btnPdfFullScreen = findViewById(R.id.btnPdfFullScreen)
        btnPdfMinimize = findViewById(R.id.btnPdfMinimize)
        tvTopicTitle = findViewById(R.id.tvTopicTitle)
        tvObjective = findViewById(R.id.tvObjective)
        cardObjective = findViewById(R.id.cardObjective)
        rvSubtopics = findViewById(R.id.rvSubtopics)
        pdfView = findViewById(R.id.pdfView)
        pdfContainer = findViewById(R.id.pdfContainer)
        ivAnimal = findViewById(R.id.ivAnimal)
        guideline = findViewById(R.id.guideline)
        topBar = findViewById(R.id.topBar)
        mainContent = findViewById(R.id.main)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvTopicTitle.text = "LESSON $lessonNumber - TOPIC"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)

        // Set objective text based on lesson
        tvObjective.text = getObjectiveText()

        // Set initial full screen button states
        updateFullScreenButtons()
    }

    private fun getObjectiveText(): String {
        return when ("${quarter}_$lessonNumber") {
            "1_1" -> getString(R.string.objective_lesson_1)
            "2_1" -> getString(R.string.objective_lesson_2)
            "3_1" -> getString(R.string.objective_lesson_3)
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
            toggleSpeaker()
        }

        btnPdfFullScreen.setOnClickListener {
            enterFullScreen()
        }

        btnPdfMinimize.setOnClickListener {
            exitFullScreen()
        }
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

        subtopicAdapter = SubtopicAdapter(subtopics) { subtopic ->
            successfulPdfPath = null
            loadPDF(subtopic.pdfFileName)
        }

        rvSubtopics.adapter = subtopicAdapter

        // Load first subtopic by default
        if (subtopics.isNotEmpty()) {
            loadPDF(subtopics[0].pdfFileName)
        } else {
            // Show message if no subtopics available
            tvObjective.text = "No content available for this lesson yet."
        }
    }

    private fun loadPDF(fileName: String) {
        try {
            currentPdfFileName = fileName

            // If we already found a working path, use it directly
            if (successfulPdfPath != null) {
                loadPdfFromPath(successfulPdfPath!!, false)
                return
            }

            // Construct the correct path based on quarter and lesson
            val pdfPath = "quarter_$quarter/lesson_$lessonNumber/$fileName"

            loadPdfFromPath(pdfPath, true)

        } catch (e: Exception) {
            println("Exception loading PDF: ${e.message}")
            e.printStackTrace()
            runOnUiThread {
                Toast.makeText(this, "Error loading content: ${e.message}", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    private fun loadPdfFromPath(path: String, tryFallback: Boolean) {
        pdfView.fromAsset(path)
            .defaultPage(0)
            .swipeHorizontal(true)
            .pageSnap(true)
            .autoSpacing(true)
            .pageFling(true)
            .enableSwipe(true)
//            .scrollHandle(DefaultScrollHandle(this))
            .spacing(0)
            .pageFitPolicy(FitPolicy.BOTH)
            .fitEachPage(true)
            .nightMode(false)
            .onError { error ->
                if (tryFallback) {
                    runOnUiThread {
                        tryFallbackPaths(currentPdfFileName)
                    }
                }
            }
            .onLoad { nbPages ->
                // Cache the successful path for future loads
                successfulPdfPath = path
                runOnUiThread {
                    // Reset zoom to fit the page properly
                    pdfView.resetZoomWithAnimation()
                }
            }
            .load()
    }

    private fun tryFallbackPaths(fileName: String) {
        val fallbackPaths = listOf(
            "quarter$quarter/lesson$lessonNumber/$fileName",
            "q$quarter/l$lessonNumber/$fileName",
            "pdfs/quarter_$quarter/lesson_$lessonNumber/$fileName",
            fileName
        )

        var pathIndex = 0

        fun tryNextPath() {
            if (pathIndex >= fallbackPaths.size) {
                Toast.makeText(this, "Content file not found: $fileName", Toast.LENGTH_LONG).show()
                return
            }

            val path = fallbackPaths[pathIndex]

            pdfView.fromAsset(path)
                .defaultPage(0)
                .swipeHorizontal(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .enableSwipe(true)
//                .scrollHandle(DefaultScrollHandle(this))
                .spacing(0)
                .pageFitPolicy(FitPolicy.BOTH)
                .fitEachPage(true)
                .nightMode(false)
                .onError {
                    pathIndex++
                    tryNextPath()
                }
                .onLoad { nbPages ->
                    // Cache the successful path
                    successfulPdfPath = path
                    runOnUiThread {
                        pdfView.resetZoomWithAnimation()
                    }
                }
                .load()
        }

        tryNextPath()
    }

    private fun loadUserData() {
        lifecycleScope.launch {
            try {
                val user = userRepository.getUserByIdentifier(userIdentifier)
                user?.let {
                    runOnUiThread {
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName =
                            headerView.findViewById<TextView>(R.id.navHeaderUserName)
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
            Toast.makeText(this, getString(R.string.voice_enabled), Toast.LENGTH_SHORT).show()
        } else {
            btnSpeaker.setImageResource(R.drawable.ic_volume_off)
            Toast.makeText(this, getString(R.string.voice_disabled), Toast.LENGTH_SHORT).show()
        }

        saveSpeakerPreference(isSpeakerEnabled)
    }

    private fun enterFullScreen() {
        isFullScreen = true
        updateFullScreenButtons()

        // Hide UI elements
        topBar.visibility = View.GONE
        cardObjective.visibility = View.GONE
        rvSubtopics.visibility = View.GONE
        ivAnimal.visibility = View.GONE
        guideline.visibility = View.GONE

        // Make PDF container full screen using ConstraintSet
        val constraintSet = ConstraintSet()
        constraintSet.clone(mainContent)

        // Clear all constraints from PDF container
        constraintSet.clear(pdfContainer.id)

        // Set PDF container to match parent
        constraintSet.connect(
            pdfContainer.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START
        )
        constraintSet.connect(
            pdfContainer.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END
        )
        constraintSet.connect(
            pdfContainer.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP
        )
        constraintSet.connect(
            pdfContainer.id,
            ConstraintSet.BOTTOM,
            ConstraintSet.PARENT_ID,
            ConstraintSet.BOTTOM
        )

        // Remove margins
        constraintSet.setMargin(pdfContainer.id, ConstraintSet.START, 0)
        constraintSet.setMargin(pdfContainer.id, ConstraintSet.END, 0)
        constraintSet.setMargin(pdfContainer.id, ConstraintSet.TOP, 0)
        constraintSet.setMargin(pdfContainer.id, ConstraintSet.BOTTOM, 0)

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
        ivAnimal.visibility = View.VISIBLE
        guideline.visibility = View.VISIBLE

        // Restore original constraints using the saved ConstraintSet
        originalConstraints.applyTo(mainContent)

        // Reload the current PDF to ensure it's displayed correctly
        if (currentPdfFileName.isNotEmpty()) {
            pdfView.postDelayed({
                loadPDF(currentPdfFileName)
            }, 100)
        }

        setupImmersiveMode()

        Toast.makeText(this, getString(R.string.normal_mode), Toast.LENGTH_SHORT).show()
    }

    private fun updateFullScreenButtons() {
        if (isFullScreen) {
            btnPdfFullScreen.visibility = View.GONE
            btnPdfMinimize.visibility = View.VISIBLE
        } else {
            btnPdfFullScreen.visibility = View.VISIBLE
            btnPdfMinimize.visibility = View.GONE
        }
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