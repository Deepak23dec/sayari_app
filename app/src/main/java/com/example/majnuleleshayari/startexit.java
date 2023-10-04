package com.example.majnuleleshayari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startexit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startexit);
        Button start=findViewById(R.id.start);
       Button exita=findViewById(R.id.exita);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(startexit.this,home.class);
                startActivity(i);
            }
        });
        exita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finishAffinity();
            }
        });
    }
}