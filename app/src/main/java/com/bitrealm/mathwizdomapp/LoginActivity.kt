package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.ImageView
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
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    private lateinit var ivRoleIcon: ImageView
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
        setupUI()
        setupListeners()
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun initViews() {
        ivRoleIcon = findViewById(R.id.ivRoleIcon)
        tvRoleTitle = findViewById(R.id.tvRoleTitle)
        tilIdentifier = findViewById(R.id.tilIdentifier)
        etIdentifier = findViewById(R.id.etIdentifier)
        tvError = findViewById(R.id.tvError)
        btnSubmit = findViewById(R.id.btnSubmit)
        progressBar = findViewById(R.id.progressBar)
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        if (userRole == UserRole.STUDENT) {
            ivRoleIcon.setImageResource(R.drawable.student_icon)
            tvRoleTitle.text = "Student"
            tilIdentifier.hint = "LRN (Learner Reference No.)"
        } else {
//            ivRoleIcon.setImageResource(R.drawable.teacher_icon)
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

        // Show error for invalid identifier length
        if (identifier.isNotEmpty() && !isValid) {
            if (userRole == UserRole.STUDENT) {
                tilIdentifier.error = "LRN must be exactly 12 digits"
            } else {
                tilIdentifier.error = "Employee number must be exactly 7 digits"
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

    private val validLrnPrefixes = listOf("109636", "109635", "109632")
    private val maxStudentsPerLrn = 5
    private fun onLoginClick(identifier: String) {
        // Validate identifier before proceeding
        if (!isValidIdentifier(identifier)) {
            showError("LRN must be exactly 12 digits")
            showAlertError("LRN must be exactly 12 digits")
            return
        }

        // Check if LRN prefix is valid (for students only)
        if (userRole == UserRole.STUDENT) {
            val prefix = identifier.take(6)
            if (!validLrnPrefixes.contains(prefix)) {
                showError("Invalid LRN. Please check your Learner Reference Number.")
                showAlertError("Invalid LRN. Please check your Learner Reference Number.")
                return
            }
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
                    // For students, check if max registration limit reached for this LRN prefix
                    if (userRole == UserRole.STUDENT) {
                        val prefix = identifier.take(6)
                        val registeredCount = userRepository.getStudentCountByLrnPrefix(prefix)

                        if (registeredCount >= maxStudentsPerLrn) {
                            runOnUiThread {
                                showError("Maximum registrations (5) reached for this LRN series. Please contact your administrator.")
                                showAlertError("Maximum registrations (5) reached for this LRN series. Please contact your administrator.")
                            }
                            setLoadingState(false)
                            return@launch
                        }
                    }

                    // New user, navigate to registration
                    navigateToRegistration(identifier)
                }
            } catch (e: Exception) {
                runOnUiThread {
                    showError("Error checking user: ${e.message}")
                    showAlertError("Error checking user: ${e.message}")
                }
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
            btnSubmit.text = "Submit"
            progressBar.visibility = View.GONE
        }
    }

    private fun showError(message: String) {
        tvError.text = message
        tvError.visibility = View.VISIBLE
        tilIdentifier.error = " "
    }

    private fun showAlertError(message: String) {
        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle("Error")
            .setMessage(message)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .show()
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