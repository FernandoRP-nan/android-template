#include <jni.h>
#include <string>

// Módulo nativo de ejemplo — sin secretos embebidos.
extern "C" JNIEXPORT jstring JNICALL
Java_com_example_security_NativeLib_stringFromJNI(JNIEnv *env, jobject /* thiz */) {
    std::string message = "security native module";
    return env->NewStringUTF(message.c_str());
}
