@file:Suppress("unused")

package com.bitrealm.mathwizdomapp.utils

import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException

object MusicManager {
    private var mediaPlayer: MediaPlayer? = null
    private var currentVolume = 0.5f
    private var isVideoPaused = false
    private var isMusicEnabled = true

    fun init(context: Context) {
        if (mediaPlayer == null) {
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    val newPlayer = MediaPlayer().apply {
                        val assetManager = context.assets
                        val afd = assetManager.openFd("music/background_music.mp3")
                        setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                        afd.close()

                        isLooping = true
                        setVolume(currentVolume, currentVolume)
                        prepareAsync()

                        setOnPreparedListener {
                            // Auto-play when ready if music is enabled
                            if (isMusicEnabled && !isVideoPaused) {
                                start()
                            }
                        }

                        setOnErrorListener { _, what, extra ->
                            Log.e("MusicManager", "MediaPlayer error: what=$what, extra=$extra")
                            true
                        }
                    }

                    withContext(Dispatchers.Main) {
                        mediaPlayer = newPlayer
                    }
                } catch (e: IOException) {
                    Log.e("MusicManager", "Failed to initialize music", e)
                }
            }
        }
    }

    /**
     * Resume music playback (use for onResume)
     */
    fun resume() {
        if (isMusicEnabled && !isVideoPaused && mediaPlayer?.isPlaying == false) {
            mediaPlayer?.start()
        }
    }

    /**
     * Pause music temporarily (use for onPause)
     */
    fun pause() {
        if (mediaPlayer?.isPlaying == true) {
            mediaPlayer?.pause()
        }
    }

    /**
     * Pause music for video playback
     */
    fun pauseForVideo() {
        isVideoPaused = true
        pause()
    }

    /**
     * Resume music after video playback
     */
    fun resumeAfterVideo() {
        isVideoPaused = false
        resume()
    }

    /**
     * Enable or disable music globally
     */
    fun setMusicEnabled(enabled: Boolean) {
        isMusicEnabled = enabled
        if (enabled) {
            resume()
        } else {
            pause()
        }
    }

    fun isMusicEnabled() = isMusicEnabled

    fun setVolume(volume: Float) {
        currentVolume = volume.coerceIn(0f, 1f)
        mediaPlayer?.setVolume(currentVolume, currentVolume)
    }

    fun getVolume() = currentVolume

    fun increaseVolume() {
        setVolume(currentVolume + 0.1f)
    }

    fun decreaseVolume() {
        setVolume(currentVolume - 0.1f)
    }

    fun isMuted() = currentVolume == 0f

    fun toggleMute() {
        if (isMuted()) {
            setVolume(0.5f)
        } else {
            setVolume(0f)
        }
    }

    /**
     * Complete cleanup - ONLY call this when app is truly finishing
     */
    fun release() {
        mediaPlayer?.apply {
            if (isPlaying) stop()
            release()
        }
        mediaPlayer = null
    }

    /**
     * Check if MediaPlayer is currently playing
     */
    fun isPlaying() = mediaPlayer?.isPlaying == true
}