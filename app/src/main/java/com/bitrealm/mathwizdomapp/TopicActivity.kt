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

    private val quarterAnimals = mapOf(
        1 to R.drawable.cat,
        2 to R.drawable.bird,
        3 to R.drawable.dragon,
        4 to R.drawable.fox
    )

    // Define subtopics for each lesson
    private val lessonSubtopics = mapOf(
        "1_1" to listOf(
            Subtopic(1, "Similar and Dissimilar Fractions", "topic_1.pdf"),
            Subtopic(2, "Add Simple and Mixed Fractions with Regrouping or without Regrouping", "topic_2.pdf"),
            Subtopic(3, "Subtract Simple and Mixed Fractions with Regrouping or without Regrouping", "topic_3.pdf")
        ),
        "2_1" to listOf(
            Subtopic(1, "Relating Fraction and Ratio", "topic_1.pdf"),
        ),
        "3_1" to listOf(
            Subtopic(1, "Planes and Solid Figures and its Features", "topic_1.pdf"),
        ),
        "4_1" to listOf(

        )
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