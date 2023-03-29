package com.etu.bookcrossing.worker;

import com.etu.bookcrossing.worker.seeders.ISeeder;
import com.etu.bookcrossing.worker.seeders.impl.BookSeeder;
import com.etu.bookcrossing.worker.seeders.impl.UserSeeder;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\"\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/etu/bookcrossing/worker/Seeders;", "", "bookSeeder", "Lcom/etu/bookcrossing/worker/seeders/impl/BookSeeder;", "userSeeder", "Lcom/etu/bookcrossing/worker/seeders/impl/UserSeeder;", "(Lcom/etu/bookcrossing/worker/seeders/impl/BookSeeder;Lcom/etu/bookcrossing/worker/seeders/impl/UserSeeder;)V", "seeders", "", "Lcom/etu/bookcrossing/worker/seeders/impl/BaseSeeder;", "forEach", "", "consumer", "Lkotlin/Function2;", "Lcom/etu/bookcrossing/worker/seeders/ISeeder;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class Seeders {
    private final java.util.List<com.etu.bookcrossing.worker.seeders.impl.BaseSeeder<? extends java.util.List<java.lang.Object>>> seeders = null;
    
    @javax.inject.Inject()
    public Seeders(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.worker.seeders.impl.BookSeeder bookSeeder, @org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.worker.seeders.impl.UserSeeder userSeeder) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object forEach(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.etu.bookcrossing.worker.seeders.ISeeder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> consumer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}