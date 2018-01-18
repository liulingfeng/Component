package com.llf.component;

import android.content.Context;
import android.support.multidex.MultiDex;
import com.llf.component.common.BaseApplication;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by lxs on 2018/1/18.
 * 配置空壳的第三方包
 */

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        // dex突破65535的限制
        MultiDex.install(this);
        //bugly配置,第三个参数发布时改为false
        CrashReport.initCrashReport(getApplicationContext(), "3c1e673ec2", true);
    }
}
