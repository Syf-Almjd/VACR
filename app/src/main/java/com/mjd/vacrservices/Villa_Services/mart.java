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

public class mart extends AppCompatActivity {
    ImageButton btnback;
    Button option1, option2, option3, option4, option5, option6, morebtn;
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


        setContentView(R.layout.activity_mart);
        btnback = findViewById(R.id.backbtn);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        option5 = findViewById(R.id.option5);
        option6 = findViewById(R.id.option6);
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
                Toast.makeText(mart.this, "Please type in you needed groceries \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20groceries%3A"));
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mart.this, "Great, Please type in you favourite snacks \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20snacks%3A%20"));
                startActivity(intent);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mart.this, "Noted, Please type in your needed item \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20items%3A"));
                startActivity(intent);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mart.this, "Noted, Please type in your needed item \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20items%3A"));
                startActivity(intent);
            }
        });
        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mart.this, "Hope you get well soon! Please order your needed items", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20items%3A"));
                startActivity(intent);
            }
        });
        option6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mart.this, "Noted, Please type in your needed item \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20resident%20in%20Villa%20Angsana%20and%20I%20would%20like%20to%20order%20the%20following%20items%3A"));
                startActivity(intent);
            }
        });
        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(mart.this, "Sure, Just wish ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdBPmaMtBmDIQkbg4P_n-e2Qp5AM6B6Qu8dWpX78sAKmSuE8w/viewform?usp=sf_link");
                Toast.makeText(mart.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
            Intent opensliderintent = new Intent(mart.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}