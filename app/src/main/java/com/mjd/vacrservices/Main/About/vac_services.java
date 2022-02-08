package com.mjd.vacrservices.Main.About;

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

public class vac_services extends AppCompatActivity {

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


        setContentView(R.layout.activity_vac_services);
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
                isOnline();
                setContentView(R.layout.activity_webview_page);
                webView = findViewById(R.id.confirmpage_webpage);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.propsocial.my/developments/villa-angsana-974");
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
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(vac_services.this, "Great! VA will be happy with your suggestions ✨", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(vac_services.this, Contact_pageVA.class);
                        startActivity(intent);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(vac_services.this, "Every bit counts ✨", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(vac_services.this, foodbankVA.class);
                        startActivity(intent);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(vac_services.this, "Redirecting you to the VA nearest recycle machine ✨", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jalan+Lenggong+Park/@3.1944233,101.6828403,19.5z/data=!4m5!3m4!1s0x31cc47aeeb1b5eab:0x80d022b7f2076763!8m2!3d3.1945969!4d101.6833431"));
                        startActivity(intent);
                        Toast.makeText(vac_services.this, "Please Contact 039-021 1888 if you need help", Toast.LENGTH_LONG).show();
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
            Intent opensliderintent = new Intent(vac_services.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
