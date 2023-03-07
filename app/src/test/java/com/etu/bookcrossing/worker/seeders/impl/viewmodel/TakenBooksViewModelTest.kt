package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.viewmodel.TakenBooksViewModel
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
class TakenBooksViewModelTest {
    @MockK(relaxUnitFun = true)
    lateinit var booksRepository: IBookRepository

    @InjectMockKs
    lateinit var target: TakenBooksViewModel


    @Test
    fun `when taken books names expected get it from repository and assert elements`() = runTest {
        every { booksRepository.allNames() } returns booksNames()

        val rating = target.loadTakenBooksNames()
        assert(rating.count() == 1)
        assert(rating.toList().first().size == 2)
        assert(rating.toList().first().first() == "Book1")
        assert(rating.toList().first()[1] == "Book2")
        assert(!rating.toList().first().contains( "Peace and war"))
        assert(!rating.toList().first().contains( "Shrek"))
    }

    companion object {

        private fun booksNames(): Flow<List<String>> {
            return  flowOf(
                listOf(
                    "Book1",
                    "Book2",
                    "Peace and war",
                    "Shrek"
                ))
        }
    }
}