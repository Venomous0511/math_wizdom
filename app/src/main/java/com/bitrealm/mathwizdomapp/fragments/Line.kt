package com.bitrealm.mathwizdomapp.fragments

/**
 * Data class representing a line drawn on the canvas
 * Used by DrawingCanvasView for wire matching activities
 */
data class Line(
    val startX: Float,
    val startY: Float,
    val endX: Float,
    val endY: Float,
    val columnAIndex: Int,
    val columnBIndex: Int,
    val color: Int
)