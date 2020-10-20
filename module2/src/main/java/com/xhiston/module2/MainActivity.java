package com.xhiston.module2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xhiston.arouter.ARouterConstants;
import com.xhiston.arouter.ARouterProvider;
import com.xhiston.module2.databinding.ActivityModuleTwoBinding;

@Route(path = ARouterConstants.MODULE2_MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityModuleTwoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_module_two);
        binding.setViewModel(new MainViewModel(this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            setResult(RESULT_OK);
            finish();
        }
    }
}
