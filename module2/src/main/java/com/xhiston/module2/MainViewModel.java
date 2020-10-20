package com.xhiston.module2;

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
        return "module2";
    }

    public void onViewClick(View v) {
        ARouterUtil.getInstance().startActivityForResult(ARouterConstants.MODULE1_MAIN_ACTIVITY, activity, ARouterConstants.MODULE2_REQUEST_CODE_MODULE);
//        ARouterProvider iaRouter = (ARouterProvider) ARouterUtil.getInstance().startActivity(ARouterConstants.APP_IAROUTER);
//        iaRouter.startActivity(v.getContext());
    }
}
