package com.etu.bookcrossing.database.repository.impl

import com.etu.bookcrossing.database.dao.UserDao
import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.database.repository.IUserRepository
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) : IUserRepository {

    override fun rating(): Flow<List<UserEntity>> = userDao.rating()

    override suspend fun insert(users: List<UserEntity>) = userDao.insert(users)

}