package com.etu.bookcrossing.database.repository

import com.etu.bookcrossing.database.entity.UserEntity
import kotlinx.coroutines.flow.Flow

interface IUserRepository {

    fun rating(): Flow<List<UserEntity>>

    suspend fun insert(users: List<UserEntity>)

}