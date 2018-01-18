package com.llf.component.girls.debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.llf.component.girls.GirlActivity;

/**
 * Created by lxs on 2018/1/17.
 * 制造一个启动页
 * 用来处理有的页面没有数据启动不了
 */

public class LauncherActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, GirlActivity.class);
        intent.putExtra("name", "avcd");
        intent.putExtra("syscode", "023e2e12ed");
        startActivity(intent);
        finish();
    }
}
