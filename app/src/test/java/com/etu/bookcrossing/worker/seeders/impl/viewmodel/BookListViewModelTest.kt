package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.viewmodel.BookListViewModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions.assertThat
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
    fun `when all books expected get them from repository and pass to user`() = runTest {
        val expected = books.first()

        every { booksRepository.all() } returns books

        val actual = target.loadBooks().first()

        assertThat(actual).hasSize(expected.size).containsAll(expected)
    }

    companion object {

        private val books = flowOf((0L..2).map {
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