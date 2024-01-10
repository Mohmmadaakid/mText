package com.example.mtext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtMq;

    private static final int SPLASH_DELAY = 2000; // 2 seconds



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMq= findViewById(R.id.splashmarQ);
        txtMq.setSelected(true);

        // Using a Handler to delay the start of the MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
            finish();
        }, SPLASH_DELAY);
    }
    }
