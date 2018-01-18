package llf.module_common.base;

/**
 * Created by lxs on 2018/1/18.
 * 提供BaseApplication的代理类
 */

public interface IApplicationDelegate {
    void onCreate();
    void onTerminate();
    void onLowMemory();
    void onTrimMemory(int level);
}
