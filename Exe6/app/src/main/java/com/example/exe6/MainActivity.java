package com.example.exe6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public void test(){
        if(n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()){
            Toast.makeText(this, "Remplir tous les champs", Toast.LENGTH_SHORT).show();
            return;
        }
    }
    Button pl,so,pr,di;
    EditText n1,n2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pl=findViewById(R.id.plus);
        so=findViewById(R.id.sous);
        pr=findViewById(R.id.pro);
        di=findViewById(R.id.div);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        res=findViewById(R.id.res);
        pl.setOnClickListener(this);
        so.setOnClickListener(this);
        pr.setOnClickListener(this);
        di.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        test();
        double nn1=Double.valueOf(n1.getText().toString());
        double nn2=Double.valueOf(n2.getText().toString());
        double resu=0;
        switch (view.getId()){
            case R.id.plus:resu=nn1+nn2;
                break;
            case R.id.sous:resu=nn1-nn2;
                break;
            case R.id.pro:resu=nn1*nn2;
                break;
            case R.id.div:resu=nn1/nn2;
                break;
        }
        res.setText(String.format("%.2f",resu));
    }
}