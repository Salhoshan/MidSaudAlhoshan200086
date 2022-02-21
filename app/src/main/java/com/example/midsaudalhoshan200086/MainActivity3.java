package com.example.midsaudalhoshan200086;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {
    MediaPlayer mpClassical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button bttn1 = findViewById(R.id.Ac3bttnAc3);
        Button bttn2 = findViewById(R.id.ac3bttnMain);
        Button bttn3 = findViewById(R.id.ac3bttnAc2);
        mpClassical = new MediaPlayer();
        mpClassical = MediaPlayer.create(this, R.raw.track1);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity3.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }
        });

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });

        String [] attraction ={"Art Museum","Magnificent Mile","Willie Tower","Water Tower"};
                setListAdapter(new ArrayAdapter<>(this, R.layout.activity_main, R.id.list, attraction));
 }
        protected void onListItemClick(ListView l, View v, int position, long id){
            switch (position){
                case 0:
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://elearning.alfaisal.edu/login/index.php"))); // URI = URL
                    break;
                case 1:
                    mpClassical.start();

                    break;
                case 2:
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj3vLndzu_1AhVdg_0 HHfOMBocQPAgI")));
                    break;
                case 3:
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.com"))); // URI = URL
                    break;
                case 4:
                    break;
            }


        }
}