package com.example.exercicessimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contacts = new ArrayList<>();
    GridView gr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gr = findViewById(R.id.grid);

        contacts.add(new Contact(R.drawable.image1,"Thomas","TAN","0689217782","thomas@gmail.com", new Date(88,3,3)));
        contacts.add(new Contact(R.drawable.image2,"Nicolas","Khilal","0689217782","thomas@gmail.com", new Date(102,11,3)));
        contacts.add(new Contact(R.drawable.image3,"Isabelle","TAN","0689217782","thomas@gmail.com", new Date(66,10,3)));
        contacts.add(new Contact(R.drawable.image4,"Marin","TAN","0689217782","thomas@gmail.com", new Date(56,9,3)));
        contacts.add(new Contact(R.drawable.image5,"Bahia","Khalil","0689217782","thomas@gmail.com", new Date(33,3,3)));
        contacts.add(new Contact(R.drawable.image6,"Mohammed","LMAL","0689217782","thomas@gmail.com", new Date(89,3,3)));
        contacts.add(new Contact(R.drawable.image7,"Aziz","Zhiri","0689217782","thomas@gmail.com", new Date(54,3,3)));
        contacts.add(new Contact(R.drawable.image8,"Amin","Beqql","0689217782","thomas@gmail.com", new Date(43,3,3)));

        ArrayList<HashMap<String, Object>> listContacts = new ArrayList<>();

        for(Contact c : contacts){
            HashMap<String, Object> val = new HashMap<>();

            val.put("cimage",c.getImage());
            val.put("cnom",c.getNom());
            val.put("cprenom",c.getPrenom());

            listContacts.add(val);
        }

        String[] from= {"cimage","cnom","cprenom"};
        int[] to = {R.id.contactImage,R.id.contactNom,R.id.contactPrenom};

        SimpleAdapter ad = new SimpleAdapter(this,listContacts,R.layout.contact_item,from,to);
        gr.setAdapter(ad);

        gr.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Intent it = new Intent(MainActivity.this,detailsContact.class);
                it.putExtra("contact", contacts.get(pos));
                startActivity(it);
            }
        });
    }
}