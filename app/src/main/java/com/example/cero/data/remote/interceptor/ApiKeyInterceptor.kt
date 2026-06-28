package com.example.cero.data.remote.interceptor

import com.example.cero.core.config.TmdbConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ApiKeyInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        require(TmdbConfig.isConfigured) {
            "TMDB_API_KEY no configurada. Copia local.properties.example a local.properties."
        }

        val request = chain.request()

        val newRequest = request.newBuilder()
            .addHeader(
                "Authorization",
                "Bearer ${TmdbConfig.apiKey}"
            )
            .addHeader("accept", "application/json")
            .build()

        return chain.proceed(newRequest)
    }
}