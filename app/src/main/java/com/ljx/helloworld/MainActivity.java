package com.ljx.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ljx.mylibrary.MyMainLibrary;


public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMainLibrary myMainLibrary=new MyMainLibrary();
        button=findViewById(R.id.bottom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myMainLibrary.startActivityContext(MainActivity.this);
            }
        });

        /**
         * 注释
         */
        Log.d("=====",""+ myMainLibrary.getAge(3,9));

    }
}