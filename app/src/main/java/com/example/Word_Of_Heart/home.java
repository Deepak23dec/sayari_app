package com.example.Word_Of_Heart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
//project done by Deepak Chaudhary and Ananya Varshney
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //view initialize
       Button love=findViewById(R.id.love);
         Button sad=findViewById(R.id.sad);
         Button back= findViewById(R.id.back);
         Button exit=findViewById(R.id.exit);
         Button motivation=findViewById(R.id.motivation);
        //this is the intent class. Its use for move one activity to another activity.
        love.setOnClickListener(view -> {
            Intent i=new Intent(home.this,MainActivity.class);
            startActivity(i);
        });
        //this is the intent class. Its use for move one activity to another activity.
        sad.setOnClickListener(view -> {
            Intent i=new Intent(home.this,shayari2.class);
            startActivity(i);
        });
        //this is the intent class. Its use for move one activity to another activity.
        motivation.setOnClickListener(view -> {
            Intent i=new Intent(home.this,shayari3.class);
            startActivity(i);
        });
        //this is the intent class. Its use for move one activity to another activity.
        back.setOnClickListener(view -> {
            Intent i=new Intent(home.this,startexit.class);
            startActivity(i);
        });
        //finishAffinity terminates the all screens(exit form app)
        exit.setOnClickListener(view -> finishAffinity());

    }
}