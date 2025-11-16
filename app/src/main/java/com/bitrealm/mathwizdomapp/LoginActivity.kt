package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.entities.UserRole
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    private lateinit var toolbar: MaterialToolbar
    private lateinit var tvRoleEmoji: TextView
    private lateinit var tvRoleTitle: TextView
    private lateinit var tilIdentifier: TextInputLayout
    private lateinit var etIdentifier: TextInputEditText
    private lateinit var tvError: TextView
    private lateinit var btnSubmit: Button
    private lateinit var progressBar: ProgressBar

    private lateinit var userRepository: UserRepository
    private var userRole: UserRole = UserRole.STUDENT
    private var isLoading = false

    // Different identifier lengths for student and teacher
    private val studentIdentifierLength = 12
    private val teacherIdentifierLength = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get role from intent
        val roleString = intent.getStringExtra("USER_ROLE") ?: "STUDENT"
        userRole = UserRole.valueOf(roleString)

        initViews()
        setupToolbar()
        setupUI()
        setupListeners()
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        tvRoleEmoji = findViewById(R.id.tvRoleEmoji)
        tvRoleTitle = findViewById(R.id.tvRoleTitle)
        tilIdentifier = findViewById(R.id.tilIdentifier)
        etIdentifier = findViewById(R.id.etIdentifier)
        tvError = findViewById(R.id.tvError)
        btnSubmit = findViewById(R.id.btnSubmit)
        progressBar = findViewById(R.id.progressBar)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        if (userRole == UserRole.STUDENT) {
            toolbar.title = "Student"
            tvRoleEmoji.text = "👨‍🎓"
            tvRoleTitle.text = "Student"
            tilIdentifier.hint = "LRN (Learner Reference No.)"
        } else {
            toolbar.title = "Teacher"
            tvRoleEmoji.text = "👨‍🏫"
            tvRoleTitle.text = "Teacher"
            tilIdentifier.hint = "Employee Number"
        }

        // Set up restrictions for both roles
        setupIdentifierRestrictions()

        // Initial validation
        validateIdentifier()
    }

    private fun setupIdentifierRestrictions() {
        // Set maximum length based on role
        val maxLength = if (userRole == UserRole.STUDENT) studentIdentifierLength else teacherIdentifierLength
        val maxLengthFilter = InputFilter.LengthFilter(maxLength)
        etIdentifier.filters = arrayOf(maxLengthFilter)

        // Allow only numbers for both roles
        etIdentifier.inputType = InputType.TYPE_CLASS_NUMBER

        // Remove counter and helper text to hide digit requirements
        tilIdentifier.isCounterEnabled = false
        tilIdentifier.helperText = null
    }

    private fun setupListeners() {
        etIdentifier.doAfterTextChanged { text ->
            validateIdentifier()
            tilIdentifier.error = null
            tvError.visibility = View.GONE

            // Remove real-time feedback to hide digit requirements
            // Just clear helper text
            tilIdentifier.helperText = null
        }

        btnSubmit.setOnClickListener {
            val identifier = etIdentifier.text?.toString() ?: ""
            if (isValidIdentifier(identifier)) {
                onLoginClick(identifier)
            }
        }

        etIdentifier.setOnEditorActionListener { _, _, _ ->
            val identifier = etIdentifier.text?.toString() ?: ""
            if (isValidIdentifier(identifier)) {
                onLoginClick(identifier)
            }
            true
        }
    }

    private fun validateIdentifier() {
        val identifier = etIdentifier.text?.toString() ?: ""
        val isValid = isValidIdentifier(identifier)

        btnSubmit.isEnabled = !isLoading && isValid

        // Show error for invalid identifier length without revealing required digits
        if (identifier.isNotEmpty() && !isValid) {
            if (userRole == UserRole.STUDENT) {
                tilIdentifier.error = "Please enter a valid LRN"
            } else {
                tilIdentifier.error = "Please enter a valid employee number"
            }
        } else {
            tilIdentifier.error = null
        }
    }

    private fun isValidIdentifier(identifier: String): Boolean {
        val requiredLength = if (userRole == UserRole.STUDENT) studentIdentifierLength else teacherIdentifierLength

        // Must be exactly the required digits and contain only numbers
        return identifier.length == requiredLength && identifier.matches(Regex("\\d+"))
    }

    private fun onLoginClick(identifier: String) {
        // Validate identifier before proceeding
        if (!isValidIdentifier(identifier)) {
            if (userRole == UserRole.STUDENT) {
                showError("Please enter a valid LRN")
            } else {
                showError("Please enter a valid employee number")
            }
            return
        }

        setLoadingState(true)

        // Check database for user
        lifecycleScope.launch {
            try {
                val userExists = userRepository.userExists(identifier)

                if (userExists) {
                    // User exists, get user data and navigate to home
                    val user = userRepository.getUserByIdentifier(identifier)
                    user?.let {
                        navigateToHome(it.identifier, it.fullName)
                    }
                } else {
                    // New user, navigate to registration
                    navigateToRegistration(identifier)
                }
            } catch (e: Exception) {
                showError("Error checking user: ${e.message}")
            } finally {
                setLoadingState(false)
            }
        }
    }

    private fun navigateToHome(identifier: String, fullName: String) {
        val intent = Intent(this, QuarterSelectionActivity::class.java)
        intent.putExtra("USER_IDENTIFIER", identifier)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()

        Toast.makeText(this, "Welcome back, $fullName!", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToRegistration(identifier: String) {
        val intent = Intent(this, RegistrationActivity::class.java)
        intent.putExtra("USER_ROLE", userRole.name)
        intent.putExtra("IDENTIFIER", identifier)
        startActivity(intent)
    }

    @SuppressLint("SetTextI18n")
    private fun setLoadingState(loading: Boolean) {
        isLoading = loading
        validateIdentifier() // Re-validate when loading state changes
        etIdentifier.isEnabled = !loading

        if (loading) {
            btnSubmit.text = ""
            progressBar.visibility = View.VISIBLE
        } else {
            btnSubmit.text = "Submit" // Changed from "Login" to "Submit"
            progressBar.visibility = View.GONE
        }
    }

    private fun showError(message: String) {
        tvError.text = message
        tvError.visibility = View.VISIBLE
        tilIdentifier.error = " "
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)

        windowInsetsController?.apply {
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