package com.bitrealm.mathwizdomapp.dialogs

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupWindow
import android.widget.SeekBar
import android.widget.TextView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.button.MaterialButton

class VolumeControlDialog(private val context: Context) {

    private var popupWindow: PopupWindow? = null

    @SuppressLint("SetTextI18n", "UseKtx", "InflateParams")
    fun show(anchorView: View) {
        val inflater = LayoutInflater.from(context)
        val popupView = inflater.inflate(R.layout.volume_control_dialog, null)

        popupWindow = PopupWindow(
            popupView,
            (300 * context.resources.displayMetrics.density).toInt(), // 300dp width
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
            true
        ).apply {
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            elevation = 10f
            isOutsideTouchable = true
            isFocusable = true
        }

        val seekBarVolume = popupView.findViewById<SeekBar>(R.id.seekBarVolume)
        val tvVolumePercent = popupView.findViewById<TextView>(R.id.tvVolumePercent)
        val btnMute = popupView.findViewById<MaterialButton>(R.id.btnMute)
        val btnClose = popupView.findViewById<MaterialButton>(R.id.btnClose)

        // Set current volume
        val currentVolume = (MusicManager.getVolume() * 100).toInt()
        seekBarVolume.progress = currentVolume
        tvVolumePercent.text = "$currentVolume%"

        // Update button state
        updateMuteButton(btnMute)

        // Volume slider
        seekBarVolume.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val volume = progress / 100f
                MusicManager.setVolume(volume)
                tvVolumePercent.text = "$progress%"
                updateMuteButton(btnMute)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            @SuppressLint("UseKtx")
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Save volume preference
                val prefs = context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
                prefs.edit().putFloat("music_volume", MusicManager.getVolume()).apply()
            }
        })

        // Mute/Unmute button
        btnMute.setOnClickListener {
            MusicManager.toggleMute()
            updateMuteButton(btnMute)
            seekBarVolume.progress = (MusicManager.getVolume() * 100).toInt()
            tvVolumePercent.text = "${seekBarVolume.progress}%"

            // Save preference
            val prefs = context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
            prefs.edit().putFloat("music_volume", MusicManager.getVolume()).apply()
        }

        // Close button
        btnClose.setOnClickListener {
            dismiss()
        }

        // Calculate position to show below and to the left of the anchor view
        val location = IntArray(2)
        anchorView.getLocationOnScreen(location)

        val xOffset = location[0] - (300 * context.resources.displayMetrics.density).toInt() + anchorView.width
        val yOffset = location[1] + anchorView.height + (8 * context.resources.displayMetrics.density).toInt()

        popupWindow?.showAtLocation(anchorView, Gravity.NO_GRAVITY, xOffset, yOffset)
    }

    @SuppressLint("SetTextI18n")
    private fun updateMuteButton(button: MaterialButton) {
        if (MusicManager.isMuted()) {
            button.text = "Unmute"
            button.setIconResource(R.drawable.ic_volume_off)
        } else {
            button.text = "Mute"
            button.setIconResource(R.drawable.ic_volume_up)
        }
    }

    fun dismiss() {
        popupWindow?.dismiss()
    }
}