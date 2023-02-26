package com.etu.bookcrossing.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader

private val gson = Gson()

fun <T> JsonReader.deserialize(type: TypeToken<T>): T {
    return gson.fromJson(this, type)
}