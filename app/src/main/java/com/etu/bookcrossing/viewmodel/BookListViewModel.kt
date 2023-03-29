package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.data.Book
import com.etu.bookcrossing.data.toBook
import com.etu.bookcrossing.database.repository.IBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.oshai.KotlinLogging
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

private val logger = KotlinLogging.logger {}

@HiltViewModel
class BookListViewModel @Inject internal constructor(
    private var bookRepository: IBookRepository
) : ViewModel() {
    fun loadBooks(): Flow<List<Book>> = flow {
        bookRepository.all().collect {
            logger.debug { "Collected: ${it.size} books" }
            emit(it.map { book -> book.toBook() })
        }
    }
}