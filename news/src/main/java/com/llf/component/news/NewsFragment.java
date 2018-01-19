package com.llf.component.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.llf.component.common.BaseFragment;

/**
 * Created by lxs on 2018/1/18.
 * 新闻首页
 */

public class NewsFragment extends BaseFragment {
    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        Button btnGo = view.findViewById(R.id.btn_go);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/girl/girlDetail")
                        .withString("name", "刘小帅")
                        .navigation();
            }
        });
        return view;
    }
}
