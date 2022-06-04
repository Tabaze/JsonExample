package com.example.exercicessimpleadapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class detailsContact extends AppCompatActivity {

    ImageView image;
    TextView t1, t2, t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_contact);

        image = findViewById(R.id.im);
        t1 = findViewById(R.id.nom);
        t2 = findViewById(R.id.prenom);
        t3 = findViewById(R.id.tel);
        t4 = findViewById(R.id.mail);
        t5 = findViewById(R.id.date);

        Contact c = (Contact) getIntent().getExtras().get("contact");

        image.setImageResource(c.getImage());
        t1.setText("Nom : " + c.getNom());
        t2.setText("Prenom : " + c.getPrenom());
        t3.setText("Tel : " + c.getTel());
        t4.setText("Email : " + c.getEmail());
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        t5.setText("Date de naissance : " + format.format(c.getDateNaissance()));


    }
}