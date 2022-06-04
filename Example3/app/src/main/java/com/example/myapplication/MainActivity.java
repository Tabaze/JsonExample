package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText ht,tva;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
        ht=findViewById(R.id.ht);
        tva=findViewById(R.id.tva);
        res=findViewById(R.id.res);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(ht.getText().toString().isEmpty() || tva.getText().toString().isEmpty()){
            Toast.makeText(this,"Remplir tous les champs",Toast.LENGTH_SHORT).show();
        }
        else{
            double resu;
            if(Double.valueOf(tva.getText().toString())>100){
                res.setText("TVA infirieur a 100");
                return;
            }
            else{
                resu=Double.valueOf(ht.getText().toString())*(1+Double.valueOf(tva.getText().toString())/100);
            }
            ;
            res.setText(String.format("La Prix TTC est : %.2f",resu));
        }
    }
}