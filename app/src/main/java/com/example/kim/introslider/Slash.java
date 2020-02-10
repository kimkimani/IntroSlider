package com.example.kim.introslider;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.kim.introslider.MainActivity;
import com.example.kim.introslider.R;

import java.lang.annotation.Annotation;

public class Slash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);
    ImageView image =(ImageView) findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashfade);
        image.startAnimation(animation);

        Thread timer= new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent= new Intent(getApplicationContext(),IntroSlider.class);
                startActivity(intent);
                super.run();
            }
        };

        timer.start();
    }

}
