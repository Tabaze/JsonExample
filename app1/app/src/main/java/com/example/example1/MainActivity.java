package com.example.example1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText txt1;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        txt1=(EditText) findViewById(R.id.txt1);
    }
    @Override
    public void onClick(View v){
        Toast.makeText(this, txt1.getText(), Toast.LENGTH_SHORT).show();
    }
}