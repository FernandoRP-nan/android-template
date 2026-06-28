package com.example.cero.core.config

import com.example.cero.BuildConfig

object TmdbConfig {
    const val BASE_URL: String = BuildConfig.TMDB_BASE_URL
    const val IMAGE_BASE_URL: String = BuildConfig.TMDB_IMAGE_BASE_URL

    val apiKey: String
        get() = BuildConfig.TMDB_API_KEY

    val isConfigured: Boolean
        get() = apiKey.isNotBlank()
}
