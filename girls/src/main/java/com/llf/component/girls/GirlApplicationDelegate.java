package com.llf.component.girls;

import com.llf.component.common.base.IApplicationDelegate;
import com.llf.component.common.base.ViewManager;

/**
 * Created by lxs on 2018/1/18./
 */

public class GirlApplicationDelegate implements IApplicationDelegate {
    @Override
    public void onCreate() {
        ViewManager.getInstance().addFragment(0, GirlFragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
