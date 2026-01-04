package com.bitrealm.mathwizdomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.entities.Gender
import com.bitrealm.mathwizdomapp.database.entities.User
import com.bitrealm.mathwizdomapp.database.entities.UserRole
import com.bitrealm.mathwizdomapp.repository.UserRepository
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.launch

class RegistrationActivity : AppCompatActivity() {

    private lateinit var toolbar: MaterialToolbar
    private lateinit var tvNewUser: TextView
    private lateinit var tvIdentifier: TextView
    private lateinit var tilFullName: TextInputLayout
    private lateinit var etFullName: TextInputEditText
    private lateinit var tvGenderLabel: TextView
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton
    private lateinit var tvError: TextView
    private lateinit var btnRegister: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var rgGender: RadioGroup

    private lateinit var userRepository: UserRepository
    private var userRole: UserRole = UserRole.STUDENT
    private var identifier: String = ""
    private var selectedGender: Gender? = null
    private var isLoading = false

    // Constants for account limits
    private companion object {
        const val MAX_ACCOUNTS = 5
        const val REQUIRED_IDENTIFIER_LENGTH = 12
        const val MAX_FULL_NAME_LENGTH = 36
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        setupImmersiveMode()

        // Initialize database and repository
        val database = AppDatabase.getDatabase(this)
        userRepository = UserRepository(database.userDao())

        // Get data from intent
        val roleString = intent.getStringExtra("USER_ROLE") ?: "STUDENT"
        userRole = UserRole.valueOf(roleString)
        identifier = intent.getStringExtra("IDENTIFIER") ?: ""

        initViews()
        setupToolbar()
        setupUI()
        setupListeners()

        // Check account limit on create
        checkAccountLimit()
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
        toolbar = findViewById(R.id.toolbar)
        tvNewUser = findViewById(R.id.tvNewUser)
        tvIdentifier = findViewById(R.id.tvIdentifier)
        tilFullName = findViewById(R.id.tilFullName)
        etFullName = findViewById(R.id.etFullName)
        tvGenderLabel = findViewById(R.id.tvGenderLabel)
        rgGender = findViewById(R.id.rgGender)
        rbMale = findViewById(R.id.rbMale)
        rbFemale = findViewById(R.id.rbFemale)
        tvError = findViewById(R.id.tvError)
        btnRegister = findViewById(R.id.btnRegister)
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
            toolbar.title = getString(R.string.student_registration)
        } else {
            toolbar.title = getString(R.string.teacher_registration)
        }

        tvIdentifier.text = identifier

        // Set character limit for full name
        setupCharacterLimit()
    }

    private fun setupCharacterLimit() {
        // Set maximum character limit for full name (36 characters)
        val maxLengthFilter = InputFilter.LengthFilter(MAX_FULL_NAME_LENGTH)
        etFullName.filters = arrayOf(maxLengthFilter)

        // Update hint to show character limit
        tilFullName.hint = getString(R.string.full_name_hint, MAX_FULL_NAME_LENGTH)

        // Add counter to show remaining characters
        tilFullName.isCounterEnabled = true
        tilFullName.counterMaxLength = MAX_FULL_NAME_LENGTH
    }

    private fun setupListeners() {
        etFullName.doAfterTextChanged {
            validateForm()
            tilFullName.error = null
            tvError.visibility = View.GONE

            // Show warning if approaching limit
            val currentLength = it?.length ?: 0
            if (currentLength > MAX_FULL_NAME_LENGTH - 5) {
                val remaining = MAX_FULL_NAME_LENGTH - currentLength
                if (remaining >= 0) {
                    tilFullName.helperText = getString(R.string.characters_remaining, remaining)
                }
            } else {
                tilFullName.helperText = null
            }
        }

        rgGender.setOnCheckedChangeListener { _, checkedId ->
            selectedGender = when (checkedId) {
                R.id.rbMale -> Gender.MALE
                R.id.rbFemale -> Gender.FEMALE
                else -> null
            }

            validateForm()
            tvError.visibility = View.GONE
        }

        btnRegister.setOnClickListener {
            val fullName = etFullName.text?.toString()?.trim() ?: ""
            selectedGender?.let { gender ->
                onRegisterClick(fullName, gender)
            }
        }

        etFullName.setOnEditorActionListener { _, _, _ ->
            val fullName = etFullName.text?.toString()?.trim() ?: ""
            if (fullName.isNotBlank() && selectedGender != null) {
                selectedGender?.let { gender ->
                    onRegisterClick(fullName, gender)
                }
            }
            true
        }
    }

    private fun validateForm() {
        val fullName = etFullName.text?.toString()?.trim() ?: ""
        val isIdentifierValid = identifier.length == REQUIRED_IDENTIFIER_LENGTH
        val isFullNameValid = fullName.isNotBlank() && fullName.length <= MAX_FULL_NAME_LENGTH

        btnRegister.isEnabled = !isLoading && isFullNameValid && selectedGender != null && isIdentifierValid

        // Show identifier requirement error if not met
        if (!isIdentifierValid) {
            tvError.text = getString(R.string.identifier_required_length, REQUIRED_IDENTIFIER_LENGTH)
            tvError.visibility = View.VISIBLE
        }

        // Show full name length error if exceeded
        if (fullName.length > MAX_FULL_NAME_LENGTH) {
            tilFullName.error = getString(R.string.full_name_too_long, MAX_FULL_NAME_LENGTH)
        }
    }

    private fun onRegisterClick(fullName: String, gender: Gender) {
        // Check identifier length requirement
        if (identifier.length != REQUIRED_IDENTIFIER_LENGTH) {
            showError(getString(R.string.identifier_required_length, REQUIRED_IDENTIFIER_LENGTH))
            return
        }

        // Check full name length requirement
        if (fullName.length > MAX_FULL_NAME_LENGTH) {
            showError(getString(R.string.full_name_too_long, MAX_FULL_NAME_LENGTH))
            return
        }

        setLoadingState(true)

        // Save user to database
        lifecycleScope.launch {
            try {
                // Check account limit before registering
                val userCount = userRepository.getUserCountByRole(userRole)
                if (userCount >= MAX_ACCOUNTS) {
                    showError(getString(R.string.max_accounts_reached, MAX_ACCOUNTS, userRole.name.lowercase()))
                    setLoadingState(false)
                    return@launch
                }

                val user = User(
                    identifier = identifier,
                    fullName = fullName,
                    gender = gender,
                    role = userRole
                )

                userRepository.insertUser(user)

                android.widget.Toast.makeText(
                    this@RegistrationActivity,
                    getString(R.string.registration_successful),
                    android.widget.Toast.LENGTH_SHORT
                ).show()

                // Navigate to home
                navigateToHome()

            } catch (e: Exception) {
                showError(getString(R.string.registration_failed, e.message ?: getString(R.string.unknown_error)))
            } finally {
                setLoadingState(false)
            }
        }
    }

    private fun checkAccountLimit() {
        lifecycleScope.launch {
            try {
                val userCount = userRepository.getUserCountByRole(userRole)
                if (userCount >= MAX_ACCOUNTS) {
                    showError(getString(R.string.max_accounts_reached, MAX_ACCOUNTS, userRole.name.lowercase()))
                    btnRegister.isEnabled = false
                    etFullName.isEnabled = false
                    rgGender.isEnabled = false
                    rbMale.isEnabled = false
                    rbFemale.isEnabled = false
                }
            } catch (_: Exception) {
                // Handle error silently
            }
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, QuarterSelectionActivity::class.java)
        intent.putExtra("USER_IDENTIFIER", identifier)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }

    private fun setLoadingState(loading: Boolean) {
        isLoading = loading
        validateForm()
        etFullName.isEnabled = !loading
        rgGender.isEnabled = !loading
        rbMale.isEnabled = !loading
        rbFemale.isEnabled = !loading

        if (loading) {
            btnRegister.text = ""
            progressBar.visibility = View.VISIBLE
        } else {
            btnRegister.text = getString(R.string.register)
            progressBar.visibility = View.GONE
        }
    }

    private fun showError(message: String) {
        tvError.text = message
        tvError.visibility = View.VISIBLE
        tilFullName.error = " "
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