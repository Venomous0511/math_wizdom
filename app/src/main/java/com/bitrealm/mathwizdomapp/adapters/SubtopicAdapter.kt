package com.bitrealm.mathwizdomapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Subtopic
import com.google.android.material.card.MaterialCardView

class SubtopicAdapter(
    private val subtopics: List<Subtopic>,
    private val onSubtopicClick: (Subtopic) -> Unit
) : RecyclerView.Adapter<SubtopicAdapter.SubtopicViewHolder>() {

    private var selectedPosition = 0

    inner class SubtopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardSubtopic: MaterialCardView = itemView.findViewById(R.id.cardSubtopic)
        val tvSubtopicName: TextView = itemView.findViewById(R.id.tvSubtopicName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubtopicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_subtopic, parent, false)
        return SubtopicViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubtopicViewHolder, position: Int) {
        val subtopic = subtopics[position]
        holder.tvSubtopicName.text = subtopic.name

        // Highlight selected item
        if (position == selectedPosition) {
            holder.cardSubtopic.setCardBackgroundColor(
                holder.itemView.context.getColor(R.color.lesson_button_selected)
            )
        } else {
            holder.cardSubtopic.setCardBackgroundColor(
                holder.itemView.context.getColor(R.color.lesson_button_color)
            )
        }

        holder.cardSubtopic.setOnClickListener {
            val previousPosition = selectedPosition
            @Suppress("DEPRECATION")
            selectedPosition = holder.adapterPosition
            notifyItemChanged(previousPosition)
            notifyItemChanged(selectedPosition)
            onSubtopicClick(subtopic)
        }
    }

    override fun getItemCount() = subtopics.size
}