package com.etu.bookcrossing.worker;

import android.content.Context;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.etu.bookcrossing.worker.seeders.ISeeder;
import com.google.gson.stream.JsonReader;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.github.oshai.KotlinLogging;
import kotlinx.coroutines.Dispatchers;
import java.io.InputStream;

@androidx.hilt.work.HiltWorker()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/etu/bookcrossing/worker/SeedDatabaseWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "seeders", "Lcom/etu/bookcrossing/worker/Seeders;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/etu/bookcrossing/worker/Seeders;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonReader", "Lcom/google/gson/stream/JsonReader;", "stream", "Ljava/io/InputStream;", "seed", "", "seeder", "Lcom/etu/bookcrossing/worker/seeders/ISeeder;", "(Lcom/etu/bookcrossing/worker/seeders/ISeeder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "", "app_debug"})
public final class SeedDatabaseWorker extends androidx.work.CoroutineWorker {
    private com.etu.bookcrossing.worker.Seeders seeders;
    
    @dagger.assisted.AssistedInject()
    public SeedDatabaseWorker(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.work.WorkerParameters workerParams, @org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.worker.Seeders seeders) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    private final java.lang.Object seed(com.etu.bookcrossing.worker.seeders.ISeeder seeder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.io.InputStream stream(com.etu.bookcrossing.worker.seeders.ISeeder seeder) {
        return null;
    }
    
    private final java.io.InputStream stream(java.lang.String fileName) {
        return null;
    }
    
    private final com.google.gson.stream.JsonReader jsonReader(java.io.InputStream stream) {
        return null;
    }
}