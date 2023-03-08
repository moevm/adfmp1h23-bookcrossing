package com.etu.bookcrossing.worker.seeders.impl.seeders

import com.etu.bookcrossing.data.jsonReader
import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.worker.seeders.impl.BookSeeder
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
class BookSeederTest {

    @MockK(relaxUnitFun = true)
    lateinit var bookRepository: IBookRepository

    @InjectMockKs
    lateinit var target: BookSeeder

    @Test
    fun `when apply requested expected deserialize and pass to repository`() = runTest {
        val expected = books

        target.apply(expected.jsonReader())

        coVerify { bookRepository.insert(expected) }
    }

    companion object {

        private val books = (0L..10).map {
            BookEntity(
                it,
                it.toString(),
                "some author",
                "some description",
                "some url"
            )
        }
    }
}