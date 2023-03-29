package com.etu.bookcrossing.worker.seeders;

import com.etu.bookcrossing.worker.seeders.impl.SeedFile;
import com.google.gson.stream.JsonReader;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/etu/bookcrossing/worker/seeders/ISeeder;", "", "apply", "", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file", "Lcom/etu/bookcrossing/worker/seeders/impl/SeedFile;", "app_debug"})
public abstract interface ISeeder {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object apply(@org.jetbrains.annotations.NotNull()
    com.google.gson.stream.JsonReader reader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.etu.bookcrossing.worker.seeders.impl.SeedFile file();
}