package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.database.repository.IUserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class UsersRatingViewModel @Inject internal constructor(
    private var userRepository: IUserRepository
) : ViewModel() {

    fun loadRating(): Flow<List<UserEntity>> = flow {
        userRepository.rating().collect {
            emit(it)
        }
    }
}