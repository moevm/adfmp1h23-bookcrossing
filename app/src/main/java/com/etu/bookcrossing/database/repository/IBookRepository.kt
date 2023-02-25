package com.etu.bookcrossing.database.repository

import com.etu.bookcrossing.database.entity.BookEntity
import kotlinx.coroutines.flow.Flow

interface IBookRepository {

    fun all(): Flow<List<BookEntity>>

    fun allNames(): Flow<List<String>>

    suspend fun insert(books: List<BookEntity>)

}