# KEEP NECESARIOS

# Retrofit interfaces
-keep interface retrofit2.** { *; }

# Gson (DTOs)
-keep class com.example.cero.data.remote.** { *; }

# Hilt
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }

# Room
-keep class androidx.room.** { *; }
-keep @androidx.room.Entity class * { *; }

# REMOVE LOGS IN RELEASE

-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}

# OBFUSCATE EVERYTHING ELSE

-allowaccessmodification
-dontwarn okhttp3.**
-dontwarn javax.annotation.**