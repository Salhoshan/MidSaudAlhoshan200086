package com.example.midsaudalhoshan200086;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bttn1 = findViewById(R.id.bttnAc2);
        Button bttn2 = findViewById(R.id.bttnMain);
        Button bttn3 = findViewById(R.id.bttnAc3);
        Spinner spin = findViewById(R.id.spinner);
        TextView text = findViewById(R.id.spinnerOutput);
        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(spin.getSelectedItem().toString());
            }
        });

        //DIDNT HAVE ENOUGH TIME TO CREATE THE tabel and add pictures AND PUT VALUES AND SET ON CLICK

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity2.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
    }
}