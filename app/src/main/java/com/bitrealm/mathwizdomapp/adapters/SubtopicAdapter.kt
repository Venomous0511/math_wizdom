package com.bitrealm.mathwizdomapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Subtopic
import com.google.android.material.card.MaterialCardView

class SubtopicAdapter(
    private val subtopics: List<Subtopic>,
    private val onSubtopicClick: (Subtopic) -> Unit
) : RecyclerView.Adapter<SubtopicAdapter.SubtopicViewHolder>() {

    private var selectedPosition = 0

    fun setSelectedPosition(position: Int) {
        val previousPosition = selectedPosition
        selectedPosition = position
        notifyItemChanged(previousPosition)
        notifyItemChanged(selectedPosition)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubtopicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_subtopic, parent, false)
        return SubtopicViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubtopicViewHolder, position: Int) {
        val subtopic = subtopics[position]

        // Bind the subtopic data with selection state
        holder.bind(subtopic, position == selectedPosition)

        // Set click listener - ONLY ONE NEEDED
        holder.cardSubtopic.setOnClickListener {
            setSelectedPosition(position)
            onSubtopicClick(subtopic)
        }
    }

    override fun getItemCount() = subtopics.size

    class SubtopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvSubtopicName: TextView = itemView.findViewById(R.id.tvSubtopicName)
        val cardSubtopic: MaterialCardView = itemView.findViewById(R.id.cardSubtopic)

        fun bind(subtopic: Subtopic, isSelected: Boolean) {
            tvSubtopicName.text = subtopic.title

            // HIGHLIGHT IF SELECTED
            if (isSelected) {
                cardSubtopic.strokeColor = ContextCompat.getColor(itemView.context, R.color.purple_500)
                cardSubtopic.strokeWidth = 8
                cardSubtopic.setCardBackgroundColor(
                    ContextCompat.getColor(itemView.context, R.color.lesson_button_selected)
                )
            } else {
                cardSubtopic.strokeWidth = 0
                cardSubtopic.setCardBackgroundColor(
                    ContextCompat.getColor(itemView.context, R.color.lesson_button_color)
                )
            }
        }
    }
}