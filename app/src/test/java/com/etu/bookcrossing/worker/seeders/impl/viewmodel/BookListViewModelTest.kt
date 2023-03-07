package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.viewmodel.BookListViewModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@OptIn(ExperimentalCoroutinesApi::class)
class BookListViewModelTest {
    @MockK(relaxUnitFun = true)
    lateinit var booksRepository: IBookRepository

    @InjectMockKs
    lateinit var target: BookListViewModel


    @Test
    fun `when all books expected get them from repository and assert elements`() = runTest {
        every { booksRepository.all() } returns books(2)

        val allBooks = target.loadBooks()
        assert(allBooks.first().count() == 3)
        assert(allBooks.first()[0].bookId == 0L)
        assert(allBooks.first()[1].bookId == 1L)
        assert(allBooks.first()[2].author == "some author")
    }

    companion object {

        private fun books(size: Long): Flow<List<BookEntity>> {
            return flowOf(
                (0L..size).map {
                    BookEntity(
                        it,
                        it.toString(),
                        "some author",
                        "some description",
                        "some url"
                    )
                })
        }
    }
}