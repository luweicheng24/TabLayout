package com.example.luweicheng.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.luweicheng.tablayout.fragment.TabFragment;

import java.util.List;

/**
 * Created by luweicheng on 2016/4/14.
 */
public class ViewPagerAdapte extends FragmentStatePagerAdapter {
    private List<TabFragment> list;
    public ViewPagerAdapte(FragmentManager fm, List<TabFragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return list.get(position).getTitle();
    }
}
