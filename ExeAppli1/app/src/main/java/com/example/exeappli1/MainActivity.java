package com.example.exeappli1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    RadioGroup grpColor, grpTaille;
    TextView resulta;
    CheckBox chkGras,chkItalic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grpColor=findViewById(R.id.GrpColor);
        grpTaille=findViewById(R.id.grpTaille);
        resulta=findViewById(R.id.result);
        chkGras=findViewById(R.id.chkGras);
        chkItalic=findViewById(R.id.chkItalic);
        grpColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (grpColor.getCheckedRadioButtonId()){
                    case R.id.rdBlack:resulta.setTextColor(Color.BLACK);
                        break;
                    case R.id.rdJaune:resulta.setTextColor(Color.YELLOW);
                        break;
                    case R.id.rdBlue:resulta.setTextColor(Color.BLUE);
                        break;
                    case R.id.rdRed:resulta.setTextColor(Color.RED);
                        break;
                }
            }
        });
        grpTaille.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (grpTaille.getCheckedRadioButtonId()){
                    case R.id.rd30:resulta.setTextSize(30);
                        break;
                    case R.id.rd40:resulta.setTextSize(40);
                        break;
                    case R.id.rd50:resulta.setTextSize(50);
                        break;
                    case R.id.rd60:resulta.setTextSize(60);
                        break;
                }
            }
        });
        chkItalic.setOnCheckedChangeListener(this);
        chkGras.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(chkGras.isChecked() && chkItalic.isChecked())
            resulta.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        else if(chkItalic.isChecked())
            resulta.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        else if(chkGras.isChecked())
            resulta.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        else resulta.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
    }
}