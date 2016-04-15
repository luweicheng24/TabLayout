package com.example.luweicheng.tablayout.fragment;

import android.support.v4.app.Fragment;

/**
 * Created by luweicheng on 2016/4/14.
 */
public class TabFragment {
   private Fragment fragment;
    private String Title;

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public TabFragment(Fragment fragment, String title) {
        this.fragment = fragment;
        Title = title;
    }
}
