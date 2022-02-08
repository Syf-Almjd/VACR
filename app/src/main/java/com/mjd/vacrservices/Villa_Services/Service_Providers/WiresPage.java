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

public class WiresPage extends AppCompatActivity {
    ListView mainlist;
    ImageButton btnback;
    String[] maintitle = {
            "DEC Contract", "Essential Electrical",
            "Mr.Wireman", "Renovation Specialist", "More"
    };
    String[] subtitle = {
            "Provides all kinds of electrical & wiring connectivity with more than 10 years of professional history", "Professional electrical company with 20 years of valuable experience",
            "Provides the best prices according to website", "Renovation Specialist specialise in KL and Selangor area",
            ""
    };
    Integer[] imgid = {
            R.drawable.wiring, R.drawable.wiring,
            R.drawable.wiring, R.drawable.wiring, R.drawable.vacrs

    };
    String[] rate = {
            "4.6", "4.5",
            "4.3", "4.6", ""

    };
    String[] status = {
            "Provides All Services", "Free Quote Available",
            "Proivdes Best Prices", "Provides Multiple Services", ""

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
                    isOnline();
                    Toast.makeText(WiresPage.this, "Great Choice! Here is the service provider \uD83D\uDE03", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_webview_page);
                    webView = findViewById(R.id.confirmpage_webpage);
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("https://www.deccontract.com.my/");
                    Toast.makeText(WiresPage.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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

                } else if (position == 1) {
                    isOnline();
                    Toast.makeText(WiresPage.this, "Great Choice! Here is the service provider \uD83D\uDE03", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_webview_page);
                    webView = findViewById(R.id.confirmpage_webpage);
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("https://essentialelectrical.com.my/");
                    Toast.makeText(WiresPage.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
                } else if (position == 2) {
                    isOnline();
                    Toast.makeText(getApplicationContext(), "Good Choice! Here is the service provider \uD83D\uDE4C", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_webview_page);
                    webView = findViewById(R.id.confirmpage_webpage);
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("https://www.wireman.my/");
                    Toast.makeText(WiresPage.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
                } else if (position == 3) {
                    isOnline();
                    Toast.makeText(getApplicationContext(), "Good Choice! Here is the service provider \uD83D\uDE4C", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_webview_page);
                    webView = findViewById(R.id.confirmpage_webpage);
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("https://renovationspecialistmalaysia.com/wiring/");
                    Toast.makeText(WiresPage.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
                } else if (position == 4) {
                    isOnline();
                    Toast.makeText(getApplicationContext(), "Sure! Just ask for what you want \uD83D\uDE4C", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_webview_page);
                    webView = findViewById(R.id.confirmpage_webpage);
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("https://www.kaodim.com/location/electric-and-wiring-in-kl");
                    Toast.makeText(WiresPage.this, "Loading.. ⌛", Toast.LENGTH_LONG).show();
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
            }
        });
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location = new Intent(WiresPage.this, contact_options.class);
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
            Intent opensliderintent = new Intent(WiresPage.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}