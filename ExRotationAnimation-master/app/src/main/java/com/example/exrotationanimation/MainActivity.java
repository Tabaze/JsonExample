package com.example.exrotationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img1);
    }

    public void rotate(View view) {
        RotateAnimation anim = new RotateAnimation(0,180,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_PARENT,0.5f);
        anim.setDuration(3000);
        anim.setFillAfter(true);
        image.startAnimation(anim);
    }
}