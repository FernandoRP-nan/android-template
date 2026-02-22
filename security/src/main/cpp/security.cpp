#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_cero_security_NativeKeys_getApiKey(
        JNIEnv* env,
        jobject) {

    std::string part1 = "eyJhbGciOiJIUzI1NiJ9.";
    std::string part2 = "REDACTED";
    std::string part3 = "Im5iZiI6MTc3MTcwMjQyNC4wMiwic3ViIjoiNjk5YTA4OTgx";
    std::string part4 = "MWI4YTkxZDFkYzU5Yzk0Iiwic2NvcGVzIjpbImFwaV9yZWFkIl0s";
    std::string part5 = "InZlcnNpb24iOjF9.REDACTED";

    std::string key = part1 + part2 + part3 + part4 + part5;

    return env->NewStringUTF(key.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_cero_security_NativeKeys_getBaseUrl(
        JNIEnv* env,
        jobject) {

    std::string url = "https://api.themoviedb.org/3/";
    return env->NewStringUTF(url.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_cero_security_NativeKeys_getImageBaseUrl(
        JNIEnv* env,
        jobject) {

    std::string url = "https://image.tmdb.org/t/p/w500";
    return env->NewStringUTF(url.c_str());
}