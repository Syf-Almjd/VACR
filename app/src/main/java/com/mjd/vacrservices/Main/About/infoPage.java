package com.mjd.vacrservices.Main.About;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.mjd.vacrservices.Main.SliderAdopter;
import com.mjd.vacrservices.R;

public class infoPage extends AppCompatActivity {

    Button btnSkip, btnmore, btnpriavy;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        ViewPager viewPager = findViewById(R.id.viewPager);
        SliderAdopter slider = new SliderAdopter(this);
        viewPager.setAdapter(slider);

        back = findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnmore = findViewById(R.id.btnmore);
        btnmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infoPage.this, MoreAboutUs.class);
                startActivity(intent);
            }
        });
        btnpriavy = findViewById(R.id.btnprivacy);
        btnpriavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infoPage.this, VACR_connect.class);
                startActivity(intent);
            }
        });

        btnSkip = findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(infoPage.this, "Okay \uD83D\uDE2C", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}