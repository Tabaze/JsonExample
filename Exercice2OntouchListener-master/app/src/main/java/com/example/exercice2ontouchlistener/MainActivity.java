package com.example.exercice2ontouchlistener;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Stagiaire> stgs;

    Button b1, b2, b3, b4;
    EditText e1, e2;
    RadioGroup grp;
    ImageView image;

    int position = 0;
    float xInitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.idfirst);
        b2 = findViewById(R.id.idprec);
        b3 = findViewById(R.id.idnext);
        b4 = findViewById(R.id.idlast);
        e1 = findViewById(R.id.idnom);
        e2 = findViewById(R.id.idprenom);
        grp = findViewById(R.id.grp);
        image = findViewById(R.id.im);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        stgs = new ArrayList<>();
        stgs.add(new Stagiaire("Nom 1", "Prenom 1", "H", R.drawable.image1));
        stgs.add(new Stagiaire("Nom 2", "Prenom 2", "F", R.drawable.image2));
        stgs.add(new Stagiaire("Nom 3", "Prenom 3", "H", R.drawable.image3));
        stgs.add(new Stagiaire("Nom 4", "Prenom 4", "F", R.drawable.image4));
        stgs.add(new Stagiaire("Nom 5", "Prenom 5", "F", R.drawable.image4));
        stgs.add(new Stagiaire("Nom 6", "Prenom 6", "H", R.drawable.image6));
        stgs.add(new Stagiaire("Nom 7", "Prenom 7", "H", R.drawable.image7));
        stgs.add(new Stagiaire("Nom 8", "Prenom 8", "F", R.drawable.image8));

        position = 0;
        afficheDonneesStagiaire();

        image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        xInitial = motionEvent.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        float xFinal = motionEvent.getY();

                        if(xInitial<xFinal)
                            position--;
                        else if(xInitial>xFinal)
                            position ++;
                        afficheDonneesStagiaire();
                        break;
                }
                return true;
            }
        });
    }


    public void afficheDonneesStagiaire() {

        if (position < 0)
            position = stgs.size() - 1;
        else if (position >= stgs.size())
            position = 0;

        e1.setText(stgs.get(position).getNom());
        e2.setText(stgs.get(position).getPrenom());
        if (stgs.get(position).getSexe().equals("H"))
            grp.check(R.id.rdh);
        else
            grp.check(R.id.rdf);
        image.setImageResource(stgs.get(position).getImage());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.idfirst:
                position = 0;
                break;
            case R.id.idprec:
                position--;
                break;
            case R.id.idnext:
                position++;
                break;
            case R.id.idlast:
                position = stgs.size() - 1;
                break;
        }

        afficheDonneesStagiaire();
    }
}