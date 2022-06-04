package com.example.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailCountry extends AppCompatActivity {

    TextView t1, t2, t3;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);

        t1 = findViewById(R.id.pop);
        t2 = findViewById(R.id.cont);
        t3 = findViewById(R.id.capitale);
        im = findViewById(R.id.im);

        Country c = (Country) getIntent().getExtras().get("country");

        t1.setText("Population : " + c.getPopulation());
        t2.setText("Continent :" + c.getContinent());
        t3.setText("Capitale  : " + c.getCapital());
        im.setImageResource(c.getImage());

    }
}