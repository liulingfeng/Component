package com.llf.component.girls;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.llf.component.common.BaseActivity;

/**
 * Created by lxs on 2018/1/19./
 */
@Route(path = "/girl/girlDetail")
public class GirlDetailActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_detail);
    }
}
