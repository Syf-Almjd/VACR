package com.mjd.vacrservices.Villa_Services;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.Main.no_internet;
import com.mjd.vacrservices.R;
import com.mjd.vacrservices.Villa_Services.Service_Providers.Top_coaches;

public class Workout extends AppCompatActivity {
    ImageButton btnback;
    Button option1, option2, option3, option4, morebtn;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_page);
        webView = findViewById(R.id.confirmpage_webpage);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://mjd.law.blog/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        btnback = findViewById(R.id.backbtn);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        setContentView(R.layout.activity_workout);
        btnback = findViewById(R.id.backbtn);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        morebtn = findViewById(R.id.morebtn);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Workout.this, "Amazing!! Here is our top Coaches. \uD83D\uDE4C\uD83C\uDFFB Please Choose one", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(Workout.this, Top_coaches.class);
                startActivity(OrderPage);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Workout.this, "Great!! Here is our top Coaches. \uD83D\uDE4C\uD83C\uDFFB Please Choose one", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(Workout.this, Top_coaches.class);
                startActivity(OrderPage);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Workout.this, "Noted, let's Get in Touch with the Coach \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(Workout.this, about_coach_geene.class);
                startActivity(OrderPage);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Workout.this, "Great, You will be contact by an instructor soon \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20VACR%20user%20and%20I%20would%20like%20to%20book%20Yoga%20sessions!"));
                startActivity(intent);
                Toast.makeText(Workout.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });

        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(Workout.this, "Sure, Just wish ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSejzMZr6KHXeiWw0ydj2GuH7ukj4VS4Ai8RNDuePGjoCevMbQ/viewform?usp=sf_link");
                Toast.makeText(Workout.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                btnback = findViewById(R.id.backbtn);
                btnback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            Intent opensliderintent = new Intent(Workout.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}