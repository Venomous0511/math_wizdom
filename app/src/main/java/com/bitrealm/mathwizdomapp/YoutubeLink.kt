package com.bitrealm.mathwizdomapp

import java.io.Serializable

data class YoutubeLink(
    val title: String,
    val url: String,
    val owner: String
) : Serializable