package com.llf.component.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.llf.component.common.BaseActivity;
import com.llf.component.common.BaseFragment;
import com.llf.component.common.base.FragmentAdapter;
import com.llf.component.common.base.ViewManager;
import java.util.List;


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
