package com.etu.bookcrossing.worker

import com.etu.bookcrossing.worker.seeders.ISeeder
import com.etu.bookcrossing.worker.seeders.impl.BookSeeder
import com.etu.bookcrossing.worker.seeders.impl.UserSeeder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Seeders @Inject constructor(bookSeeder: BookSeeder, userSeeder: UserSeeder) {

    private val seeders = listOf(
        bookSeeder,
        userSeeder
    )

    suspend fun forEach(consumer: suspend ((ISeeder) -> Unit)) {
        seeders.forEach { consumer(it) }
    }

}