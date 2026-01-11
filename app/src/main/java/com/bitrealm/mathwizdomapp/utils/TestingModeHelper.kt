package com.bitrealm.mathwizdomapp.utils

import android.content.Context

object TestingModeHelper {
    private const val PREFS_NAME = "testing_mode_prefs"
    private const val KEY_TESTING_MODE = "is_testing_mode_enabled"

    fun isTestingModeEnabled(context: Context): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getBoolean(KEY_TESTING_MODE, false)
    }

    fun toggleTestingMode(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val currentState = prefs.getBoolean(KEY_TESTING_MODE, false)
        prefs.edit().putBoolean(KEY_TESTING_MODE, !currentState).apply()
    }
}