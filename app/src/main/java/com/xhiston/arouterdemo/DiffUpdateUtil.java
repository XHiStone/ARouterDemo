package com.xhiston.arouterdemo;

/**
 * Created by xie on 2020/10/20.
 */
public class DiffUpdateUtil {

    static {
        System.loadLibrary("diffupdate");
    }

    public static native int patch(String oldApk, String newApk, String patch);

    public static native int diff(String oldApk,String newApk,String patch);
}
