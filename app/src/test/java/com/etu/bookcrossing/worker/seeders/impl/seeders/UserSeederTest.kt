package com.etu.bookcrossing.worker.seeders.impl.seeders

import com.etu.bookcrossing.data.jsonReader
import com.etu.bookcrossing.database.repository.IUserRepository
import com.etu.bookcrossing.worker.seeders.impl.Fixtures
import com.etu.bookcrossing.worker.seeders.impl.UserSeeder
import io.mockk.coVerify
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@OptIn(ExperimentalCoroutinesApi::class)
class UserSeederTest {

    @MockK(relaxUnitFun = true)
    lateinit var userRepository: IUserRepository

    @InjectMockKs
    lateinit var target: UserSeeder

    @Test
    fun `when apply requested expected deserialize and pass to user repository`() = runTest {
        val expected = Fixtures.users

        target.apply(expected.jsonReader())

        coVerify { userRepository.insert(expected) }
    }

}