package com.etu.bookcrossing.worker.seeders.impl;

import com.etu.bookcrossing.database.entity.BookEntity;
import com.etu.bookcrossing.database.repository.IBookRepository;
import com.etu.bookcrossing.worker.seeders.ISeeder;
import com.google.gson.reflect.TypeToken;
import io.github.oshai.KotlinLogging;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/etu/bookcrossing/worker/seeders/impl/BookSeeder;", "Lcom/etu/bookcrossing/worker/seeders/impl/BaseSeeder;", "", "Lcom/etu/bookcrossing/database/entity/BookEntity;", "Lcom/etu/bookcrossing/worker/seeders/ISeeder;", "bookRepository", "Lcom/etu/bookcrossing/database/repository/IBookRepository;", "(Lcom/etu/bookcrossing/database/repository/IBookRepository;)V", "file", "Lcom/etu/bookcrossing/worker/seeders/impl/SeedFile;", "handle", "", "seedElement", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class BookSeeder extends com.etu.bookcrossing.worker.seeders.impl.BaseSeeder<java.util.List<? extends com.etu.bookcrossing.database.entity.BookEntity>> implements com.etu.bookcrossing.worker.seeders.ISeeder {
    private final com.etu.bookcrossing.database.repository.IBookRepository bookRepository = null;
    
    @javax.inject.Inject()
    public BookSeeder(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.repository.IBookRepository bookRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object handle(@org.jetbrains.annotations.NotNull()
    java.util.List<com.etu.bookcrossing.database.entity.BookEntity> seedElement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.etu.bookcrossing.worker.seeders.impl.SeedFile file() {
        return null;
    }
}