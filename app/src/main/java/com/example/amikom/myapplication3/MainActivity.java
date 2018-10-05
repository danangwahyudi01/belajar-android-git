package com.example.amikom.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity  extends AppCompatActivity {
    preferencesHelper instance;
    @override
    protected void onCreate (bundle savedInstanceState){

     super.onCreate(Bundle savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler
        instance =preferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
            if (!instance.islogin (() {
                startActivity(new Intent(SplashActivity.this,LoginActivity.class));
            }else{
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, splashInterval);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
