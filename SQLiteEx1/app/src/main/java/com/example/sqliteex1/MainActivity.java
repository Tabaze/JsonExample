package com.example.sqliteex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyDB db;
    EditText e1, e2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new MyDB(this);
        Contact c1 = new Contact(1,"ZZZZ","YYYYY");
        Contact c2 = new Contact(1,"AAAA","BBBB");

        e1 = findViewById(R.id.enom);
        e2 = findViewById(R.id.eprenom);
        b = findViewById(R.id.bsave);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contact c = new Contact();

                c.setNom(e1.getText().toString());
                c.setPrenom(e2.getText().toString());

                if(MyDB.Insert_Contact(db.getWritableDatabase(),c)==-1)
                    Toast.makeText(MainActivity.this, "Insertion Echoue", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Insertion OK", Toast.LENGTH_SHORT).show();

            }
        });

    }
}