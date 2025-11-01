package com.bitrealm.mathwizdomapp.repository

import com.bitrealm.mathwizdomapp.database.dao.UserDao
import com.bitrealm.mathwizdomapp.database.entities.User
import com.bitrealm.mathwizdomapp.database.entities.UserRole
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) {

    // Check if user exists
    suspend fun userExists(identifier: String): Boolean {
        return userDao.userExists(identifier)
    }

    // Get user by identifier
    suspend fun getUserByIdentifier(identifier: String): User? {
        return userDao.getUserByIdentifier(identifier)
    }

    // Get user as Flow (for real-time updates)
    fun getUserByIdentifierFlow(identifier: String): Flow<User?> {
        return userDao.getUserByIdentifierFlow(identifier)
    }

    // Insert new user
    suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    // Update existing user
    suspend fun updateUser(user: User) {
        val updatedUser = user.copy(updatedAt = System.currentTimeMillis())
        userDao.updateUser(updatedUser)
    }

    // Delete user
    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

    // Get all users by role
    suspend fun getUsersByRole(role: UserRole): List<User> {
        return userDao.getUsersByRole(role)
    }

    // Get all users
    suspend fun getAllUsers(): List<User> {
        return userDao.getAllUsers()
    }

    // Get all users as Flow
    fun getAllUsersFlow(): Flow<List<User>> {
        return userDao.getAllUsersFlow()
    }
}