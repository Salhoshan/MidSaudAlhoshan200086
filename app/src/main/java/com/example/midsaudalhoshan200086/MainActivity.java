package com.example.midsaudalhoshan200086;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpClassical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = findViewById(R.id.animal);
        mpClassical = new MediaPlayer();
        mpClassical = MediaPlayer.create(this, R.raw.track1);
        Button bttn1 = findViewById(R.id.bttn1Main);
        Button bttn2 = findViewById(R.id.bttn2Ac2);
        Button bttn3 = findViewById(R.id.bttn3Ac3);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpClassical.start();
            }
        });
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
    }
}