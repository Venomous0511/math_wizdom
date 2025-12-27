package com.bitrealm.mathwizdomapp.utils

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.widget.ImageView
import android.graphics.Matrix
import android.graphics.PointF

class ZoomTouchListener : View.OnTouchListener {
    private var mode = NONE
    private val start = PointF()
    private val mid = PointF()
    private var oldDist = 1f
    private val matrix = Matrix()
    private val savedMatrix = Matrix()
    private var scaleGestureDetector: ScaleGestureDetector? = null

    companion object {
        private const val NONE = 0
        private const val DRAG = 1
        private const val ZOOM = 2
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        val view = v as? ImageView ?: return false

        if (scaleGestureDetector == null) {
            scaleGestureDetector = ScaleGestureDetector(view.context, ScaleListener(view))
        }

        event?.let { scaleGestureDetector?.onTouchEvent(it) }

        when (event?.action?.and(MotionEvent.ACTION_MASK)) {
            MotionEvent.ACTION_DOWN -> {
                savedMatrix.set(matrix)
                start.set(event.x, event.y)
                mode = DRAG
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                oldDist = spacing(event)
                if (oldDist > 10f) {
                    savedMatrix.set(matrix)
                    midPoint(mid, event)
                    mode = ZOOM
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP -> {
                mode = NONE
            }
            MotionEvent.ACTION_MOVE -> {
                if (mode == DRAG) {
                    matrix.set(savedMatrix)
                    matrix.postTranslate(event.x - start.x, event.y - start.y)
                } else if (mode == ZOOM) {
                    val newDist = spacing(event)
                    if (newDist > 10f) {
                        matrix.set(savedMatrix)
                        val scale = newDist / oldDist
                        matrix.postScale(scale, scale, mid.x, mid.y)
                    }
                }
            }
        }

        view.imageMatrix = matrix
        return true
    }

    private fun spacing(event: MotionEvent): Float {
        val x = event.getX(0) - event.getX(1)
        val y = event.getY(0) - event.getY(1)
        return kotlin.math.sqrt((x * x + y * y).toDouble()).toFloat()
    }

    private fun midPoint(point: PointF, event: MotionEvent) {
        val x = event.getX(0) + event.getX(1)
        val y = event.getY(0) + event.getY(1)
        point.set(x / 2, y / 2)
    }

    private inner class ScaleListener(private val view: ImageView) :
        ScaleGestureDetector.SimpleOnScaleGestureListener() {

        override fun onScale(detector: ScaleGestureDetector): Boolean {
            val scaleFactor = detector.scaleFactor
            matrix.postScale(scaleFactor, scaleFactor, detector.focusX, detector.focusY)
            view.imageMatrix = matrix
            return true
        }
    }
}