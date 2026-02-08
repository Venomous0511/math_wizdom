package com.bitrealm.mathwizdomapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bitrealm.mathwizdomapp.R
import com.bitrealm.mathwizdomapp.YoutubeLink

class YoutubeLinksAdapter(
    private val youtubeLinks: List<YoutubeLink>,
    private val onLinkClick: (String) -> Unit
) : RecyclerView.Adapter<YoutubeLinksAdapter.YoutubeViewHolder>() {

    inner class YoutubeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tvYoutubeTitle)
        val tvOwner: TextView = itemView.findViewById(R.id.tvYoutubeOwner)

        @SuppressLint("SetTextI18n")
        fun bind(youtubeLink: YoutubeLink) {
            tvTitle.text = youtubeLink.title
            tvOwner.text = "by ${youtubeLink.owner}"

            itemView.setOnClickListener {
                onLinkClick(youtubeLink.url)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_youtube_link, parent, false)
        return YoutubeViewHolder(view)
    }

    override fun onBindViewHolder(holder: YoutubeViewHolder, position: Int) {
        holder.bind(youtubeLinks[position])
    }

    override fun getItemCount(): Int = youtubeLinks.size
}