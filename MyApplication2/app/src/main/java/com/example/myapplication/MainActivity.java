package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtEmail;
    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmail=findViewById(R.id.txtEmail);
        change=findViewById(R.id.btn);
        change.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(txtEmail.getText().toString().isEmpty()){
            Toast.makeText(this,"Mail vide",Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this,"Votre email  : "+txtEmail.getText(),Toast.LENGTH_SHORT).show();
    }
}