package com.example.exemplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ls = findViewById(R.id.lst);


        ArrayList<String> jours = new ArrayList<>();
        jours.add("Lundi");
        jours.add("Mardi");
        jours.add("Mercredi");
        jours.add("Jeudi");
        jours.add("Vendredi");
        jours.add("Samedi");
        jours.add("Dimanche");

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,jours);

        ls.setAdapter(ad);


        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(MainActivity.this,DetailItem.class);
                in.putExtra("item",ls.getItemAtPosition(i).toString());
                in.putExtra("pos",i);
                startActivity(in);
            }
        });
    }
}