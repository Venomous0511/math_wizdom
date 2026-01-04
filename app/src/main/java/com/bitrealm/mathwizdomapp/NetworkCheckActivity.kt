package com.bitrealm.mathwizdomapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bitrealm.mathwizdomapp.utils.NetworkValidator

class NetworkCheckActivity : AppCompatActivity() {

    private lateinit var networkValidator: NetworkValidator
    private val handler = Handler(Looper.getMainLooper())
    private var isChecking = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        networkValidator = NetworkValidator(this)

        setContentView(ComposeView(this).apply {
            setContent {
                NetworkCheckScreen()
            }
        })
    }

    @Composable
    private fun NetworkCheckScreen() {
        var networkInfo by remember { mutableStateOf(networkValidator.getNetworkInfo()) }
        var isCheckingNetwork by remember { mutableStateOf(false) }

        // Auto-refresh every second to update countdown timer
        LaunchedEffect(Unit) {
            while (true) {
                kotlinx.coroutines.delay(1000)
                networkInfo = networkValidator.getNetworkInfo()
            }
        }

        MaterialTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFF5F5F5)
            ) {
                // FIXED: Added verticalScroll to make content scrollable
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()) // ← ADDED THIS
                        .padding(24.dp), // Reduced padding for more space
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Add top spacer for centering when content fits
                    Spacer(modifier = Modifier.weight(0.5f))

                    // Icon - changes based on timer state
                    Icon(
                        imageVector = if (networkInfo.timerInfo.isActivated) {
                            Icons.Default.Timer
                        } else {
                            Icons.Default.WifiOff
                        },
                        contentDescription = "Timer Status",
                        modifier = Modifier.size(100.dp), // Slightly smaller
                        tint = if (networkInfo.canUseApp) Color(0xFFFF9800) else Color(0xFFE57373)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // Title - changes based on state
                    Text(
                        text = when {
                            !networkInfo.timerInfo.isActivated -> "School Network Required"
                            networkInfo.timerInfo.timeRemainingMillis <= 0 -> "Daily Time Expired"
                            else -> "Daily Timer Active"
                        },
                        fontSize = 26.sp, // Slightly smaller
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF424242),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Description - context-aware message
                    Text(
                        text = when {
                            !networkInfo.timerInfo.isActivated ->
                                "Connect to school WiFi to activate your ${networkInfo.timerInfo.dailyLimit} daily usage time."
                            networkInfo.timerInfo.timeRemainingMillis <= 0 ->
                                "Your daily usage time has ended. The timer will reset tomorrow at midnight."
                            else ->
                                "You can use the app offline. Your timer continues counting down regardless of WiFi connection."
                        },
                        fontSize = 15.sp,
                        color = Color(0xFF757575),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 12.dp)
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Timer Display Card (only shown if timer is activated)
                    if (networkInfo.timerInfo.isActivated) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = if (networkInfo.canUseApp) Color(0xFFFF9800) else Color(0xFFE57373)
                            ),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "TIME REMAINING",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White.copy(alpha = 0.9f),
                                    letterSpacing = 2.sp
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = networkInfo.timerInfo.timeRemaining,
                                    fontSize = 42.sp, // Slightly smaller
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Started: ${networkInfo.timerInfo.startTime} • Ends: ${networkInfo.timerInfo.endTime}",
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.8f),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                    }

                    // Network Status Card
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                text = "Network Status",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF424242)
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            // Current WiFi
                            NetworkInfoRow(
                                icon = Icons.Default.Wifi,
                                label = "WiFi Network:",
                                value = networkInfo.ssid,
                                isValid = networkInfo.isWifiConnected
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            // IP Address
                            NetworkInfoRow(
                                icon = Icons.Default.LocationOn,
                                label = "IP Address:",
                                value = networkInfo.ipAddress,
                                isValid = networkInfo.isOnSchoolNetwork
                            )

                            if (networkInfo.timerInfo.isActivated) {
                                Spacer(modifier = Modifier.height(8.dp))

                                // Daily Limit
                                NetworkInfoRow(
                                    icon = Icons.Default.AccessTime,
                                    label = "Daily Limit:",
                                    value = networkInfo.timerInfo.dailyLimit,
                                    isValid = true
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            // Divider
                            HorizontalDivider(
                                thickness = 1.dp,
                                color = Color(0xFFE0E0E0)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            // Access Status
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Access Status:",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0xFF757575)
                                )

                                Surface(
                                    color = if (networkInfo.canUseApp) Color(0xFF4CAF50) else Color(0xFFE57373),
                                    shape = RoundedCornerShape(16.dp)
                                ) {
                                    Text(
                                        text = if (networkInfo.canUseApp) "Authorized" else "Not Authorized",
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White,
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Info Card - How timer works
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD)),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                tint = Color(0xFF1976D2),
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "Timer keeps counting down even if you disconnect WiFi.",
                                    fontSize = 12.sp,
                                    color = Color(0xFF1565C0),
                                    lineHeight = 16.sp
                                )
                                Text(
                                    text = "Reconnecting WiFi will NOT reset the timer.",
                                    fontSize = 11.sp,
                                    color = Color(0xFF1976D2).copy(alpha = 0.7f),
                                    lineHeight = 15.sp
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Action Button
                    Button(
                        onClick = {
                            isCheckingNetwork = true
                            checkNetworkAndProceed {
                                networkInfo = networkValidator.getNetworkInfo()
                                isCheckingNetwork = false
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp)
                            .height(52.dp),
                        enabled = !isCheckingNetwork,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF2196F3)
                        )
                    ) {
                        if (isCheckingNetwork) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(22.dp),
                                color = Color.White,
                                strokeWidth = 2.dp
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text("Checking...", fontSize = 15.sp)
                        } else {
                            Text(
                                text = if (!networkInfo.timerInfo.isActivated) {
                                    "Connect to School WiFi"
                                } else {
                                    "Retry Connection"
                                },
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Help Text
                    Text(
                        text = if (networkInfo.timerInfo.timeRemainingMillis <= 0 && networkInfo.timerInfo.isActivated) {
                            "Timer will reset tomorrow. See you at school!"
                        } else {
                            "Need help? Contact your teacher or school administrator."
                        },
                        fontSize = 11.sp,
                        color = Color(0xFF9E9E9E),
                        textAlign = TextAlign.Center
                    )

                    // Add bottom spacer for centering when content fits
                    Spacer(modifier = Modifier.weight(0.5f))
                }
            }
        }
    }

    @Composable
    private fun NetworkInfoRow(
        icon: androidx.compose.ui.graphics.vector.ImageVector,
        label: String,
        value: String,
        isValid: Boolean
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(15.dp),
                    tint = Color(0xFF757575)
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(
                    text = label,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF757575)
                )
            }
            Text(
                text = value,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                color = if (isValid) Color(0xFF4CAF50) else Color(0xFFE57373)
            )
        }
    }

    private fun checkNetworkAndProceed(onComplete: () -> Unit) {
        if (isChecking) return
        isChecking = true

        handler.postDelayed({
            if (networkValidator.canUseApp()) {
                // Validation successful - proceed to main app
                val intent = Intent(this, SelectionActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Still cannot access app - update UI
                onComplete()
            }
            isChecking = false
        }, 1500) // Small delay to show loading animation
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}