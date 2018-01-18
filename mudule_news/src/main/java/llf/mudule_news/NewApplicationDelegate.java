package llf.mudule_news;

import llf.module_common.base.IApplicationDelegate;
import llf.module_common.base.ViewManager;

/**
 * Created by lxs on 2018/1/18./
 */

public class NewApplicationDelegate implements IApplicationDelegate{
    @Override
    public void onCreate() {
        ViewManager.getInstance().addFragment(0, NewsFragment.newInstance());
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
