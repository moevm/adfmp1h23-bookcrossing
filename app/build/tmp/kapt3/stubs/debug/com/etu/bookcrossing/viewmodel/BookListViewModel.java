package com.etu.bookcrossing.viewmodel;

import androidx.lifecycle.ViewModel;
import com.etu.bookcrossing.data.Book;
import com.etu.bookcrossing.database.repository.IBookRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.github.oshai.KotlinLogging;
import javax.inject.Inject;
import kotlinx.coroutines.flow.Flow;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/etu/bookcrossing/viewmodel/BookListViewModel;", "Landroidx/lifecycle/ViewModel;", "bookRepository", "Lcom/etu/bookcrossing/database/repository/IBookRepository;", "(Lcom/etu/bookcrossing/database/repository/IBookRepository;)V", "loadBooks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/etu/bookcrossing/data/Book;", "app_debug"})
public final class BookListViewModel extends androidx.lifecycle.ViewModel {
    private com.etu.bookcrossing.database.repository.IBookRepository bookRepository;
    
    @javax.inject.Inject()
    public BookListViewModel(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.repository.IBookRepository bookRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.etu.bookcrossing.data.Book>> loadBooks() {
        return null;
    }
}