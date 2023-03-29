package com.etu.bookcrossing.worker.seeders.impl;

import com.etu.bookcrossing.worker.seeders.ISeeder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/etu/bookcrossing/worker/seeders/impl/BaseSeeder;", "T", "Lcom/etu/bookcrossing/worker/seeders/ISeeder;", "type", "Lcom/google/gson/reflect/TypeToken;", "(Lcom/google/gson/reflect/TypeToken;)V", "apply", "", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handle", "seedElement", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseSeeder<T extends java.lang.Object> implements com.etu.bookcrossing.worker.seeders.ISeeder {
    private final com.google.gson.reflect.TypeToken<T> type = null;
    
    public BaseSeeder(@org.jetbrains.annotations.NotNull()
    com.google.gson.reflect.TypeToken<T> type) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object apply(@org.jetbrains.annotations.NotNull()
    com.google.gson.stream.JsonReader reader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handle(T seedElement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}