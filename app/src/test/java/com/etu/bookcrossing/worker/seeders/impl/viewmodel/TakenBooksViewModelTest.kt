package com.etu.bookcrossing.worker.seeders.impl.viewmodel

import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.viewmodel.TakenBooksViewModel
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
class TakenBooksViewModelTest {

    @MockK(relaxUnitFun = true)
    lateinit var booksRepository: IBookRepository

    @InjectMockKs
    lateinit var target: TakenBooksViewModel


    @Test
    fun `when taken books names expected get it from repository and assert elements`() = runTest {
        val expected = booksNames.first()

        every { booksRepository.allNames() } returns booksNames

        val actual = target.loadTakenBooksNames().first()

        assertThat(actual).hasSize(expected.size).containsAll(expected)
    }

    companion object {

        private val booksNames = flowOf(
            listOf(
                "Book1",
                "Book2",
                "Peace and war",
                "Shrek"
            )
        )
    }
}