package com.etu.bookcrossing.database.repository.impl

import com.etu.bookcrossing.database.dao.BookDao
import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import kotlinx.coroutines.flow.Flow

class BookRepository constructor(private val bookDao: BookDao) : IBookRepository {

    override fun all(): Flow<List<BookEntity>> = bookDao.all()

    override fun allNames(): Flow<List<String>> = bookDao.allNames()

    override suspend fun insert(books: List<BookEntity>) = bookDao.insert(books)

}