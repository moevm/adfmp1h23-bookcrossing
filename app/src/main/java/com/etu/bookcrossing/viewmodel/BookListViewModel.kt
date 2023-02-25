package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.oshai.KotlinLogging
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

private val logger = KotlinLogging.logger {}

@HiltViewModel
class BookListViewModel @Inject internal constructor(
    private var bookRepository: IBookRepository
) : ViewModel() {

    fun loadBooks(): Flow<List<BookEntity>> = flow {
        bookRepository.all().collect {
            logger.debug { "Collected: ${it.size} books" }
            emit(it)
        }
    }
}