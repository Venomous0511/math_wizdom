package com.bitrealm.mathwizdomapp.fragments

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.graphics.toColorInt

class DrawingCanvasView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint().apply {
        color = "#FF9800".toColorInt()
        strokeWidth = 8f
        isAntiAlias = true
    }

    private var lines = listOf<Line>()

    fun setLines(newLines: List<Line>) {
        lines = newLines
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        lines.forEach { line ->
            canvas.drawLine(line.startX, line.startY, line.endX, line.endY, paint)
        }
    }
}