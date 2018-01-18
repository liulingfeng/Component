package com.llf.component.common;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.llf.component.common.base.ClassUtils;
import com.llf.component.common.base.IApplicationDelegate;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import java.util.List;


/**
 * Created by lxs on 2018/1/17.
 * 基础的Application
 * 配置全局的一些信息
 */

public class BaseApplication extends Application {
    public static BaseApplication sInstance;
    public static final String ROOT_PACKAGE = "com.llf.component";
    private RefWatcher refWatcher;
    private List<IApplicationDelegate> mAppDelegateList;

    public static RefWatcher getRefWatcher(Context context) {
        BaseApplication application = (BaseApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);

        //LeakCanary初始化
        refWatcher = LeakCanary.install(this);
        //找出所有实现mAppDelegateList的类

        mAppDelegateList = ClassUtils.getObjectsWithInterface(this, IApplicationDelegate.class, ROOT_PACKAGE);
        Log.e("大小",mAppDelegateList.size()+"");
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onCreate();
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onTerminate();
        }
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onLowMemory();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onTrimMemory(level);
        }
    }
}
