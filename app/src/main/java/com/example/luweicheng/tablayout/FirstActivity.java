package com.example.luweicheng.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {
private TabLayout mTableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mTableLayout= (TabLayout) findViewById(R.id.tableLayout);
        mTableLayout.addTab(mTableLayout.newTab().setText("我是第一个标签"));
        mTableLayout.addTab(mTableLayout.newTab().setText("我是第二个标签"));
        mTableLayout.addTab(mTableLayout.newTab().setText("我是第三个标签"));
        mTableLayout.addTab(mTableLayout.newTab().setText("我是第四个标签"));
    }
}
