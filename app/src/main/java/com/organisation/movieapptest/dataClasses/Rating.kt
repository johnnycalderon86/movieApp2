package com.organisation.movieapptest.dataClasses


import com.squareup.moshi.Json

data class Rating(
    @Json(name = "Source")
    val source: String,
    @Json(name = "Value")
    val value: String
)