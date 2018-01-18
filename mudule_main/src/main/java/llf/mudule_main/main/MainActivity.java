package llf.mudule_main.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import java.util.List;

import llf.module_common.BaseActivity;
import llf.module_common.BaseFragment;
import llf.module_common.base.FragmentAdapter;
import llf.module_common.base.ViewManager;
import llf.mudule_main.R;

public class MainActivity extends BaseActivity {
    private ViewPager mViewPager;
    private FragmentAdapter mFragmentAdapter;
    private List<BaseFragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewPager);
        mFragments = ViewManager.getInstance().getAllFragment();
        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mFragmentAdapter);
    }
}
