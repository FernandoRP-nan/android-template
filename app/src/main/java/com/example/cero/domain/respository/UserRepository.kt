package com.example.cero.domain.respository

import com.example.cero.domain.model.Movie


interface UserRepository {

    suspend fun getPopularMovies(): List<Movie>
}