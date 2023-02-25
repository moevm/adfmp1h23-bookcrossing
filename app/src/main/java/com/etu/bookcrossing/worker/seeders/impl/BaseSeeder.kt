package com.etu.bookcrossing.worker.seeders.impl

import com.etu.bookcrossing.worker.seeders.ISeeder
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader

abstract class BaseSeeder<T>(private val type: TypeToken<T>) : ISeeder {
    override suspend fun seed(reader: JsonReader) {
        deserialize(reader).also { handle(it) }
    }

    abstract suspend fun handle(seedElement: T)

    private fun deserialize(reader: JsonReader): T {
        return deserialize(reader, type)
    }

    /**
     * TODO:
     * Call to Gson() must be in some static class
     */
    private fun deserialize(reader: JsonReader, type: TypeToken<T>): T {
        return Gson().fromJson(reader, type)
    }

}