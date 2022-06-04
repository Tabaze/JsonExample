package com.example.spinnercountry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView t1;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.sp);
        t1=findViewById(R.id.t1);
        img=findViewById(R.id.img);
        ArrayList<Country> countries=new ArrayList<>();
        countries.add(new Country("Brazil",1233221,"Americ",R.drawable.br));
        countries.add(new Country("Argentine",1233221,"Americ",R.drawable.ar));
        countries.add(new Country("Norway",1233221,"Europe",R.drawable.bv));
        countries.add(new Country("England",1233221,"Europe",R.drawable.eng));
        countries.add(new Country("Egypt",1233221,"Afrique",R.drawable.eg));
        countries.add(new Country("Maroc",1233221,"Afrique",R.drawable.ma));
        ArrayList<String> con=new ArrayList<>();
        for(Country c:countries){
            con.add(c.getNom());
        }
        ArrayAdapter ad = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,con);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                for(Country c:countries){
                    if(c.getNom().equals(sp.getSelectedItem().toString())){
                        String info="Nom : "+c.getNom();
                        info+="\nContinent : "+c.getContinent();
                        info+="\nPopulation : "+c.getPopulation();
                        t1.setText(info);
                        img.setImageResource(c.getImage());
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "Selectionner un payer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}