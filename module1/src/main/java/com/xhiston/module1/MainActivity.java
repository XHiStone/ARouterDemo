package com.xhiston.module1;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xhiston.arouter.ARouterConstants;
import com.xhiston.common.BaseActivity;
import com.xhiston.module1.databinding.ActivityModuleOneBinding;

@Route(path = ARouterConstants.MODULE1_MAIN_ACTIVITY)
public class MainActivity extends BaseActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityModuleOneBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_module_one);
        binding.setViewModel(new MainViewModel(this));
    }

    @Override
    public void finishActivity() {
        setResult(RESULT_OK);
        finish();
    }
}
