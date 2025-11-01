package com.bitrealm.mathwizdomapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.core.net.toUri
import androidx.core.view.GravityCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.entities.User
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.google.android.material.navigation.NavigationView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.launch

class DashboardActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnMenu: ImageButton
    private lateinit var btnSpeaker: ImageButton
    private lateinit var tvLrnValue: TextView
    private lateinit var ivAvatar: ImageView
    private lateinit var btnEditAvatar: ImageButton
    private lateinit var btnEditName: ImageButton
    private lateinit var tvFullName: TextView
    private lateinit var tvGender: TextView

    private lateinit var userRepository: UserRepository
    private var currentUser: User? = null
    private var isSpeakerEnabled = true
    private var selectedAvatarUri: Uri? = null

    private val pickImageLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            result.data?.data?.let { uri ->
                selectedAvatarUri = uri
                ivAvatar.setImageURI(uri)
                updateUserAvatar(uri.toString())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get user identifier from intent
        val userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""

        initViews()
        setupNavigationDrawer()
        setupListeners()
        setupBackPressHandler()
        loadUserData(userIdentifier)
        loadSpeakerPreference()
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        btnMenu = findViewById(R.id.btnMenu)
        btnSpeaker = findViewById(R.id.btnSpeaker)
        tvLrnValue = findViewById(R.id.tvLrnValue)
        ivAvatar = findViewById(R.id.ivAvatar)
        btnEditAvatar = findViewById(R.id.btnEditAvatar)
        btnEditName = findViewById(R.id.btnEditName)
        tvFullName = findViewById(R.id.tvFullName)
        tvGender = findViewById(R.id.tvGender)
    }

    private fun setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(this)

        // Update navigation header with user name
        val headerView = navigationView.getHeaderView(0)
        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
        currentUser?.let {
            navHeaderUserName.text = it.fullName
        }
    }

    private fun setupListeners() {
        // Hamburger menu
        btnMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Speaker toggle
        btnSpeaker.setOnClickListener {
            toggleSpeaker()
        }

        // Edit avatar
        btnEditAvatar.setOnClickListener {
            openImagePicker()
        }

        // Edit name
        btnEditName.setOnClickListener {
            showEditNameDialog()
        }
    }

    private fun setupBackPressHandler() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    // Allow default back behavior
                    isEnabled = false
                    onBackPressedDispatcher.onBackPressed()
                }
            }
        })
    }

    private fun loadUserData(identifier: String) {
        lifecycleScope.launch {
            try {
                currentUser = userRepository.getUserByIdentifier(identifier)
                currentUser?.let { user ->
                    runOnUiThread {
                        tvLrnValue.text = user.identifier
                        tvFullName.text = user.fullName
                        tvGender.text = user.gender.name.lowercase().replaceFirstChar { it.uppercase() }

                        // Load avatar if exists
                        user.avatarUri?.let { uri ->
                            try {
                                ivAvatar.setImageURI(uri.toUri())
                            } catch (e: Exception) {
                                // Keep default avatar
                                println("Error loading avatar: ${e.message}")
                            }
                        }

                        // Update navigation header
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
                        navHeaderUserName.text = user.fullName
                    }
                }
            } catch (e: Exception) {
                runOnUiThread {
                    Toast.makeText(this@DashboardActivity, "Error loading user data", Toast.LENGTH_SHORT).show()
                }
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

    private fun openImagePicker() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        pickImageLauncher.launch(intent)
    }

    private fun updateUserAvatar(avatarUri: String) {
        currentUser?.let { user ->
            lifecycleScope.launch {
                try {
                    val updatedUser = user.copy(avatarUri = avatarUri)
                    userRepository.updateUser(updatedUser)
                    currentUser = updatedUser

                    runOnUiThread {
                        Toast.makeText(
                            this@DashboardActivity,
                            "Avatar updated successfully",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } catch (e: Exception) {
                    runOnUiThread {
                        Toast.makeText(
                            this@DashboardActivity,
                            "Failed to update avatar: ${e.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }

    private fun showEditNameDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_edit_name, null)
        val etNewName = dialogView.findViewById<TextInputEditText>(R.id.etNewName)

        // Pre-fill with current name
        etNewName.setText(currentUser?.fullName)

        AlertDialog.Builder(this)
            .setTitle("Edit Full Name")
            .setView(dialogView)
            .setPositiveButton("Save") { dialog, _ ->
                val newName = etNewName.text.toString().trim()
                if (newName.isNotBlank()) {
                    updateUserName(newName)
                } else {
                    Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_SHORT).show()
                }
                dialog.dismiss()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun updateUserName(newName: String) {
        currentUser?.let { user ->
            lifecycleScope.launch {
                try {
                    val updatedUser = user.copy(fullName = newName)
                    userRepository.updateUser(updatedUser)
                    currentUser = updatedUser

                    runOnUiThread {
                        tvFullName.text = newName

                        // Update navigation header
                        val headerView = navigationView.getHeaderView(0)
                        val navHeaderUserName = headerView.findViewById<TextView>(R.id.navHeaderUserName)
                        navHeaderUserName.text = newName

                        Toast.makeText(
                            this@DashboardActivity,
                            "Name updated successfully",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } catch (e: Exception) {
                    runOnUiThread {
                        Toast.makeText(
                            this@DashboardActivity,
                            "Failed to update name: ${e.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_lesson -> {
                Toast.makeText(this, "Lesson - Coming soon", Toast.LENGTH_SHORT).show()
                // TODO: Navigate to Lesson activity
                // val intent = Intent(this, LessonActivity::class.java)
                // startActivity(intent)
            }

            R.id.nav_activity -> {
                Toast.makeText(this, "Activity - Coming soon", Toast.LENGTH_SHORT).show()
                // TODO: Navigate to Activity activity
                // val intent = Intent(this, ActivityActivity::class.java)
                // startActivity(intent)
            }

            R.id.nav_logout -> {
                showLogoutDialog()
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
        // Clear any saved session data
        val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
        prefs.edit { clear() }

        // Navigate back to selection screen
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