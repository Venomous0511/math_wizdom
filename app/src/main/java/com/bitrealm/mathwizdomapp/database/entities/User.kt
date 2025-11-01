package com.bitrealm.mathwizdomapp.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val identifier: String,

    val fullName: String,

    val gender: Gender,

    val role: UserRole,

    val avatarUri: String? = null,

    val createdAt: Long = System.currentTimeMillis(),

    val updatedAt: Long = System.currentTimeMillis()
)