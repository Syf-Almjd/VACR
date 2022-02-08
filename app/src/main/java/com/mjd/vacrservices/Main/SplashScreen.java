package com.mjd.vacrservices.Main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler splashscreen = new Handler();
        splashscreen.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openactivityintent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(openactivityintent);
                finish();
            }
        }, 1000);
    }
}