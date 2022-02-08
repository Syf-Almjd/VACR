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

public class TeachingMenu extends AppCompatActivity {
    ImageButton btnback;
    Button option1, option3, option4, option5, option6, morebtn;
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


        setContentView(R.layout.activity_teaching_menu);
        btnback = findViewById(R.id.backbtn);
        option1 = findViewById(R.id.option1);
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
                Toast.makeText(TeachingMenu.this, "Noted!! We will provide you the details of one soon. \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20user%20of%20VACR%20and%20I%20would%20like%20to%20find%20an%20online%20tutor%20for%20mathematics. "));
                startActivity(intent);
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TeachingMenu.this, "Great!! We will provide you the details of one soon. \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20user%20of%20VACR%20and%20I%20would%20like%20to%20find%20an%20online%20tutor%20for%20technology."));
                startActivity(intent);
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TeachingMenu.this, "Amazing!! We will provide you the details of one soon. \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20user%20of%20VACR%20and%20I%20would%20like%20to%20find%20an%20online%20tutor%20for%20sciences."));
                startActivity(intent);
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });


        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TeachingMenu.this, "Noted!! We will provide you the details of one soon. \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=601156214681&text=Hi%20VACR%20%F0%9F%91%8B%2C%0AI%20am%20a%20user%20of%20VACR%20and%20I%20would%20like%20to%20find%20an%20online%20tutor%20for%20programming"));
                startActivity(intent);
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
            }
        });
        option6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(TeachingMenu.this, "Sure! Here is a Search Engine \uD83D\uDE4C\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://teachme.com.my/");
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOnline();
                Toast.makeText(TeachingMenu.this, "Sure ✨", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSejzMZr6KHXeiWw0ydj2GuH7ukj4VS4Ai8RNDuePGjoCevMbQ/viewform?usp=sf_link");
                Toast.makeText(TeachingMenu.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
            Intent opensliderintent = new Intent(TeachingMenu.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}