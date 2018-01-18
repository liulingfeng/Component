package com.llf.component.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.llf.component.common.BaseActivity;
import com.llf.component.common.BaseFragment;
import com.llf.component.common.base.FragmentAdapter;
import com.llf.component.common.base.ViewManager;

import java.util.List;


public class MainActivity extends BaseActivity {
    private ViewPager mViewPager;
    private BottomNavigationBar mBottomNavigationBar;
    private FragmentAdapter mFragmentAdapter;
    private List<BaseFragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewPager);
        mBottomNavigationBar = findViewById(R.id.bottom_navigation_bar);
        mFragments = ViewManager.getInstance().getAllFragment();
        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mFragmentAdapter);

        mBottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_main_news, "新闻"))
                .addItem(new BottomNavigationItem(R.drawable.ic_main_girls, "美女"))
                .initialise();
        mBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                mViewPager.setCurrentItem(position, false);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottomNavigationBar.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
