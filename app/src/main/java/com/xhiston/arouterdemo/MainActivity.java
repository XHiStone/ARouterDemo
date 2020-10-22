package com.xhiston.arouterdemo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xhiston.arouter.ARouterConstants;
import com.xhiston.arouterdemo.databinding.ActivityMainBinding;
import com.xhiston.common.BaseActivity;

import java.io.File;

@Route(path = ARouterConstants.APP_MAIN_ACTIVITY)
public class MainActivity extends BaseActivity implements MainView {
    private String path = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "差分包";

    private void dspatch() {
        String patch = path + File.separator + "patch.patch";
        String newApk = path + File.separator + "new.apk";
        File file = new File(patch);
        if (file.exists()) {
            int dif = DiffUpdateUtil.patch(path+File.separator + "base.apk", newApk, patch);
            Log.e("tag", "组合Apk中 dif=" + dif);
        }
    }

    protected boolean checkPermissions(String[] permissions) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel(this));

//        int num = DiffUpdateUtil.patch(getApplicationInfo().sourceDir, "", "");
//        binding.tvContent.setText(String.valueOf(num));
//        Log.e("tag","native num="+num+"");
//        String patch = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator+"patch.patch";

        boolean p = checkPermissions(new String[]{android
                .Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.READ_EXTERNAL_STORAGE});
        if (p) {
            ActivityCompat.requestPermissions(this, new String[]{android
                    .Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE}, 10001);
        } else {
            dspatch();
        }

//        Log.e("tag", "Environment.getExternalStorageDirectory().path=" + file.getAbsolutePath()+file.exists());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length == 0 || PackageManager.PERMISSION_GRANTED != grantResults[0]) {

        } else {
            if (new File(path).exists()) dspatch();
        }
    }

    @Override
    public void intentView() {
        startActivity(new Intent(this, MainActivity2.class));
    }
}