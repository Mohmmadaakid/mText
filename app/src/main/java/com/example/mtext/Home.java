package com.example.mtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showMarquee(View view) {
        EditText editText = findViewById(R.id.editText);

        String userText = editText.getText().toString();



        if (userText.isEmpty())
        {
            Toast.makeText(this, "Please Enter The Text!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(this, MarqueeActivity.class);
            intent.putExtra("userText", userText);
            startActivity(intent);

        }
    }
}