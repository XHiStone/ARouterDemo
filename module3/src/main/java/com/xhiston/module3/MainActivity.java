package com.xhiston.module3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xhiston.arouter.ARouterConstants;
import com.xhiston.common.BaseActivity;
import com.xhiston.module3.databinding.ActivityModuleThreeBinding;

@Route(path = ARouterConstants.MODULE3_MAIN_ACTIVITY)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityModuleThreeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_module_three);
        binding.setViewModel(new MainViewModel(this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) finish();
    }
}
