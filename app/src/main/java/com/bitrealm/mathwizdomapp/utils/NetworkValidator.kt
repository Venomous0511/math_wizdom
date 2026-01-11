@file:Suppress("RemoveRedundantCallsOfConversionMethods")

package com.bitrealm.mathwizdomapp.utils

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.wifi.WifiManager
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import java.util.Calendar
import java.util.concurrent.TimeUnit

class NetworkValidator(private val context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    companion object {
        private const val TAG = "NetworkValidator"
        private const val PREFS_NAME = "network_validation_prefs"
        private const val KEY_DAILY_START_TIME = "daily_start_timestamp"
        private const val KEY_CURRENT_DAY = "current_day_of_year"
        private const val KEY_IS_ACTIVATED_TODAY = "is_activated_today"

        // ============================================
        // CONFIGURE THESE VALUES FOR YOUR SCHOOL
        // ============================================

        // ⚠️ TESTING MODE - Set to true to bypass WiFi checks
        // When true: App works on ANY network (or no network)
        // When false: Requires school WiFi to activate timer
        private const val TESTING_MODE = true  // ← Change to false for production

        // School Wi-Fi SSID (name of the school's WiFi network)
        // Example: "SchoolWiFi2024" or "ABC_High_School"
        private const val SCHOOL_WIFI_SSID = "MathWizdom"
        private val VALID_IP_PREFIXES = listOf(
            "192.168.0",
            "192.168.1"
        )

        // Daily usage limit (in hours)
        // For testing: Use 0.05 (3 minutes) or 0.5 (30 minutes)
        // For production: Use 8.0L (8 hours)
        private const val DAILY_USAGE_HOURS = 12L

        // ============================================
    }

    @SuppressLint("ObsoleteSdkInt")
    fun hasLocationPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            true // Not required on older Android versions
        }
    }

    fun canUseApp(): Boolean {
        checkAndResetIfNewDay()

        // TESTING MODE: Skip WiFi check and activate timer immediately
        if (TESTING_MODE) {
            activateDailyTimer()
            Log.d(TAG, "⚠️ TESTING MODE - Timer activated without WiFi check")
            return true
        }

        // PRODUCTION MODE: Require school network
        if (isConnectedToWifi() && isOnSchoolNetwork()) {
            activateDailyTimer()
            Log.d(TAG, "✓ On school network - timer active")
            return true
        }

        val timerActive = isDailyTimerActive()
        val timeRemaining = getDailyTimeRemaining()

        if (timerActive) {
            Log.d(TAG, "✓ Using offline with timer - ${formatTime(timeRemaining)} remaining")
            return true
        }

        Log.d(TAG, "✗ Access denied - timer expired or not activated")
        return false
    }

    private fun checkAndResetIfNewDay() {
        val today = getDayOfYear()
        val savedDay = prefs.getInt(KEY_CURRENT_DAY, -1)

        if (today != savedDay) {
            Log.d(TAG, "New day detected - resetting daily timer")
            prefs.edit().apply {
                putInt(KEY_CURRENT_DAY, today)
                putBoolean(KEY_IS_ACTIVATED_TODAY, false)
                remove(KEY_DAILY_START_TIME)
                apply()
            }
        }
    }

    private fun activateDailyTimer() {
        val isActivated = prefs.getBoolean(KEY_IS_ACTIVATED_TODAY, false)

        if (!isActivated) {
            val currentTime = System.currentTimeMillis()
            prefs.edit().apply {
                putLong(KEY_DAILY_START_TIME, currentTime)
                putBoolean(KEY_IS_ACTIVATED_TODAY, true)
                putInt(KEY_CURRENT_DAY, getDayOfYear())
                apply()
            }

            val endTime = getFormattedEndTime()
            val mode = if (TESTING_MODE) "TESTING MODE" else "Production"
            Log.d(TAG, "Daily timer activated [$mode] - ${DAILY_USAGE_HOURS}h available until $endTime")
        } else {
            val timeRemaining = getDailyTimeRemaining()
            Log.d(TAG, "Daily timer already active - ${formatTime(timeRemaining)} remaining")
        }
    }

    private fun isDailyTimerActive(): Boolean {
        val isActivated = prefs.getBoolean(KEY_IS_ACTIVATED_TODAY, false)
        if (!isActivated) return false

        val startTime = prefs.getLong(KEY_DAILY_START_TIME, 0)
        if (startTime == 0L) return false

        val currentTime = System.currentTimeMillis()
        val elapsedTime = currentTime - startTime

        // Convert hours to milliseconds (handles decimal hours correctly)
        val dailyLimitMillis = (DAILY_USAGE_HOURS * 3600000).toLong()

        return elapsedTime < dailyLimitMillis
    }

    private fun getDailyTimeRemaining(): Long {
        val isActivated = prefs.getBoolean(KEY_IS_ACTIVATED_TODAY, false)
        if (!isActivated) return 0L

        val startTime = prefs.getLong(KEY_DAILY_START_TIME, 0)
        if (startTime == 0L) return 0L

        val currentTime = System.currentTimeMillis()
        val elapsedTime = currentTime - startTime

        // Convert hours to milliseconds (handles decimal hours correctly)
        val dailyLimitMillis = (DAILY_USAGE_HOURS * 3600000).toLong()
        val remaining = dailyLimitMillis - elapsedTime

        return if (remaining > 0) remaining else 0L
    }

    private fun formatTime(milliseconds: Long): String {
        if (milliseconds <= 0) return "Expired"

        val hours = TimeUnit.MILLISECONDS.toHours(milliseconds)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds) % 60
        val seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds) % 60

        return when {
            hours > 0 -> "${hours}h ${minutes}m"
            minutes > 0 -> "${minutes}m ${seconds}s"
            else -> "${seconds}s"
        }
    }

    @SuppressLint("DefaultLocale")
    private fun getFormattedEndTime(): String {
        val startTime = prefs.getLong(KEY_DAILY_START_TIME, 0)
        if (startTime == 0L) return "Not activated"

        // Convert hours to milliseconds (handles decimal hours correctly)
        val dailyLimitMillis = (DAILY_USAGE_HOURS * 3600000).toLong()
        val endTimeMillis = startTime + dailyLimitMillis
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = endTimeMillis

        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        val amPm = if (hour < 12) "AM" else "PM"
        val displayHour = if (hour > 12) hour - 12 else if (hour == 0) 12 else hour

        return String.format("%d:%02d %s", displayHour, minute, amPm)
    }

    private fun getDayOfYear(): Int {
        val calendar = Calendar.getInstance()
        return calendar.get(Calendar.DAY_OF_YEAR)
    }

    @SuppressLint("DefaultLocale")
    fun getTimerInfo(): TimerInfo {
        val isActivated = prefs.getBoolean(KEY_IS_ACTIVATED_TODAY, false)
        val timeRemaining = getDailyTimeRemaining()
        val startTime = prefs.getLong(KEY_DAILY_START_TIME, 0)

        val startTimeFormatted = if (startTime > 0) {
            val calendar = Calendar.getInstance()
            calendar.timeInMillis = startTime
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val amPm = if (hour < 12) "AM" else "PM"
            val displayHour = if (hour > 12) hour - 12 else if (hour == 0) 12 else hour
            String.format("%d:%02d %s", displayHour, minute, amPm)
        } else {
            "Not started"
        }

        return TimerInfo(
            isActivated = isActivated,
            timeRemaining = formatTime(timeRemaining),
            timeRemainingMillis = timeRemaining,
            startTime = startTimeFormatted,
            endTime = getFormattedEndTime(),
            dailyLimit = "${DAILY_USAGE_HOURS}h",
            canUseApp = canUseApp(),
            testingMode = TESTING_MODE
        )
    }

    private fun isOnSchoolNetwork(): Boolean {
        // In testing mode, always return true
        if (TESTING_MODE) {
            Log.d(TAG, "⚠️ TESTING MODE - Skipping network validation")
            return true
        }

        val isCorrectSSID = isConnectedToSchoolWifi()
        val isCorrectIP = isOnSchoolIPRange()

        Log.d(TAG, "Network validation: SSID=$isCorrectSSID, IP=$isCorrectIP")

        return isCorrectSSID && isCorrectIP
    }

    @SuppressLint("ObsoleteSdkInt")
    private fun isConnectedToWifi(): Boolean {
        // In testing mode, pretend we're always connected
        if (TESTING_MODE) return true

        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
        } else {
            @Suppress("DEPRECATION")
            val networkInfo = connectivityManager.activeNetworkInfo
            @Suppress("DEPRECATION")
            networkInfo?.type == ConnectivityManager.TYPE_WIFI && networkInfo.isConnected
        }
    }

    /**
     * Check if connected to school's specific Wi-Fi SSID
     * UPDATED: Added permission check for Android 10+
     */
    private fun isConnectedToSchoolWifi(): Boolean {
        if (!isConnectedToWifi()) return false

        // Check location permission on Android 10+
        if (!hasLocationPermission()) {
            Log.w(TAG, "Location permission not granted - cannot read SSID")
            return false
        }

        val wifiManager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        return try {
            @Suppress("DEPRECATION")
            val wifiInfo = wifiManager.connectionInfo
            val ssid = wifiInfo.ssid.replace("\"", "")

            Log.d(TAG, "Current SSID: $ssid")

            ssid == SCHOOL_WIFI_SSID || ssid.equals(SCHOOL_WIFI_SSID, ignoreCase = true)
        } catch (e: Exception) {
            Log.e(TAG, "Error checking SSID", e)
            false
        }
    }

    @SuppressLint("DefaultLocale")
    private fun isOnSchoolIPRange(): Boolean {
        if (!isConnectedToWifi()) return false

        val wifiManager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        return try {
            @Suppress("DEPRECATION")
            val dhcpInfo = wifiManager.dhcpInfo
            val ipAddress = dhcpInfo.ipAddress

            val ip = String.format(
                "%d.%d.%d.%d",
                ipAddress and 0xff,
                ipAddress shr 8 and 0xff,
                ipAddress shr 16 and 0xff,
                ipAddress shr 24 and 0xff
            )

            Log.d(TAG, "Current IP Address: $ip")

            VALID_IP_PREFIXES.any { prefix -> ip.startsWith(prefix) }

        } catch (e: Exception) {
            Log.e(TAG, "Error checking IP range", e)
            false
        }
    }

    @SuppressLint("DefaultLocale")
    fun getNetworkInfo(): NetworkInfo {
        val wifiManager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        @Suppress("DEPRECATION")
        val ssid = try {
            if (TESTING_MODE) {
                "TESTING MODE"
            } else if (isConnectedToWifi()) {
                if (!hasLocationPermission()) {
                    "<unknown ssid>"
                } else {
                    wifiManager.connectionInfo.ssid.replace("\"", "")
                }
            } else {
                "Not connected"
            }
        } catch (_: Exception) {
            "Unknown"
        }

        val ipAddress = try {
            if (TESTING_MODE) {
                "TESTING MODE"
            } else if (isConnectedToWifi()) {
                @Suppress("DEPRECATION")
                val dhcpInfo = wifiManager.dhcpInfo
                val ip = dhcpInfo.ipAddress
                String.format(
                    "%d.%d.%d.%d",
                    ip and 0xff,
                    ip shr 8 and 0xff,
                    ip shr 16 and 0xff,
                    ip shr 24 and 0xff
                )
            } else {
                "No WiFi"
            }
        } catch (_: Exception) {
            "Unknown"
        }

        val timerInfo = getTimerInfo()

        return NetworkInfo(
            ssid = ssid,
            ipAddress = ipAddress,
            isWifiConnected = if (TESTING_MODE) true else isConnectedToWifi(),
            isOnSchoolNetwork = if (TESTING_MODE) true else isOnSchoolNetwork(),
            canUseApp = canUseApp(),
            timerInfo = timerInfo,
            hasLocationPermission = hasLocationPermission(),
            testingMode = TESTING_MODE
        )
    }

    @SuppressLint("UseKtx")
    @Suppress("unused")
    fun resetTimer() {
        prefs.edit().clear().apply()
        Log.d(TAG, "Timer reset - all data cleared")
    }

    data class TimerInfo(
        val isActivated: Boolean,
        val timeRemaining: String,
        val timeRemainingMillis: Long,
        val startTime: String,
        val endTime: String,
        val dailyLimit: String,
        val canUseApp: Boolean,
        val testingMode: Boolean = false
    )

    data class NetworkInfo(
        val ssid: String,
        val ipAddress: String,
        val isWifiConnected: Boolean,
        val isOnSchoolNetwork: Boolean,
        val canUseApp: Boolean,
        val timerInfo: TimerInfo,
        val hasLocationPermission: Boolean,
        val testingMode: Boolean = false
    )
}