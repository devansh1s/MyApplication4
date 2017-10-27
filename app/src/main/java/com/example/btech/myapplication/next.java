package com.example.btech.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class next extends AppCompatActivity {
    String xyz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        xyz = intent.getStringExtra("xyz");
        textView2.setText(xyz);


    }
}
