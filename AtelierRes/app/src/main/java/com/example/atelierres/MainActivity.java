package com.example.atelierres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b1, b2;
    RadioGroup g;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.eMontant);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        g = findViewById(R.id.grp);
        t = findViewById(R.id.tres);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double montant = Double.parseDouble(e.getText().toString());
                double res = 0;
                int taux = 0;
                switch (g.getCheckedRadioButtonId()){
                    case R.id.iddollar:
                        taux=getResources().getInteger(R.integer.dollar_taux);
                        res = montant * taux;
                        t.setText(String.format(getString(R.string.chaine_res_dollar),res));
                        break;
                    case R.id.idEuro:
                        taux=getResources().getInteger(R.integer.euro_taux);
                        res = montant * taux;
                        t.setText(String.format(getString(R.string.chaine_res_euro),res));
                        break;
                }




            }
        });


    }
}