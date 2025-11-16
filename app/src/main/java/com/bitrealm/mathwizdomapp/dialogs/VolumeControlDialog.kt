package com.bitrealm.mathwizdomapp.dialogs

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.utils.MusicManager
import com.google.android.material.button.MaterialButton

class VolumeControlDialog(context: Context) : Dialog(context) {

    @SuppressLint("SetTextI18n", "UseKtx")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.volume_control_dialog)

        val seekBarVolume = findViewById<SeekBar>(R.id.seekBarVolume)
        val tvVolumePercent = findViewById<TextView>(R.id.tvVolumePercent)
        val btnMute = findViewById<MaterialButton>(R.id.btnMute)
        val btnClose = findViewById<MaterialButton>(R.id.btnClose)

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
}