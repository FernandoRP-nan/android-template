package com.example.security

class NativeLib {

    /**
     * A native method that is implemented by the 'security' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'security' library on application startup.
        init {
            System.loadLibrary("security")
        }
    }
}