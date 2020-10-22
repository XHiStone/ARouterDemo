#include <string.h>
#include <android/log.h>
#include <com_xhiston_arouterdemo_DiffUpdateUtil.h>

jint
Java_com_xhiston_arouterdemo_DiffUpdateUtil_patch (JNIEnv *env, jclass clazz, jstring old, jstring new, jstring patch) {
    int args=4;
    int resutlt = args;
    char *argv[args];
    argv[0] = "bspatch";
    argv[1] = (char*)((*env)->GetStringUTFChars(env, old, 0));
    argv[2] = (char*)((*env)->GetStringUTFChars(env, new, 0));
    argv[3] = (char*)((*env)->GetStringUTFChars(env, patch, 0));
    resutlt = mybspatch(args,argv);
    (*env)->ReleaseStringUTFChars(env,old, argv[1]);
    (*env)->ReleaseStringUTFChars(env,new, argv[2]);
    (*env)->ReleaseStringUTFChars(env,patch,argv[3]);
    return resutlt;
}


jint
Java_com_xhiston_arouterdemo_DiffUpdateUtil_diff (JNIEnv *env, jclass clazz, jstring old, jstring new, jstring patch) {
       int args=4;
       int resutlt = args;
       char *argv[args];
       argv[0] = "bspatch";
       argv[1] = (char*)((*env)->GetStringUTFChars(env, old, 0));
       argv[2] = (char*)((*env)->GetStringUTFChars(env, new, 0));
       argv[3] = (char*)((*env)->GetStringUTFChars(env, patch, 0));
       resutlt= mybsdiff(args,argv);
       (*env)->ReleaseStringUTFChars(env,old, argv[1]);
       (*env)->ReleaseStringUTFChars(env,new, argv[2]);
       (*env)->ReleaseStringUTFChars(env,patch,argv[3]);
 return resutlt;
}