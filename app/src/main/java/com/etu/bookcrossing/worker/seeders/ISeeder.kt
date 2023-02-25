package com.etu.bookcrossing.worker.seeders

import com.etu.bookcrossing.worker.seeders.impl.SeedFile
import com.google.gson.stream.JsonReader

interface ISeeder {

    suspend fun apply(reader: JsonReader)

    fun file(): SeedFile

}