package com.xhiston.arouter;

import android.app.Activity;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xie on 2020/10/16.
 */
public class ARouterUtil {
    private static volatile ARouterUtil instance;

    private ARouterUtil() {
    }

    public static ARouterUtil getInstance() {
        if (instance == null) {
            synchronized (ARouterUtil.class) {
                if (instance == null) {
                    instance = new ARouterUtil();
                }
            }
        }
        return instance;
    }

    public Object startActivity(String intentPath) {
        return ARouter.getInstance().build(intentPath).navigation();
    }

    public void startActivityForResult(String intentPath, Activity activity, int requestCode) {
        ARouter.getInstance().build(intentPath).navigation(activity, requestCode);
    }
}