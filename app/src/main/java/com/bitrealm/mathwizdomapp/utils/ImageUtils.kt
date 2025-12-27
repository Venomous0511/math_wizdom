package com.bitrealm.mathwizdomapp.utils

import android.widget.ImageView
import androidx.core.net.toUri

fun ImageView.loadAvatarUri(uriString: String?, placeholderResId: Int) {
    if (!uriString.isNullOrEmpty()) {
        try {
            val uri = uriString.toUri()
            this.setImageURI(uri)
        } catch (e: Exception) {
            println("Error loading avatar: ${e.message}")
            this.setImageResource(placeholderResId)
        }
    } else {
        this.setImageResource(placeholderResId)
    }
}