package com.example.luweicheng.tablayout.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luweicheng.tablayout.R;

/**
 * Created by luweicheng on 2016/4/14.
 */
public class FragmentThr extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentone,null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("我是第三个页面");
        return view;
    }
}
