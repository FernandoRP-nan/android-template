package com.example.cero.domain.usecase

import com.example.cero.domain.model.Movie
import com.example.cero.domain.respository.UserRepository
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): List<Movie> {
        return repository.getPopularMovies()
    }
}