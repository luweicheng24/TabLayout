package com.example.luweicheng.tablayout;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
            startActivity(new Intent().setComponent(
                new ComponentName(MainActivity.this,FirstActivity.class)));
                break;
            case R.id.button2:
                startActivity(new Intent().setComponent(
                        new ComponentName(MainActivity.this,SecActiviity.class)));
    }
}}
