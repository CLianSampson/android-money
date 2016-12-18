package com.example.apple.money.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.apple.money.R;
import com.example.apple.money.http.RequestCallback;

import java.util.Objects;

public class MainActivity extends BaseActivity implements RequestCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void childImpl(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main2);

        String[] testStr = {"a","b"};
        String str = testStr[2];
        Log.i("test", str);

        netRequest();

    }

    @Override
    protected  void netRequest(){
        super.netRequest();
        request.setCallback(this);
    }

    @Override
    public void sucess(Object object) {
        String string = (String )object;
    }

    @Override
    public void fail(Object object) {

    }
}
