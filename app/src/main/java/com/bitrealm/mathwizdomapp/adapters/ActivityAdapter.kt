package com.bitrealm.mathwizdomapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.google.android.material.card.MaterialCardView

class ActivityAdapter(
    private val activities: List<Activity>,
    private val completionStatus: Map<String, Boolean> = emptyMap(),
    private val onActivityClick: (Activity) -> Unit
) : RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    inner class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardActivity: MaterialCardView = itemView.findViewById(R.id.cardActivity)
        val tvActivityNumber: TextView = itemView.findViewById(R.id.tvActivityNumber)
        val tvActivityType: TextView = itemView.findViewById(R.id.tvActivityType)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_activity, parent, false)
        return ActivityViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val activity = activities[position]
        val isCompleted = completionStatus[activity.id.toString()] ?: false

        // Show checkmark if activity is completed with score >= 3
        holder.tvActivityNumber.text = if (isCompleted) {
            "✓ ACTIVITY #${activity.activityNumber}"
        } else {
            "ACTIVITY #${activity.activityNumber}"
        }

        holder.tvActivityType.text = getActivityTypeLabel(activity.quarter, activity.lessonNumber, activity.activityNumber)

        // Change card background color if completed - USE ContextCompat
        if (isCompleted) {
            holder.cardActivity.setCardBackgroundColor(
                ContextCompat.getColor(holder.itemView.context, R.color.completed_activity_color)
            )
        } else {
            holder.cardActivity.setCardBackgroundColor(
                ContextCompat.getColor(holder.itemView.context, R.color.default_activity_color)
            )
        }

        holder.cardActivity.setOnClickListener {
            onActivityClick(activity)
        }
    }

    override fun getItemCount() = activities.size

    private fun getActivityTypeLabel(quarter: Int, lessonNumber: Int, activityNumber: Int): String {
        return when ("${quarter}_${lessonNumber}_${activityNumber}") {
            // Quarter 1
            "1_1_1" -> "Similar or Dissimilar"
            "1_1_2" -> "Matching Type"
            "1_1_3" -> "Cross-it"
            "1_2_1" -> "Routine and Non-routine"
            "1_2_2" -> "Routine and Non-routine"
            "1_2_3" -> "Multiple Choice"
            "1_3_1" -> "True or False"
            "1_3_2" -> "Multiple Choice"
            "1_3_3" -> "Matching Type"
            "1_4_1" -> "Matching Type"
            "1_4_2" -> "Routine and Non-routine"
            "1_4_3" -> "Multiple Choice"
            "1_5_1" -> "Cross-it"
            "1_5_2" -> "Matching Type"
            "1_5_3" -> "Multiple Choice"
            "1_6_1" -> "True or False"
            "1_6_2" -> "Routine and Non-routine"
            "1_6_3" -> "Cross-it"
            "1_7_1" -> "True or False"
            "1_7_2" -> "Matching Type"
            "1_7_3" -> "Cross-it"
            "1_8_1" -> "Routine and Non-routine"
            "1_8_2" -> "Routine and Non-routine"
            "1_8_3" -> "Multiple Choice"
            "1_9_1" -> "Multiple Choice"
            "1_9_2" -> "Matching Type"
            "1_9_3" -> "Matching Type"
            "1_10_1" -> "True or False"
            "1_10_2" -> "Matching Type"
            "1_10_3" -> "Cross-it"
            "1_11_1" -> "Routine and Non-routine"
            "1_11_2" -> "Routine and Non-routine"
            "1_11_3" -> "Multiple Choice"
            "1_12_1" -> "Routine and Non-routine"
            "1_12_2" -> "Routine and Non-routine"
            "1_12_3" -> "Multiple Choice"
            "1_13_1" -> "Matching Type"
            "1_13_2" -> "Cross-it"
            "1_13_3" -> "Multiple Choice"
            "1_14_1" -> "Multiple Choice"
            "1_14_2" -> "Matching Type"
            "1_14_3" -> "Cross-it"
            "1_15_1" -> "Rational or Irrational"
            "1_15_2" -> "True or False"
            "1_15_3" -> "Cross-it"
            "1_16_1" -> "Routine and Non-routine"
            "1_16_2" -> "Routine and Non-routine"
            "1_16_3" -> "Multiple Choice"
            "1_17_1" -> "Routine and Non-routine"
            "1_17_2" -> "Multiple Choice"
            "1_17_3" -> "Matching Type"

            // Quarter 2
            "2_1_1" -> "Multiple Choice"
            "2_1_2" -> "Multiple Choice"
            "2_2_1" -> "Direct, Inverse, or Partitive"
            "2_2_2" -> "Proportion or Not Proportion"
            "2_3_1" -> "Rate, Base, or Percentage"
            "2_3_2" -> "Multiple Choice"
            "2_4_1" -> "Multiple Choice"
            "2_4_2" -> "True or False"
            "2_5_1" -> "Matching Type"
            "2_5_2" -> "Multiple Choice"
            "2_6_1" -> "Matching Type"
            "2_6_2" -> "True or False"
            "2_7_1" -> "Positive or Negative"
            "2_7_2" -> "Opposite or Not Opposite"
            "2_8_1" -> "Multiple Choice"
            "2_8_2" -> "Multiple Choice"
            "2_9_1" -> "Matching Type"
            "2_9_2" -> "Multiple Choice"
            "2_10_1" -> "True or False"
            "2_10_2" -> "Cross-it"
            "2_11_1" -> "Matching Type"
            "2_11_2" -> "Matching Type"

            // Quarter 3
            "3_1_1" -> "Plane or Solid"
            "3_1_2" -> "Yes or No"
            "3_2_1" -> "Multiple Choice"
            "3_2_2" -> "Matching Type"
            "3_3_1" -> "Expression or Equation"
            "3_3_2" -> "Multiple Choice"
            "3_4_1" -> "Equation or Expression"
            "3_4_2" -> "Multiple Choice"
            "3_5_1" -> "Multiple Choice"
            "3_5_2" -> "Multiple Choice"
            "3_6_1" -> "Multiple Choice"
            "3_6_2" -> "Routine and Non-routine"
            "3_7_1" -> "Multiple Choice"
            "3_7_2" -> "True or False"
            "3_8_1" -> "Routine and Non-routine"
            "3_8_2" -> "Routine and Non-routine"

            // Quarter 4
            "4_1_1" -> "Multiple Choice"
            "4_1_2" -> "True or False"
            "4_2_1" -> "Routine and Non-routine"
            "4_2_2" -> "Routine and Non-routine"
            "4_3_1" -> "Multiple Choice"
            "4_3_2" -> "Cross-it"
            "4_4_1" -> "Multiple Choice"
            "4_4_2" -> "Multiple Choice"
            "4_5_1" -> "Multiple Choice"
            "4_5_2" -> "Multiple Choice"
            "4_6_1" -> "Multiple Choice"
            "4_6_2" -> "True or False"
            "4_7_1" -> "Multiple Choice"
            "4_7_2" -> "Multiple Choice"
            "4_8_1" -> "Most Likely or Unlikely"
            "4_8_2" -> "Theoretical or Experimental"
            "4_9_1" -> "Activity"
            "4_9_2" -> "Activity"

            else -> "Activity"
        }
    }
}