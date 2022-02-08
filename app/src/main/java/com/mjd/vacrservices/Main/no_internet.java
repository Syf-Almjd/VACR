package com.mjd.vacrservices.Main;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mjd.vacrservices.R;

public class no_internet extends AppCompatActivity {
    Button retry_btn;
    ImageButton btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.no_internet);
        retry_btn = findViewById(R.id.retry_btn);
        retry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(no_internet.this, "Sure ✨", Toast.LENGTH_SHORT).show();
                isOnline();
            }
        });

    }

    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            finish();
            Toast.makeText(this, "Enjoy you are connected :) \nPlease go back to Refresh ✨", Toast.LENGTH_SHORT).show();
            return true;

        } else {
            finish();
            Intent opensliderintent = new Intent(no_internet.this, no_internet.class);
            startActivity(opensliderintent);
            Toast.makeText(this, "You have no internet Connection :(", Toast.LENGTH_SHORT).show();
            return false;
        }


    }
}
