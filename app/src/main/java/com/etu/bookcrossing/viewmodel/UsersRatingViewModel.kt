package com.etu.bookcrossing.viewmodel

import androidx.lifecycle.ViewModel
import com.etu.bookcrossing.data.User
import com.etu.bookcrossing.data.toUser
import com.etu.bookcrossing.database.repository.IUserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@HiltViewModel
class UsersRatingViewModel @Inject internal constructor(
    private var userRepository: IUserRepository
) : ViewModel() {
    fun loadRating(): Flow<List<User>> = flow {
        userRepository.rating().collect {
            emit(it.map { user -> user.toUser() })
        }
    }
}