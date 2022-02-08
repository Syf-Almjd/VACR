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

public class Recycle_donate extends AppCompatActivity {

    ImageButton btnback;
    Button option1, option2, option3, option4;
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


        setContentView(R.layout.activity_recycle_donate);
        btnback = findViewById(R.id.backbtn);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recycle_donate.this, "Redirecting you to a trusted organisation in Malaysia  ✨", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mykasih.com.my/site/"));
                startActivity(intent);
                Toast.makeText(Recycle_donate.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(Recycle_donate.this, "Sure! You can get paid for recycling too ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://www.rfl.com.my/");
                Toast.makeText(Recycle_donate.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(Recycle_donate.this, "Sure! Please let us know how we can help you ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://firstclasse.com.my/supportlocal-local-businesses-to-be-featured/");
                Toast.makeText(Recycle_donate.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recycle_donate.this, "Redirecting you to Moving Sama-Sama Lokal Forward Maybank2u ✨", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.maybank2u.com.my/maybank2u/malaysia/en/personal/marketplace/samasamalokal_redirect.page"));
                startActivity(intent);
                Toast.makeText(Recycle_donate.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
            Intent opensliderintent = new Intent(Recycle_donate.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
