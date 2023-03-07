package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.database.repository.IUserRepository
import com.etu.bookcrossing.viewmodel.UsersRatingViewModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@OptIn(ExperimentalCoroutinesApi::class)
class UsersRatingViewModelTest {

    @MockK(relaxUnitFun = true)
    lateinit var userRepository: IUserRepository

    @InjectMockKs
    lateinit var target: UsersRatingViewModel


    @Test
    fun `when rating expected get it from repository and assert elements`() = runTest {
        every { userRepository.rating() } returns usersRating()

        val rating = target.loadRating()
        assert(rating.count() == 1)
        assert(rating.toList().first().size == 2)
        assert(rating.toList().first().first() == firstUser)
        assert(rating.toList().first()[1] == secondUser)
    }

    companion object {

        var firstUser = UserEntity(
            0,
            "Petr",
            "Petrov",
            "email@gmail.com",
            "password",
            "some url"
        )

        var secondUser =  UserEntity(
            1,
            "Ivan",
            "Ivanov",
            "email1@gmail.com",
            "password 1",
            "some url 1"
        )

        private fun usersRating(): Flow<List<UserEntity>> {
            return flowOf(
                listOf(
                    firstUser,
                    secondUser
                ))
        }
    }
}