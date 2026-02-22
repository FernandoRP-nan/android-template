package com.example.cero.security



object NativeKeys {

    init {
        System.loadLibrary("security")
    }

    external fun getApiKey(): String
    external fun getBaseUrl(): String
    external fun getImageBaseUrl(): String
}