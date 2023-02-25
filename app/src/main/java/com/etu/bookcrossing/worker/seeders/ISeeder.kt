package com.etu.bookcrossing.worker.seeders

import com.google.gson.stream.JsonReader

interface ISeeder {

    suspend fun seed(reader: JsonReader)

}