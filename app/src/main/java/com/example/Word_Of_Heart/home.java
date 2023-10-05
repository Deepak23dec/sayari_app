package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.majnuleleshayari.R;

public class home extends AppCompatActivity {
//project done by Deepak Chaudhary and Ananya Varshney
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       Button love=findViewById(R.id.love);
         Button sad=findViewById(R.id.sad);
         Button motivation=findViewById(R.id.motivation);
        love.setOnClickListener(view -> {
            Intent i=new Intent(home.this,MainActivity.class);
            startActivity(i);
        });
        sad.setOnClickListener(view -> {
            Intent i=new Intent(home.this,shayari2.class);
            startActivity(i);
        });
        motivation.setOnClickListener(view -> {
            Intent i=new Intent(home.this,shayari3.class);
            startActivity(i);
        });
    }
}