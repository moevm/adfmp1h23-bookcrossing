package com.etu.bookcrossing.worker.seeders.impl

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.worker.seeders.ISeeder
import com.google.gson.reflect.TypeToken
import io.github.oshai.KotlinLogging
import javax.inject.Inject
import javax.inject.Singleton

private val logger = KotlinLogging.logger {}

@Singleton
class BookSeeder @Inject constructor(private val bookRepository: IBookRepository) :
    BaseSeeder<List<BookEntity>>(object : TypeToken<List<BookEntity>>() {}),
    ISeeder {

    override suspend fun handle(seedElement: List<BookEntity>) {
        logger.debug { "Seeding, size: ${seedElement.size}" }
        bookRepository.insert(seedElement)
    }

}