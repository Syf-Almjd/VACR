package com.mjd.vacrservices.Villa_Services.Service_Providers;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.KL_Services.martKL;
import com.mjd.vacrservices.Main.About.contact_options;
import com.mjd.vacrservices.Main.MainServices;
import com.mjd.vacrservices.Main.no_internet;
import com.mjd.vacrservices.R;
import com.mjd.vacrservices.Villa_Services.mart;

public class Top_markets_VA extends AppCompatActivity {
    ListView mainlist;
    ImageButton btnback;
    String[] maintitle = {
            "Cheer up", "Mini Mart",
            "More"
    };
    String[] subtitle = {
            "Free Delivery with purchases as low as 20 RM", "Provides multiple services in a cheaper prices range",
            ""
    };
    Integer[] imgid = {
            R.drawable.shop, R.drawable.shop,
            R.drawable.vacrs

    };
    String[] rate = {
            "4.6", "4.5",
            ""

    };
    String[] status = {
            "Free Delivery Available", "Promotions Available",
            "Available"

    };
    Button btn;
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
        setContentView(R.layout.services_providers_page);

        btnback = findViewById(R.id.backbtn);

        MainServices adapter = new MainServices(this, maintitle, subtitle, imgid, rate, status);
        mainlist = (ListView) findViewById(R.id.mainservices);
        mainlist.setAdapter(adapter);


        mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Toast.makeText(Top_markets_VA.this, "Great choice! Let get your items Delivered ASAP \uD83D\uDEB4", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(Top_markets_VA.this, mart.class);
                    startActivity(location);
                } else if (position == 1) {
                    Toast.makeText(Top_markets_VA.this, "Great choice! Let's get the best prices \uD83D\uDE4C", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(Top_markets_VA.this, mart.class);
                    startActivity(location);
                } else if (position == 2) {
                    Toast.makeText(Top_markets_VA.this, "Great choice! Let's get the best prices \uD83D\uDE4C", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(Top_markets_VA.this, martKL.class);
                    startActivity(location);
                }
            }
        });
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location = new Intent(Top_markets_VA.this, contact_options.class);
                startActivity(location);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
            Intent opensliderintent = new Intent(Top_markets_VA.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}