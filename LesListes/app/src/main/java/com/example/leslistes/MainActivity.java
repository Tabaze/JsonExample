package com.example.leslistes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner from,to;
    EditText ed;
    Button btn;
    TextView res;
    int fr,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed =  findViewById(R.id.val);
        btn = findViewById(R.id.btn);
        res = findViewById(R.id.res);
        from = findViewById(R.id.from);
        to =  findViewById(R.id.to);
        String[] days = {"kilomètre (km)","hectomètre (hm)","décamètre (dam)","mètre (m)","décimètre (dm)","centimètre (cm)","millimètre (mm)"};
        ArrayAdapter ad = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,days);
        from.setAdapter(ad);
        to.setAdapter(ad);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!ed.getText().toString().isEmpty()){
                    int con=to.getSelectedItemPosition()-from.getSelectedItemPosition();
                    double rss=Double.valueOf(ed.getText().toString())*Math.pow(10,con);
                    String wahda="";
                    switch (to.getSelectedItemPosition()){
                        case 0:wahda="km";
                            break;
                        case 1:wahda="hm";
                            break;
                        case 2:wahda="dam";
                            break;
                        case 3:wahda="m";
                            break;
                        case 4:wahda="dm";
                            break;
                        case 5:wahda="cm";
                            break;
                        case 6:wahda="mm";
                            break;
                    }
                    res.setText(String.format("Resulta est : %.2f %s",rss,wahda));
                }
                else{
                    Toast.makeText(MainActivity.this, "Remplir la valeur", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}