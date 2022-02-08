package com.mjd.vacrservices.Locations;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.KL_Services.House_CleaningKL;
import com.mjd.vacrservices.Main.no_internet;
import com.mjd.vacrservices.R;
import com.mjd.vacrservices.Villa_Services.House_clean;

public class location_cleaning extends AppCompatActivity {
    ImageButton btnback;
    Button option1, option2, option3, morebtn;
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


        setContentView(R.layout.activity_location_cleaning);
        btnback = findViewById(R.id.backbtn);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);

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
                Toast.makeText(location_cleaning.this, "Nice to know that! now let's confirm your order \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(location_cleaning.this, House_clean.class);
                startActivity(OrderPage);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(location_cleaning.this, "Great! let's confirm your order \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(location_cleaning.this, House_CleaningKL.class);
                startActivity(OrderPage);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(location_cleaning.this, "Amazing! now let's confirm your order \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent OrderPage = new Intent(location_cleaning.this, House_CleaningKL.class);
                startActivity(OrderPage);
            }
        });

        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(location_cleaning.this, "Friendly reminder: We currently only operate in Malaysia :)", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSejzMZr6KHXeiWw0ydj2GuH7ukj4VS4Ai8RNDuePGjoCevMbQ/viewform?usp=sf_link");
                Toast.makeText(location_cleaning.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
            Intent opensliderintent = new Intent(location_cleaning.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}