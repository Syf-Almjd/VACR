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

public class about_coach_geene extends AppCompatActivity {
    ImageButton btnback, call;
    Button contact, tiktok, instagram;
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


        setContentView(R.layout.activity_about_coach);
        btnback = findViewById(R.id.backbtn);
        tiktok = findViewById(R.id.tiktok);
        instagram = findViewById(R.id.ig);
        call = findViewById(R.id.call);
        contact = findViewById(R.id.btncontact);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(about_coach_geene.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=60169389976&text="));
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(about_coach_geene.this, "Sure! Here is coach Geene ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.instagram.com/p/CSYD_7chuJa/");
                Toast.makeText(about_coach_geene.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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


        tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(about_coach_geene.this, "Great! take a look ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.tiktok.com/@brothergeene");
                Toast.makeText(about_coach_geene.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+60169389976"));
                startActivity(callIntent);
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
            Intent opensliderintent = new Intent(about_coach_geene.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}