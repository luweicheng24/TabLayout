package com.example.luweicheng.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.luweicheng.tablayout.fragment.FragmentOne;
import com.example.luweicheng.tablayout.fragment.FragmentThr;
import com.example.luweicheng.tablayout.fragment.FragmentTwo;
import com.example.luweicheng.tablayout.fragment.TabFragment;

import java.util.ArrayList;
import java.util.List;

public class SecActiviity extends AppCompatActivity {
private List<TabFragment> mList;
    private ViewPager mViewPage;
    private TabLayout mTableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
       mViewPage= (ViewPager) findViewById(R.id.viewPager);
        mTableLayout= (TabLayout) findViewById(R.id.tableLayout);
        mList=new ArrayList<TabFragment>();
        mList.add(new TabFragment(new FragmentOne(),"第一个页面"));
        mList.add(new TabFragment(new FragmentTwo(),"第二个页面"));
        mList.add(new TabFragment(new FragmentThr(),"第三个页面"));
        FragmentManager manager=getSupportFragmentManager();
        ViewPagerAdapte adapter=new ViewPagerAdapte(manager,mList);
        mViewPage.setAdapter(adapter);
        mTableLayout.setupWithViewPager(mViewPage);

    }
}
