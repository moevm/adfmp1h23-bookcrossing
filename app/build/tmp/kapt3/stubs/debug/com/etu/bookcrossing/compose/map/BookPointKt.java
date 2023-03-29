package com.etu.bookcrossing.compose.map;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.preview.Preview;
import com.etu.bookcrossing.R;
import com.etu.bookcrossing.compose.ShowSnackbar;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0007\u001a,\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007\u001a\b\u0010\u0010\u001a\u00020\u0006H\u0007\u001ad\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022D\u0010\u0012\u001a@\u0012\b\u0012\u00060\u0002j\u0002`\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0015\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u0016\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007\u001af\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022D\u0010\u0012\u001a@\u0012\b\u0012\u00060\u0002j\u0002`\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0015\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u0016\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0018H\u0007\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u001c"}, d2 = {"books", "", "", "getBooks", "()Ljava/util/List;", "AddBookItem", "", "name", "onChoose", "Lkotlin/Function1;", "AddBookToPoint", "address", "Lkotlin/Function0;", "onAddNew", "AddNewBook", "onAddBook", "AddNewBookPreview", "BookPoint", "onTakeBook", "Lkotlin/Function4;", "Lcom/etu/bookcrossing/compose/Message;", "Lcom/etu/bookcrossing/compose/Label;", "Lcom/etu/bookcrossing/compose/Performed;", "Lcom/etu/bookcrossing/compose/Dismissed;", "Lcom/etu/bookcrossing/compose/ShowSnackbar;", "TakeBookItem", "takenMessage", "undoMessage", "app_debug"})
public final class BookPointKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> books = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getBooks() {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TakeBookItem(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String takenMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String undoMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onTakeBook) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddBookItem(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onChoose) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddNewBook(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddBook) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddBookToPoint(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onChoose, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddNew) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BookPoint(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onTakeBook, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddBook) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void AddNewBookPreview() {
    }
}