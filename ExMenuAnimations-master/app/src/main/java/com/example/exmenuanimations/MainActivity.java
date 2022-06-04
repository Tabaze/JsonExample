package com.example.exmenuanimations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = findViewById(R.id.image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1: Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show(); break;
            case R.id.m2: Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show(); break;
            case R.id.m3: Toast.makeText(this, "Menu 3", Toast.LENGTH_SHORT).show(); break;
            case R.id.m4: Toast.makeText(this, "Menu 4", Toast.LENGTH_SHORT).show(); break;
        }
        return true;
    }

    public void animer(View view) {

        switch (view.getId()){
            case R.id.b1:
                AlphaAnimation alph1 = new AlphaAnimation(1f,0f);
                alph1.setDuration(4000);
                im.startAnimation(alph1);
                break;
            case R.id.b2:
                AlphaAnimation alph2 = new AlphaAnimation(0f,1f);
                alph2.setDuration(4000);
                im.startAnimation(alph2);
                break;
            case R.id.b3:
                ScaleAnimation scale1 = new ScaleAnimation(0.5f,1f,0.5f,1f);
                scale1.setDuration(4000);
                im.startAnimation(scale1);
                break;
            case R.id.b4:
                ScaleAnimation scale2 = new ScaleAnimation(1f,0.5f,1f,0.5f);
                scale2.setDuration(4000);
                im.startAnimation(scale2);
                break;
            case R.id.b5:
                TranslateAnimation anim = new TranslateAnimation(10f, 300f,10f, 300f);
                anim.setDuration(4000);
                im.startAnimation(anim);
                break;
        }
    }
}