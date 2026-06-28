package com.example.cero.domain.extensions

import com.example.cero.domain.model.Movie
import com.example.cero.core.config.TmdbConfig

private val IMAGE_BASE_URL = TmdbConfig.IMAGE_BASE_URL

val Movie.fullPosterUrl: String?
    get() = posterUrl?.let { "$IMAGE_BASE_URL$it" }