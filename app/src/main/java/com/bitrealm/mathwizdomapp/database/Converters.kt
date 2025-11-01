package com.bitrealm.mathwizdomapp.database

import androidx.room.TypeConverter
import com.bitrealm.mathwizdomapp.database.entities.Gender
import com.bitrealm.mathwizdomapp.database.entities.UserRole

class Converters {

    @TypeConverter
    fun fromGender(gender: Gender): String {
        return gender.name
    }

    @TypeConverter
    fun toGender(value: String): Gender {
        return Gender.valueOf(value)
    }

    @TypeConverter
    fun fromUserRole(role: UserRole): String {
        return role.name
    }

    @TypeConverter
    fun toUserRole(value: String): UserRole {
        return UserRole.valueOf(value)
    }
}