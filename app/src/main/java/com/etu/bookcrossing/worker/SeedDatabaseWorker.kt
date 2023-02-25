package com.etu.bookcrossing.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.stream.JsonReader
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import io.github.oshai.KotlinLogging
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.InputStream

private val logger = KotlinLogging.logger {}

@HiltWorker
class SeedDatabaseWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private var seeders: Seeders
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            Seeders.SeedFile.values().forEach { seed(it) }

            Result.success()
        } catch (ex: Exception) {
            logger.error { ex.message }
            Result.failure()
        }
    }

    private suspend fun seed(file: Seeders.SeedFile) {
        applicationContext.assets.open(file.fileName).use { inputStream ->
            jsonReader(inputStream).also { seeders.seeder(file).seed(reader = it) }
        }
    }

    private fun jsonReader(stream: InputStream): JsonReader {
        return JsonReader(stream.reader())
    }

}