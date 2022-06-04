package com.example.exe2p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ip,an,wi;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        an=findViewById(R.id.An);
        ip=findViewById(R.id.Ip);
        wi=findViewById(R.id.Wi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res=new String();
                res="Iphone : "+ip.isChecked();
                res+="\nAndroid : "+an.isChecked();
                res+="\nWindows : "+wi.isChecked();
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}