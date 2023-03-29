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

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"logger", "Lio/github/oshai/KLogger;", "app_debug"})
public final class SeedDatabaseWorkerKt {
    private static final io.github.oshai.KLogger logger = null;
}