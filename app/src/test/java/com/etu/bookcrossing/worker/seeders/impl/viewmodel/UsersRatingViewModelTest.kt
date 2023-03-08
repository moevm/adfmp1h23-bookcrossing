package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.database.repository.IUserRepository
import com.etu.bookcrossing.viewmodel.UsersRatingViewModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions
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
    fun `when rating expected get it from repository and return to user`() = runTest {
        val expected = usersRating.first()

        every { userRepository.rating() } returns usersRating

        val actual = target.loadRating().first()

        Assertions.assertThat(actual).hasSize(expected.size).containsAll(expected)
    }

    companion object {

        private val usersRating = flowOf(
            listOf(
                UserEntity(
                    0,
                    "Petr",
                    "Petrov",
                    "email@gmail.com",
                    "password",
                    "some url"
                ),
                UserEntity(
                    1,
                    "Ivan",
                    "Ivanov",
                    "email1@gmail.com",
                    "password 1",
                    "some url 1"
                )
            )
        )
    }
}