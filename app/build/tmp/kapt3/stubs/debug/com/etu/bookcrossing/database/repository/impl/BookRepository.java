package com.etu.bookcrossing.database.repository.impl;

import com.etu.bookcrossing.database.dao.BookDao;
import com.etu.bookcrossing.database.entity.BookEntity;
import com.etu.bookcrossing.database.repository.IBookRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006H\u0016J\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/etu/bookcrossing/database/repository/impl/BookRepository;", "Lcom/etu/bookcrossing/database/repository/IBookRepository;", "bookDao", "Lcom/etu/bookcrossing/database/dao/BookDao;", "(Lcom/etu/bookcrossing/database/dao/BookDao;)V", "all", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/etu/bookcrossing/database/entity/BookEntity;", "allNames", "", "insert", "", "books", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class BookRepository implements com.etu.bookcrossing.database.repository.IBookRepository {
    private final com.etu.bookcrossing.database.dao.BookDao bookDao = null;
    
    public BookRepository(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.dao.BookDao bookDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.etu.bookcrossing.database.entity.BookEntity>> all() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> allNames() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.etu.bookcrossing.database.entity.BookEntity> books, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}