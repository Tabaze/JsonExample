package com.example.exe1p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    RadioGroup grp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btnc1);
        b2=findViewById(R.id.btnc2);
        b3=findViewById(R.id.btnc3);
        b4=findViewById(R.id.des);
        b5=findViewById(R.id.affiche);
        grp=findViewById(R.id.grp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grp.check(R.id.c1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grp.check(R.id.c2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grp.check(R.id.c3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grp.clearCheck();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (grp.getCheckedRadioButtonId()){
                    case R.id.c1:
                        Toast.makeText(MainActivity.this, "Choix 1 est coche", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.c2:
                        Toast.makeText(MainActivity.this, "Choix 2 est coche", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.c3:
                        Toast.makeText(MainActivity.this, "Choix 3 est coche", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Rien selectionner", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}