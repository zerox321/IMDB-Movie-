#include <jni.h>
#include <string>


extern "C"
JNIEXPORT jstring JNICALL
Java_com_eramint_movieapp_HomeActivity_00024Companion_API_1KEY(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("33d4256907607c7062f0f08b1b125bfd");
}