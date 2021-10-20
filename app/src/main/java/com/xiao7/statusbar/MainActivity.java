package com.xiao7.statusbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiao7.status.library.OmgStatusBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用沉浸式(透明)状态栏
        OmgStatusBar.with(MainActivity.this).set(0x55000000);
    }
}
