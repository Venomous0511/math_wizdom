package com.bitrealm.mathwizdomapp.models

import java.io.Serializable

data class Subtopic(
    val id: Int,
    val title: String,
    val pdfFileName: String? = null,
    val interactiveLesson: InteractiveLesson? = null
) : Serializable