package com.ljx.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ljx.mylibrary.MyMainLibrary;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMainLibrary myMainLibrary=new MyMainLibrary();
        /**
         * 注释
         */
        Log.d("=====",""+ myMainLibrary.getAge(3,9));

    }
}