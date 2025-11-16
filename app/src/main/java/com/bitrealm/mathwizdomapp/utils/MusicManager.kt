package com.bitrealm.mathwizdomapp.utils

import android.content.Context
import android.media.MediaPlayer
import java.io.IOException

object MusicManager {
    private var mediaPlayer: MediaPlayer? = null
    private var currentVolume = 0.5f
    private var isVideoPaused = false // Track if paused due to video

    fun init(context: Context) {
        if (mediaPlayer == null) {
            try {
                mediaPlayer = MediaPlayer().apply {
                    val assetManager = context.assets
                    val afd = assetManager.openFd("music/background_music.mp3")
                    setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                    afd.close()

                    isLooping = true
                    setVolume(currentVolume, currentVolume)
                    prepare()
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    fun play() {
        if (!isVideoPaused && mediaPlayer?.isPlaying == false) {
            mediaPlayer?.start()
        }
    }

    fun pause() {
        if (mediaPlayer?.isPlaying == true) {
            mediaPlayer?.pause()
        }
    }

    fun pauseForVideo() {
        isVideoPaused = true
        pause()
    }

    fun resumeAfterVideo() {
        isVideoPaused = false
        play()
    }

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

    fun stop() {
        mediaPlayer?.apply {
            if (isPlaying) stop()
            release()
        }
        mediaPlayer = null
    }
}