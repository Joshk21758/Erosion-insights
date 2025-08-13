package com.example.geosat;

import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private ImageView satellite_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        }, 3000);

        ImageView satellite_view = findViewById(R.id.satellite_view);
        satellite_view.setRotation(0);
        satellite_view.animate().rotation(360).setDuration(3000).setInterpolator(new LinearInterpolator()).start();


    };
}