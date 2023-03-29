package com.etu.bookcrossing.compose.books;

import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import com.etu.bookcrossing.R;
import com.etu.bookcrossing.data.Book;
import com.etu.bookcrossing.viewmodel.BookListViewModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007\u001a(\u0010\t\u001a\u00020\u0001*\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"BookItem", "", "book", "Lcom/etu/bookcrossing/data/Book;", "BooksList", "viewModel", "Lcom/etu/bookcrossing/viewmodel/BookListViewModel;", "books", "", "header", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class BooksListKt {
    
    @androidx.compose.runtime.Composable()
    public static final void BookItem(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.data.Book book) {
    }
    
    public static final void header(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.grid.LazyGridScope $this$header, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BooksList(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.viewmodel.BookListViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BooksList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.etu.bookcrossing.data.Book> books) {
    }
}