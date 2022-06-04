package com.example.exemplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailItem extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        t = findViewById(R.id.tres);
        int pos = getIntent().getExtras().getInt("pos");
        String i = getIntent().getExtras().getString("item");
        t.setText(pos + " - " + i);
    }
}