package com.example.mtext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MarqueeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);


        TextView marqueeText = findViewById(R.id.marqueeText);
        marqueeText.setSelected(true);

        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // For devices with Android 6.0 and above
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.black));
        }


        Intent intent = getIntent();
        if (intent != null) {
            String userText = intent.getStringExtra("userText");
            marqueeText.setText(userText);

        }
    }
}