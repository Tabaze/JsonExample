package com.example.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> countries = new ArrayList<>();

    Spinner sp;
    TextView t1, t2;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.sp);
        t1 = findViewById(R.id.pop);
        t2 = findViewById(R.id.cont);
        im = findViewById(R.id.im);

        countries.add(new Country("Brazil",1213212,"Amerique",R.drawable.br));
        countries.add(new Country("Canada",784787887,"Amerique",R.drawable.ca));
        countries.add(new Country("Egypte",898989,"Afrique",R.drawable.eg));
        countries.add(new Country("Iraq",34343,"Asie",R.drawable.iq));
        countries.add(new Country("Maroc",4545454,"Afrique",R.drawable.ma));
        countries.add(new Country("Senagal",23232,"Afrique",R.drawable.sn));

        ArrayList<String> noms = new ArrayList<>();
        for(Country c : countries)
            noms.add(c.getNom());

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,noms);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                for(Country c : countries){
                    if(c.getNom().equals(sp.getSelectedItem().toString())){
                        t1.setText("Population " + c.getPopulation());
                        t2.setText("Continent " + c.getContinent());
                        im.setImageResource(c.getImage());
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}