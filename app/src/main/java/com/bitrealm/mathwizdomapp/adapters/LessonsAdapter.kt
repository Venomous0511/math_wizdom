package com.bitrealm.mathwizdomapp.adapters

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.google.android.material.button.MaterialButton

class LessonsAdapter(
    private val lessons: List<LessonItem>,
    private val onLessonClick: (Int) -> Unit
) : RecyclerView.Adapter<LessonsAdapter.LessonViewHolder>() {

    inner class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val btnLesson: MaterialButton = itemView.findViewById(R.id.btnLesson)

        fun bind(lesson: LessonItem) {
            btnLesson.apply {
                if (lesson.isLocked) {
                    text = lesson.number.toString()
                    icon = ContextCompat.getDrawable(context, R.drawable.ic_lock)
                    iconGravity = MaterialButton.ICON_GRAVITY_TOP
                    iconSize = 24
                } else {
                    text = lesson.name
                    icon = null
                }

                textSize = 11f
                gravity = Gravity.CENTER
                isAllCaps = false
                maxLines = 2
                lineHeight = (textSize * 1.2).toInt()

                // Disable button if locked and reduce opacity
                isEnabled = !lesson.isLocked
                alpha = if (lesson.isLocked) 0.5f else 1.0f

                setOnClickListener {
                    if (!lesson.isLocked) {
                        onLessonClick(lesson.number)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lesson, parent, false)
        return LessonViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(lessons[position])
    }

    override fun getItemCount(): Int = lessons.size
}

data class LessonItem(
    val number: Int,
    val name: String,
    val isLocked: Boolean = false
)