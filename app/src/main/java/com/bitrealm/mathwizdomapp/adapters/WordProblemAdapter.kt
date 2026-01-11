package com.bitrealm.mathwizdomapp.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Question
import com.google.android.material.card.MaterialCardView

class WordProblemAdapter(
    private val problems: List<Question.RoutineProblem>,
    private val onProblemClick: (Int) -> Unit
) : RecyclerView.Adapter<WordProblemAdapter.ViewHolder>() {

    private var selectedPosition = 0

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNumber: TextView = view.findViewById(R.id.tvProblemNumber)
        val tvTitle: TextView = view.findViewById(R.id.tvProblemTitle)
        val card: MaterialCardView = view.findViewById(R.id.cardProblem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_word_problem, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n", "UseKtx")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val problem = problems[position]

        holder.tvNumber.text = "Problem ${position + 1}"
        holder.tvTitle.text = if (problem.description.length > 50) {
            problem.description.take(50) + "..."
        } else {
            problem.description
        }

        // Highlight selected
        if (position == selectedPosition) {
            holder.card.setCardBackgroundColor(Color.parseColor("#4CAF50"))
        } else {
            holder.card.setCardBackgroundColor(Color.parseColor("#CC000000"))
        }

        holder.card.setOnClickListener {
            @Suppress("DEPRECATION") val clickedPosition = holder.adapterPosition
            if (clickedPosition != RecyclerView.NO_POSITION) {
                val oldPosition = selectedPosition
                selectedPosition = clickedPosition
                notifyItemChanged(oldPosition)
                notifyItemChanged(selectedPosition)
                onProblemClick(clickedPosition)
            }
        }
    }

    override fun getItemCount() = problems.size
}