package com.example.midsaudalhoshan200086;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView count = findViewById(R.id.countDown);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,2000);
        //This is supposed to count down the number but i commented it out since it doesnt work
//        int n = 9;
//        do{
//            count.setText(n+" Seconds left");
//        }while (n >=0);

    }
}