package com.etu.bookcrossing.worker.seeders.impl

import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.database.repository.IUserRepository
import com.etu.bookcrossing.worker.seeders.ISeeder
import com.google.gson.reflect.TypeToken
import io.github.oshai.KotlinLogging
import javax.inject.Inject
import javax.inject.Singleton

private val logger = KotlinLogging.logger {}

@Singleton
class UserSeeder @Inject constructor(private val userRepository: IUserRepository) :
    BaseSeeder<List<UserEntity>>(object : TypeToken<List<UserEntity>>() {}),
    ISeeder {

    override suspend fun handle(seedElement: List<UserEntity>) {
        logger.debug { "Seeding, size: '${seedElement.size}'" }
        userRepository.insert(seedElement)
    }

    override fun file(): SeedFile = SeedFile.USERS

}