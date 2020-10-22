#include <jni.h>

#ifndef _Included_com_xhiston_arouterdemo_DiffUpdateUtil
#define _Included_com_xhiston_arouterdemo_DiffUpdateUtil
#ifdef __cplusplus
extern "C" {
    #endif
    int mybspatch(int argc, char *argv[]);
    int mybsdiff(int argc,char *argv[]);

    JNIEXPORT jint JNICALL Java_com_xhiston_arouterdemo_DiffUpdateUtil_patch
      (JNIEnv *, jclass, jstring, jstring, jstring);

    JNIEXPORT jint JNICALL Java_com_xhiston_arouterdemo_DiffUpdateUtil_diff
      (JNIEnv *, jclass, jstring, jstring, jstring);

    #ifdef __cplusplus
}
#endif
#endif
