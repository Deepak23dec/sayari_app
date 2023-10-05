package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class startexit extends AppCompatActivity {

    //project done by Deepak Chaudhary and Ananya Varshney
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startexit);
        Button start=findViewById(R.id.start);
       Button exita=findViewById(R.id.exita);
        start.setOnClickListener(view -> {
            Intent i=new Intent(startexit.this,home.class);
            startActivity(i);
        });
        exita.setOnClickListener(view -> finishAffinity());
    }
}