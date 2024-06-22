package com.example.add_assignment_14

// MyApi.kt
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MyApi {
    @Headers("Authorization: Client-ID TT5XrYUh10qI3NSqIY90jv05_z_S6AA9buf6hYlPV3s")
    @GET("photos")
    fun getImages(@Query("page") page: Int, @Query("per_page") perPage: Int): Call<List<ImageData>>
}
