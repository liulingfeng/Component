package llf.mudule_girl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import llf.module_common.BaseFragment;

/**
 * Created by lxs on 2018/1/18./
 */

public class GirlFragment extends BaseFragment{
    public static GirlFragment newInstance() {
        return new GirlFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_girls, container, false);
    }
}