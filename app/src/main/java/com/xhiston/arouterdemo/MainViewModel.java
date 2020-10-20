package com.xhiston.arouterdemo;

import android.view.View;

import com.xhiston.arouter.ARouterConstants;
import com.xhiston.arouter.ARouterUtil;

/**
 * Created by xie on 2020/10/16.
 */
public class MainViewModel {
    private MainView view;

    public MainViewModel(MainView view) {
        this.view = view;
    }

    public String name() {
        return "app";
    }

    public void onViewClick(View v) {
        view.intentView();
//        ARouterUtil.getInstance().startActivity(ARouterConstants.MODULE3_MAIN_ACTIVITY);
    }
}
