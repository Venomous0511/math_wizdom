package com.bitrealm.mathwizdomapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.database.dao.LessonProgressDao

class ProgressAdapter(
    private val unlockedLessons: List<LessonProgressDao.UnlockedLesson>
) : RecyclerView.Adapter<ProgressAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvQuarter: TextView = view.findViewById(R.id.tvQuarter)
        val tvLessonTitle: TextView = view.findViewById(R.id.tvLessonTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_progress_lesson, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lesson = unlockedLessons[position]
        holder.tvQuarter.text = "Quarter ${lesson.quarter}"
        holder.tvLessonTitle.text = "Lesson ${lesson.lessonNumber}"
    }

    override fun getItemCount() = unlockedLessons.size
}