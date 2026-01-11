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
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.adapters.ActivityAdapter
import com.bitrealm.mathwizdomapp.data.ActivityDataProvider
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.dialogs.VolumeControlDialog
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.launch
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.utils.NavigationHelper
import com.bitrealm.mathwizdomapp.utils.loadAvatarUri

class ActivityActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnBack: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var tvActivityTitle: TextView
    private lateinit var rvActivities: RecyclerView

    private lateinit var userRepository: UserRepository
    private lateinit var activityAdapter: ActivityAdapter
    private lateinit var lessonProgressDao: LessonProgressDao
    private var userIdentifier: String = ""
    private var quarter: Int = 1
    private var lessonNumber: Int = 1
    @Suppress("unused")
    private var isSpeakerEnabled = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get data from intent
        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""
        quarter = intent.getIntExtra("QUARTER", 1)
        lessonNumber = intent.getIntExtra("LESSON_NUMBER", 1)
        lessonProgressDao = database.lessonProgressDao()

        initViews()
        setupUI()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadUserData()
        loadActivities()
    }

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

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnBack = findViewById(R.id.btnBack)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        tvActivityTitle = findViewById(R.id.tvActivityTitle)
        rvActivities = findViewById(R.id.rvActivities)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        tvActivityTitle.text = "LESSON $lessonNumber - ACTIVITIES"
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
        }

        btnSpeaker.setOnClickListener {
            showVolumeDialog()
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
                    finish()
                }
            }
        })
    }

    private fun loadActivities() {
        lifecycleScope.launch {
            val activities = ActivityDataProvider.getActivitiesForLesson(quarter, lessonNumber)

            if (activities.isEmpty()) {
                Toast.makeText(this@ActivityActivity, "No activities available", Toast.LENGTH_SHORT).show()
                return@launch
            }

            // Load completion status for all activities
            val completionStatus = mutableMapOf<String, Boolean>()
            for (activity in activities) {
                val progress = lessonProgressDao.getActivityProgress(
                    userIdentifier,
                    quarter,
                    lessonNumber,
                    activity.id.toString()
                )
                // Activity is complete if score >= 3
                completionStatus[activity.id.toString()] = (progress != null && progress.score >= 3)
            }

            runOnUiThread {
                val recyclerView = findViewById<RecyclerView>(R.id.rvActivities)
                recyclerView.layoutManager = LinearLayoutManager(this@ActivityActivity)

                activityAdapter = ActivityAdapter(activities, completionStatus) { activity ->
                    navigateToActivityDetail(activity)
                }

                rvActivities.adapter = activityAdapter
            }
        }
    }
    private fun navigateToActivityDetail(activity: Activity) {
        val intent = Intent(this, ActivityDetailActivity::class.java)
        intent.putExtra("USER_IDENTIFIER", userIdentifier)
        intent.putExtra("QUARTER", quarter)
        intent.putExtra("LESSON_NUMBER", lessonNumber)
        intent.putExtra("ACTIVITY_ID", activity.id)
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

                        // Load avatar from URI - USE THE SAME METHOD AS DashboardActivity
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