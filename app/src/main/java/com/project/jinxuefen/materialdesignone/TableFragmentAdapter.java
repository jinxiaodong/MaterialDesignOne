package com.project.jinxuefen.materialdesignone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by xiaodong.jin on 2017/5/3.
 */
public class TableFragmentAdapter extends FragmentPagerAdapter {
    public TableFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab" + position;
    }
}
