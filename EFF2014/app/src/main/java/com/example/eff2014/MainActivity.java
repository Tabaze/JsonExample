package com.example.eff2014;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button cla;
    EditText bag,dis,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cla=findViewById(R.id.cal);
        bag=findViewById(R.id.bag);
        dis=findViewById(R.id.dis);
        res=findViewById(R.id.res);
        cla.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(bag.getText().toString().isEmpty() || dis.getText().toString().isEmpty())
            Toast.makeText(this, "Remplir tous les champs", Toast.LENGTH_SHORT).show();
        else {
            double poid=Double.valueOf(bag.getText().toString());
            double dist=Double.valueOf(dis.getText().toString());
            double total =0;
            if(poid<=15) total = dist<=100 ? poid*5 : poid*8;
            else if(poid<=30) total = dist<=100 ? poid*7.5 : poid*9;
            else total = dist<=100 ? poid*10 : poid*11;
            res.setText(String.format("Le prix total est : %.2f DH",total));
        }
    }
}