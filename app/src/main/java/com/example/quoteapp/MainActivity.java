package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnShare;
    TextView quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShare = findViewById(R.id.btnShare);
        quotes = findViewById(R.id.tvquotes);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharetxt = quotes.getText().toString();
                Intent sendintent =new Intent();
                sendintent.setAction(Intent.ACTION_SEND);
                sendintent.setType("text/plain");
                sendintent.putExtra(Intent.EXTRA_TEXT, sharetxt);
                startActivity(sendintent);

            }
        });
    }
}