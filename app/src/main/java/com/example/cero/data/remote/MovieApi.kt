package com.example.cero.data.remote

import com.example.cero.data.remote.response.PopularMovie.PopularMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi  {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page") page: Int = 1
    ): PopularMoviesResponse
}