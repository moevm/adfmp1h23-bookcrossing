package com.etu.bookcrossing.worker.seeders.impl

import com.etu.bookcrossing.data.deserialize
import com.etu.bookcrossing.worker.seeders.ISeeder
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader

abstract class BaseSeeder<T>(private val type: TypeToken<T>) : ISeeder {

    override suspend fun apply(reader: JsonReader) {
        reader.deserialize(type).also { handle(it) }
    }

    abstract suspend fun handle(seedElement: T)

}