package com.xhiston.module3;

import android.app.Activity;
import android.view.View;

import com.xhiston.arouter.ARouterConstants;
import com.xhiston.arouter.ARouterUtil;

/**
 * Created by xie on 2020/10/16.
 */
public class MainViewModel {
    private Activity activity;

    public MainViewModel(Activity activity) {
        this.activity = activity;
    }

    public String name() {
        return "module3";
    }

    public void onViewClick(View v) {
        ARouterUtil.getInstance().startActivityForResult(ARouterConstants.MODULE2_MAIN_ACTIVITY, activity, ARouterConstants.MODULE3_REQUEST_CODE_MODULE);
    }
}
