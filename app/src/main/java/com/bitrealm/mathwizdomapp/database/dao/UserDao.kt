package com.bitrealm.mathwizdomapp.database.dao

import androidx.room.*
import com.bitrealm.mathwizdomapp.database.entities.User
import com.bitrealm.mathwizdomapp.database.entities.UserRole
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT * FROM users WHERE identifier = :identifier LIMIT 1")
    suspend fun getUserByIdentifier(identifier: String): User?

    @Query("SELECT * FROM users WHERE identifier = :identifier LIMIT 1")
    fun getUserByIdentifierFlow(identifier: String): Flow<User?>

    @Query("SELECT * FROM users WHERE role = :role")
    suspend fun getUsersByRole(role: UserRole): List<User>

    @Query("SELECT * FROM users")
    suspend fun getAllUsers(): List<User>

    @Query("SELECT * FROM users")
    fun getAllUsersFlow(): Flow<List<User>>

    @Query("DELETE FROM users WHERE identifier = :identifier")
    suspend fun deleteUserByIdentifier(identifier: String)

    @Query("SELECT EXISTS(SELECT 1 FROM users WHERE identifier = :identifier LIMIT 1)")
    suspend fun userExists(identifier: String): Boolean

    // In UserDao.kt
    @Query("SELECT COUNT(*) FROM users WHERE role = :role")
    suspend fun getUserCountByRole(role: UserRole): Int
}