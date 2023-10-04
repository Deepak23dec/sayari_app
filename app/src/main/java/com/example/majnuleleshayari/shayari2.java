package com.example.majnuleleshayari;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class shayari2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayari2);
        Button home=findViewById(R.id.home);
        Button exit=findViewById(R.id.exit);
        home.setOnClickListener(view -> {
            Intent i=new Intent(shayari2.this,home.class);
            startActivity(i);
        });

        exit.setOnClickListener(view -> finishAffinity());
    }
}