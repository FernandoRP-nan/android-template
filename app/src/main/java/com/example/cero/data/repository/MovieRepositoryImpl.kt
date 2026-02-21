package com.example.cero.data.repository


import com.example.cero.data.mapper.toDomain
import com.example.cero.data.remote.MovieApi
import com.example.cero.domain.model.Movie
import com.example.cero.domain.respository.UserRepository
import javax.inject.Inject


class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi
) : UserRepository {

    override suspend fun getPopularMovies(): List<Movie> {
        return api.getPopularMovies().results.map { it.toDomain() }
    }
}