package com.example.android.tabsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ehayes on 8/28/2014.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if(position == 0){
            fragment = new FragmentA();
        }
        if(position == 1){
            fragment = new FragmentB();
        }
        if(position == 2){
            fragment = new FragmentC();
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 3;
    }
}
