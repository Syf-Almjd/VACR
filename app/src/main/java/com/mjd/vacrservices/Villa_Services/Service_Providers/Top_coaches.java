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

import com.mjd.vacrservices.Main.About.contact_options;
import com.mjd.vacrservices.Main.MainServices;
import com.mjd.vacrservices.Main.no_internet;
import com.mjd.vacrservices.R;
import com.mjd.vacrservices.Villa_Services.about_coach_geene;

public class Top_coaches extends AppCompatActivity {
    ListView mainlist;

    String[] maintitle = {
            "Coach Geene"
    };


    String[] subtitle = {
            "Best for Losing weight and Hitt workouts"
    };

    Integer[] imgid = {
            R.drawable.geene
    };

    String[] rate = {
            "5"
    };
    String[] status = {
            "Preferred"
    };
    ImageButton btnback;
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
                Toast.makeText(Top_coaches.this, "Great choice! Let's gain and burn! \uD83D\uDE03", Toast.LENGTH_SHORT).show();
                Intent location = new Intent(Top_coaches.this, about_coach_geene.class);
                startActivity(location);
            }

        });
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location = new Intent(Top_coaches.this, contact_options.class);
                startActivity(location);
            }
        });
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location = new Intent(Top_coaches.this, contact_options.class);
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
            Intent opensliderintent = new Intent(Top_coaches.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}