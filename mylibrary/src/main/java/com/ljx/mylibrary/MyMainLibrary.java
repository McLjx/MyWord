package com.ljx.mylibrary;

import android.content.Context;
import android.content.Intent;

public  class MyMainLibrary {
    public int getAge(int a,int b){
        return a+b;
    }


    public void startActivityContext(Context context){
        Intent intent=new Intent(context,MyMainActivity.class);
        context.startActivity(intent);
    }

}
