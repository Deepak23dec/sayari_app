package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class ss extends AppCompatActivity {
////project done by Deepak Chaudhary and Ananya Varshney
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
//this is the handler class to hold the splash screen for specific time (given by coder)
        new Handler().postDelayed(() -> {
            Intent i=new Intent(ss.this,startexit.class);
            startActivity(i);
        },6000);
    }
}