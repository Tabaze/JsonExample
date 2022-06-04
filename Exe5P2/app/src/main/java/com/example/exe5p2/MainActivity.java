package com.example.exe5p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCal,btnRaz;
    EditText poid,taille;
    RadioGroup grp;
    CheckBox c;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCal=findViewById(R.id.btnCal);
        btnRaz=findViewById(R.id.btnRAZ);
        grp=findViewById(R.id.grp1);
        c=findViewById(R.id.chkAff);
        res=findViewById(R.id.res);
        poid=findViewById(R.id.txtPoid);
        taille=findViewById(R.id.txtTaille);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnRaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poid.getText().clear();
                taille.getText().clear();
                grp.check(R.id.rdmetre);
                c.setChecked(true);
                res.setText("Resulta est :");
                poid.requestFocus();
            }
        });
    }
}