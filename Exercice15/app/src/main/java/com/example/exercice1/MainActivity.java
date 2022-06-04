package com.example.exercice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> countries = new ArrayList<>();

    GridView sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.ls);

        countries.add(new Country("Brazil", "Rio", 1213212, "Amerique", R.drawable.br));
        countries.add(new Country("Canada", "Quebec", 784787887, "Amerique", R.drawable.ca));
        countries.add(new Country("Egypte", "Cairo", 898989, "Afrique", R.drawable.eg));
        countries.add(new Country("Iraq", "Baghdad", 34343, "Asie", R.drawable.iq));
        countries.add(new Country("Maroc", "Rabat", 4545454, "Afrique", R.drawable.ma));
        countries.add(new Country("Senegal", "Dakar", 23232, "Afrique", R.drawable.sn));

        ArrayList<HashMap<String, Object>> noms = new ArrayList<>();

        for (Country c : countries) {
            HashMap<String, Object> v = new HashMap<>();
            v.put("image", c.getImage());
            v.put("name", c.getNom());
            noms.add(v);
        }
        String[] from = {"image", "name"};
        int[] to = {R.id.imCountry, R.id.nameCountry};

        SimpleAdapter ad = new SimpleAdapter(this, noms, R.layout.country_item, from, to);
        sp.setAdapter(ad);

        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(MainActivity.this, DetailCountry.class);
                it.putExtra("country", countries.get(i));
                startActivity(it);
            }
        });

    }
}