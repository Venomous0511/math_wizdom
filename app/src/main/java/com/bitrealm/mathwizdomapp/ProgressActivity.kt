package com.bitrealm.mathwizdomapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.adapters.ProgressAdapter
import com.bitrealm.mathwizdomapp.database.AppDatabase
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao
import com.bitrealm.mathwizdomapp.utils.MusicManager
import kotlinx.coroutines.launch

class ProgressActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton
    private lateinit var recyclerView: RecyclerView
    private lateinit var lessonProgressDao: LessonProgressDao
    private var userIdentifier: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        setupImmersiveMode()

        userIdentifier = intent.getStringExtra("USER_IDENTIFIER") ?: ""

        val database = AppDatabase.getDatabase(this)
        lessonProgressDao = database.lessonProgressDao()

        initViews()
        setupListeners()
        loadProgress()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        recyclerView = findViewById(R.id.recyclerViewProgress)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun loadProgress() {
        lifecycleScope.launch {
            val unlockedLessons = lessonProgressDao.getUnlockedLessons(userIdentifier)

            runOnUiThread {
                val adapter = ProgressAdapter(unlockedLessons)
                recyclerView.adapter = adapter
            }
        }
    }

    override fun onResume() {
        super.onResume()
        MusicManager.play()
    }

    override fun onPause() {
        super.onPause()
        MusicManager.pause()
    }

    private fun setupImmersiveMode() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.apply {
            hide(WindowInsetsCompat.Type.statusBars())
            hide(WindowInsetsCompat.Type.navigationBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) setupImmersiveMode()
    }
}