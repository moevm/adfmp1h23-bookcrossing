package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.database.repository.IBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@HiltViewModel
class TakenBooksViewModel @Inject internal constructor(
    private var bookRepository: IBookRepository
) : ViewModel() {

    fun loadTakenBooksNames(): Flow<List<String>> = flow {
        bookRepository.allNames().collect {
            emit(it)
        }
    }
}