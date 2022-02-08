package com.mjd.vacrservices.Main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.Locations.location_carwash;
import com.mjd.vacrservices.Locations.location_cleaning;
import com.mjd.vacrservices.Locations.location_mart;
import com.mjd.vacrservices.Locations.location_workout;
import com.mjd.vacrservices.Main.About.FeedbackVA;
import com.mjd.vacrservices.Main.About.VACR_connect;
import com.mjd.vacrservices.Main.About.contact_options;
import com.mjd.vacrservices.Main.About.infoPage;
import com.mjd.vacrservices.R;
import com.mjd.vacrservices.Villa_Services.CarFix;
import com.mjd.vacrservices.Villa_Services.Hair_Dressing;
import com.mjd.vacrservices.Villa_Services.Recycle_donate;
import com.mjd.vacrservices.Villa_Services.Service_Providers.WiresPage;
import com.mjd.vacrservices.Villa_Services.Tutor;
import com.mjd.vacrservices.Villa_Services.dog_walk;
import com.mjd.vacrservices.Villa_Services.laundry;


public class MainActivity extends AppCompatActivity {
    ListView mainlist;
    ImageButton btncart;
    ImageButton infoUs;
    EditText searchBar;
    Intent findTutor;
    Intent fitness;
    Intent report;
    Intent car;
    Intent dogwalk;
    Intent laundry;
    Intent otherServices;
    Intent contactVACR;
    ImageButton btnback;
    String[] maintitle = {
            "Vehicle Wash", "Market Delivery",
            "House Cleaning", "Find a Tutor",
            "Fitness Instructor", "Villa Angsana",
            "Car Maintenance", "Hairdressing", "Pet Walk",
            "Laundry", "Electricity and Wires", "Recycle, Support or Donate", "Find Other Services",
            "Contact VACR"
    };
    String[] subtitle = {
            "Estimate Washing Time 45 min - 1 hour", "All Essential Grocery Items and More",
            "Giving Attention to Every Corner", "Nearby Professional Tutor Online and Offline",
            "A Professional Coach for Your Fitness Journey", "You can contact, report or give suggestions to VAC",
            "All Car Maintenance and Servicing Checking", "All Types of Hairdressing done by specialists!", "Walking your Pet is on US!",
            "Get back your fresh and clean laundry as soon as possible", "Solve electrical problems to provide stable and safety power", "Recycle your unused items and Donate to those who need it",
            "Suggest Us Something",
            "",

    };
    Integer[] imgid = {
            R.drawable.carwash, R.drawable.shop,
            R.drawable.houseclean, R.drawable.education,
            R.drawable.fitness, R.drawable.report,
            R.drawable.car, R.drawable.hair, R.drawable.dogwalking,
            R.drawable.laundry, R.drawable.wiring, R.drawable.earth_green,
            R.drawable.vacrs, R.drawable.contact,
    };
    String[] rate = {
            "4.8", "4.9",
            "4.8", "4.9",
            "4.8", "5",
            "4.6", "4.8", "4.7",
            "5", "4.7", "4.9",
            "5", ""
    };
    String[] status = {
            "Preferred", "Recommended",
            "Preferred", "Promotion Available",
            "Promotion Available", "Recommended",
            "Preferred", "Preferred", "Recommended",
            "Recommended", "Preferred", "Recommended",
            "Available", "Available"
    };
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


        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (sharedPreferences.getBoolean("IS_FIRST_TIME", true)) {
            Intent opensliderintent = new Intent(MainActivity.this, infoPage.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "Inspired and Developed in \uD83C\uDDF2\uD83C\uDDFE with love from \uD83C\uDDF5\uD83C\uDDF8", Toast.LENGTH_LONG).show();
            sharedPreferences.edit().putBoolean("IS_FIRST_TIME", false).apply();
        }

        MainServices adapter = new MainServices(this, maintitle, subtitle, imgid, rate, status);
        mainlist = (ListView) findViewById(R.id.mainservices);
        mainlist.setAdapter(adapter);

        searchBar = findViewById(R.id.searchBar);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s.toString());
                Toast.makeText(MainActivity.this, "Please Take a look at the Main Page ✨", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Let's do it! Choose your car location \uD83D\uDE03", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(MainActivity.this, location_carwash.class);
                    startActivity(location);
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(), "Stay safe at home, We will do it! \uD83E\uDD16", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(MainActivity.this, location_mart.class);
                    startActivity(location);
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "No worries our agents will make your house shine again ✨", Toast.LENGTH_SHORT).show();
                    Intent location = new Intent(MainActivity.this, location_cleaning.class);
                    startActivity(location);
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Finding best Tutors Online and Offline \uD83D\uDC69\u200D\uD83C\uDFEB", Toast.LENGTH_SHORT).show();
                    findTutor = new Intent(MainActivity.this, Tutor.class);
                    startActivity(findTutor);
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "Let's burn! Experienced Trainers for you \uD83D\uDCAA", Toast.LENGTH_SHORT).show();
                    fitness = new Intent(MainActivity.this, location_workout.class);
                    startActivity(fitness);
                } else if (position == 5) {
                    Toast.makeText(getApplicationContext(), "Let's get in touch with VAC! ✔", Toast.LENGTH_SHORT).show();
                    report = new Intent(MainActivity.this, FeedbackVA.class);
                    startActivity(report);
                } else if (position == 6) {
                    Toast.makeText(getApplicationContext(), "Need a Car check? We got you \uD83D\uDE97", Toast.LENGTH_SHORT).show();
                    car = new Intent(MainActivity.this, CarFix.class);
                    startActivity(car);
                } else if (position == 7) {
                    Toast.makeText(getApplicationContext(), "Let's walk your pet! \uD83D\uDC15", Toast.LENGTH_SHORT).show();
                    dogwalk = new Intent(MainActivity.this, dog_walk.class);
                    startActivity(dogwalk);
                } else if (position == 8) {
                    Toast.makeText(getApplicationContext(), "Let's get in touch with Villa Angsana \uD83E\uDD19\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                    Intent hairdress = new Intent(MainActivity.this, Hair_Dressing.class);
                    startActivity(hairdress);
                } else if (position == 9) {
                    Toast.makeText(getApplicationContext(), "No worries! We will do that \uD83E\uDDFA", Toast.LENGTH_SHORT).show();
                    laundry = new Intent(MainActivity.this, laundry.class);
                    startActivity(laundry);
                } else if (position == 10) {
                    Toast.makeText(getApplicationContext(), "No worries! We will do that ⚡", Toast.LENGTH_SHORT).show();
                    Intent wiring = new Intent(MainActivity.this, WiresPage.class);
                    startActivity(wiring);
                } else if (position == 11) {
                    Toast.makeText(getApplicationContext(), "It does not matter how much we donate; it matters whether the donation is meaningful.", Toast.LENGTH_SHORT).show();
                    Intent Recycle_donate = new Intent(MainActivity.this, Recycle_donate.class);
                    startActivity(Recycle_donate);
                } else if (position == 12) {
                    Toast.makeText(getApplicationContext(), "Can't wait for your suggestions ✨", Toast.LENGTH_SHORT).show();
                    otherServices = new Intent(MainActivity.this, contact_options.class);
                    startActivity(otherServices);
                } else if (position == 13) {
                    Toast.makeText(getApplicationContext(), "Let's get in touch with VACR \uD83E\uDD19\uD83C\uDFFB", Toast.LENGTH_SHORT).show();
                    contactVACR = new Intent(MainActivity.this, VACR_connect.class);
                    startActivity(contactVACR);
                }
            }
        });

        infoUs = findViewById(R.id.infoUs);
        infoUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opensliderintent = new Intent(MainActivity.this, infoPage.class);
                startActivity(opensliderintent);
            }
        });

        btncart = findViewById(R.id.cart);
        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opensliderintent = new Intent(MainActivity.this, NewsPage.class);
                startActivity(opensliderintent);
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
}