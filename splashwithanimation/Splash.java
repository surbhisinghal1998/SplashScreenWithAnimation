package com.solution.splashwithanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;


public class Splash extends AppCompatActivity {
TextView txt2;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img=findViewById(R.id.spashImage1);
        txt2=findViewById(R.id.spashText2);


        Animation anim= AnimationUtils.loadAnimation(this,R.anim.animation);
        img.startAnimation(anim);



        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}