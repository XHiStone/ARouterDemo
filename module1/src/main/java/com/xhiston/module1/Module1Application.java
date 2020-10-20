package com.xhiston.module1;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xie on 2020/10/16.
 */
public class Module1Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.printStackTrace(); // 打印日志的时候打印线程堆栈
        ARouter.init(this);
    }
}
