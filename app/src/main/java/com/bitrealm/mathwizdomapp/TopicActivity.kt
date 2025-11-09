package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
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
import com.bitrealm.mathwizdomapp.adapters.SubtopicAdapter
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.models.Subtopic
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
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
    private lateinit var pdfView: PDFView
    private lateinit var ivAnimal: ImageView

    private lateinit var userRepository: UserRepository
    private lateinit var subtopicAdapter: SubtopicAdapter
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    private var isSpeakerEnabled = true

    companion object {
        private val quarterAnimals = mapOf(
            1 to R.drawable.cat,
            2 to R.drawable.bird,
            3 to R.drawable.dragon,
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
        pdfView = findViewById(R.id.pdfView)
        ivAnimal = findViewById(R.id.ivAnimal)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvTopicTitle.text = "LESSON $lessonNumber - TOPIC"
        ivAnimal.setImageResource(quarterAnimals[quarter] ?: R.drawable.cat)

        // Set objective text based on lesson
        tvObjective.text = getObjectiveText()
    }

    private fun getObjectiveText(): String {
        return when ("${quarter}_$lessonNumber") {
            "1_1" -> "After this lesson, you should be able to add and subtract simple fractions and mixed numbers, whether with regrouping or without regrouping."
            "2_1" -> "After this lesson, you should be able to relate fractions and ratios."
            "3_1" -> "After this lesson, you should be able to know a geometry of solid figures and its features."
            else -> "Complete this lesson to master the concepts."
        }
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
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

    private fun setupSubtopics() {
        val lessonKey = "${quarter}_$lessonNumber"
        val subtopics = lessonSubtopics[lessonKey] ?: emptyList()

        subtopicAdapter = SubtopicAdapter(subtopics) { subtopic ->
            loadPDF(subtopic.pdfFileName)
        }

        rvSubtopics.adapter = subtopicAdapter

        // Load first subtopic by default
        if (subtopics.isNotEmpty()) {
            loadPDF(subtopics[0].pdfFileName)
        }
    }

    private fun loadPDF(fileName: String) {
        try {
            val assetPath = "quarter_$quarter/lesson_$lessonNumber/$fileName"

            pdfView.fromAsset(assetPath)
                .swipeHorizontal(true) // Enable horizontal scrolling
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .scrollHandle(DefaultScrollHandle(this))
                .onError { error ->
                    Toast.makeText(
                        this,
                        "Error loading PDF: ${error.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                    println("PDF Error: ${error.message}")
                }
                .onPageChange { page, pageCount ->
                    // Optional: Track page changes
                    println("Page $page of $pageCount")
                }
                .load()
        } catch (e: Exception) {
            Toast.makeText(this, "PDF not found: $fileName", Toast.LENGTH_SHORT).show()
            println("Error: ${e.message}")
        }
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