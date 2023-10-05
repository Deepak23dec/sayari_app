package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.majnuleleshayari.R;

public class shayari2 extends AppCompatActivity {

    //project done by Deepak Chaudhary and Ananya Varshney
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