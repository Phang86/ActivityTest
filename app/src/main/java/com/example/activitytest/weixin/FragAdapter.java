package com.example.activitytest.weixin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentlist = new ArrayList<>();


    public FragAdapter(@NonNull FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.fragmentlist = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }
}
