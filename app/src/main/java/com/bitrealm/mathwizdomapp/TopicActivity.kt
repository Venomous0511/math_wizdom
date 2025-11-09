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
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
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

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.rat,
        4 to R.drawable.fox
    )

    // Define subtopics for each lesson
    private val lessonSubtopics = mapOf(
        "1_1" to listOf(
            Subtopic(1, "Similar and Dissimilar Fractions", "topic1.pdf"),
            Subtopic(2, "Add Simple and Mixed Fractions", "topic2.pdf"),
            Subtopic(3, "Subtract Simple and Mixed Fractions", "topic3.pdf")
        ),
        "2_1" to listOf(
            Subtopic(1, "Relating Fraction and Ratio", "topic1.pdf"),
        ),
        "3_1" to listOf(
            Subtopic(1, "Planes and Solid Figures and its Features", "topic1.pdf"),
        ),
        "4_1" to listOf()
    )

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
        } else {
            // Show message if no subtopics available
            tvObjective.text = "No content available for this lesson yet."
        }
    }

    private fun loadPDF(fileName: String) {
        try {
            currentPdfFileName = fileName

            // Try multiple possible paths
            val possiblePaths = listOf(
                "quarter_$quarter/lesson_$lessonNumber/$fileName",
                "quarter$quarter/lesson$lessonNumber/$fileName",
                "quarter_$quarter/$fileName",
                "pdfs/quarter_$quarter/lesson_$lessonNumber/$fileName",
                "pdfs/$fileName",
                fileName,
                "sample.pdf"
            )

            var pdfLoaded = false

            for (path in possiblePaths) {
                try {
                    println("Trying to load PDF from: $path")

                    pdfView.fromAsset(path)
                        .swipeHorizontal(true)
                        .pageSnap(true)
                        .autoSpacing(true)
                        .pageFling(true)
                        .scrollHandle(DefaultScrollHandle(this))
                        .onError { error ->
                            println("Failed to load from $path: ${error.message}")
                        }
                        .onLoad { nbPages ->
                            println("SUCCESS: PDF loaded from $path - Pages: $nbPages")
                            pdfLoaded = true
                            runOnUiThread {
                                Toast.makeText(this, "Content loaded successfully", Toast.LENGTH_SHORT).show()
                            }
                        }
                        .load()

                    if (pdfLoaded) {
                        return
                    }

                } catch (e: Exception) {
                    println("Exception with path $path: ${e.message}")
                }
            }

            // If no PDF was loaded, show message
            if (!pdfLoaded) {
                runOnUiThread {
                    Toast.makeText(this, "Content file not found: $fileName", Toast.LENGTH_LONG).show()
                }
            }

        } catch (e: Exception) {
            runOnUiThread {
                Toast.makeText(this, "Error loading content", Toast.LENGTH_LONG).show()
            }
            println("Exception loading PDF: ${e.message}")
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
        constraintSet.connect(pdfContainer.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        constraintSet.connect(pdfContainer.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
        constraintSet.connect(pdfContainer.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        constraintSet.connect(pdfContainer.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

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
        windowInsetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
        windowInsetsController.hide(WindowInsetsCompat.Type.navigationBars())
        windowInsetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
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