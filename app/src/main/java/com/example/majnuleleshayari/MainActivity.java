package com.example.majnuleleshayari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  home=findViewById(R.id.home);
        Button  exit=findViewById(R.id.exit);
        home.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,home.class);
            startActivity(i);
        });

        exit.setOnClickListener(view -> finishAffinity());
    }
}