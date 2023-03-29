package com.etu.bookcrossing.compose.user;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import com.etu.bookcrossing.R;
import com.etu.bookcrossing.compose.ShowSnackbar;
import com.etu.bookcrossing.viewmodel.TakenBooksViewModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032D\u0010\u0006\u001a@\u0012\b\u0012\u00060\u0003j\u0002`\b\u0012\b\u0012\u00060\u0003j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\rH\u0007\u001aX\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102D\u0010\u0006\u001a@\u0012\b\u0012\u00060\u0003j\u0002`\b\u0012\b\u0012\u00060\u0003j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\rH\u0007\u001a\\\u0010\u000e\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122D\u0010\u0006\u001a@\u0012\b\u0012\u00060\u0003j\u0002`\b\u0012\b\u0012\u00060\u0003j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\rH\u0007\u00a8\u0006\u0013"}, d2 = {"TakenBookItem", "", "name", "", "returnedMessage", "undoMessage", "onReturnBook", "Lkotlin/Function4;", "Lcom/etu/bookcrossing/compose/Message;", "Lcom/etu/bookcrossing/compose/Label;", "Lkotlin/Function0;", "Lcom/etu/bookcrossing/compose/Performed;", "Lcom/etu/bookcrossing/compose/Dismissed;", "Lcom/etu/bookcrossing/compose/ShowSnackbar;", "TakenBooks", "viewModel", "Lcom/etu/bookcrossing/viewmodel/TakenBooksViewModel;", "books", "", "app_debug"})
public final class TakenBooksKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TakenBookItem(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String returnedMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String undoMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onReturnBook) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TakenBooks(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.viewmodel.TakenBooksViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onReturnBook) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TakenBooks(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> books, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onReturnBook) {
    }
}