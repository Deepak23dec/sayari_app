package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //project done by Deepak Chaudhary and Ananya Varshney
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //view initialize
        Button  home=findViewById(R.id.home);
        Button  exit=findViewById(R.id.exit);
        //this is the intent class. Its use for move one activity to another activity.
        home.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,home.class);
            startActivity(i);
        });
//finishAffinity terminates the all screens(exit form app)
        exit.setOnClickListener(view -> finishAffinity());
    }
}