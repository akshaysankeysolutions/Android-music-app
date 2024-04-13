package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MyApiInterface {

    @Headers("X-RapidAPI-Key:a16343b30dmsh142803ac0a549b9p12180fjsn933b05b880a8","X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>
}