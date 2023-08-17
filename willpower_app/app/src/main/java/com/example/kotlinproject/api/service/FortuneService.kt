package com.example.kotlinproject.api.service

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import retrofit2.Call
import retrofit2.http.GET

@Parcelize
data class Fortune(val content: String):Parcelable
interface FortuneService {
    @GET("/api/fortunes")
    fun getFortune() :Call<Fortune>

}