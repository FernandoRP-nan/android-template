package com.example.cero.domain.extensions

import com.example.cero.domain.model.Movie
import com.example.cero.security.NativeKeys

private val IMAGE_BASE_URL = NativeKeys.getImageBaseUrl()

val Movie.fullPosterUrl: String?
    get() = posterUrl?.let { "$IMAGE_BASE_URL$it" }