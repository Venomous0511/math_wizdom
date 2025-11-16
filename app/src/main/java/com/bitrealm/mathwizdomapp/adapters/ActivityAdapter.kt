package com.bitrealm.mathwizdomapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.models.Activity
import com.bitrealm.mathwizdomapp.models.ActivityType
import com.google.android.material.card.MaterialCardView

class ActivityAdapter(
    private val activities: List<Activity>,
    private val onActivityClick: (Activity) -> Unit
) : RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    inner class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardActivity: MaterialCardView = itemView.findViewById(R.id.cardActivity)
        val tvActivityNumber: TextView = itemView.findViewById(R.id.tvActivityNumber)
        val tvActivityName: TextView = itemView.findViewById(R.id.tvActivityName)
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

        holder.tvActivityNumber.text = "ACTIVITY #${activity.activityNumber}"
        holder.tvActivityName.text = activity.title
        holder.tvActivityType.text = getActivityTypeLabel(activity.type)

        holder.cardActivity.setOnClickListener {
            onActivityClick(activity)
        }
    }

    override fun getItemCount() = activities.size

    private fun getActivityTypeLabel(type: ActivityType): String {
        return when (type) {
            ActivityType.MULTIPLE_CHOICE -> "Multiple Choice"
            ActivityType.DRAG_DROP -> "Drag & Drop"
            // ActivityType.FILL_IN_BLANK -> "Fill in the Blank"
            ActivityType.ROUTINE_PROBLEM -> "Routine Problem"
            ActivityType.NON_ROUTINE_PROBLEM -> "Non-Routine Problem"
        }
    }
}