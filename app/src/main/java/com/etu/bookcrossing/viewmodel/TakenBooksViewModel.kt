package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.database.repository.IBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class TakenBooksViewModel @Inject internal constructor(
    private var bookRepository: IBookRepository
) : ViewModel() {

    fun loadTakenBooksNames(): Flow<List<String>> = flow {
        bookRepository.allNames().collect {
            emit(it.ifEmpty {
                emptyList()
            }.subList(0, it.size / 2))
        }
    }
}