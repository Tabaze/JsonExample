package com.example.exe3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup grp;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grp=findViewById(R.id.grp);
        img=findViewById(R.id.img);
        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (grp.getCheckedRadioButtonId()){
                    case R.id.img1:img.setImageResource(R.drawable.facebook_96px);
                        break;
                    case R.id.img2:img.setImageResource(R.drawable.google_plus_96px);
                        break;
                    case R.id.img3:img.setImageResource(R.drawable.twitter_circled_96px);
                        break;
                    case R.id.img4:img.setImageResource(R.drawable.the_dragon_team_96px);
                        break;
                }
            }
        });
    }
}