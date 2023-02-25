package com.etu.bookcrossing.worker

import android.content.res.Resources.NotFoundException
import com.etu.bookcrossing.worker.seeders.ISeeder
import com.etu.bookcrossing.worker.seeders.impl.BookSeeder
import com.etu.bookcrossing.worker.seeders.impl.UserSeeder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Seeders @Inject constructor(bookSeeder: BookSeeder, userSeeder: UserSeeder) {

    private val seeders = mapOf(
        SeedFile.BOOKS to bookSeeder,
        SeedFile.USERS to userSeeder
    )

    fun seeder(file: SeedFile): ISeeder {
        return seeders[file] ?: throw NotFoundException("Seeder '$file' is not registered")
    }

    enum class SeedFile(val fileName: String) {
        BOOKS("books.json"),
        USERS("users.json")
    }
}