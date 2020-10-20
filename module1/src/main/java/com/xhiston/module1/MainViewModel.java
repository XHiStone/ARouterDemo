package com.xhiston.module1;

import android.view.View;

/**
 * Created by xie on 2020/10/16.
 */
public class MainViewModel  {
    private MainView view;

    public MainViewModel(MainView view) {
        this.view = view;
    }

    public String name() {
        return "Model1";
    }

    public void onViewClick(View v) {
        view.finishActivity();
    }
}
