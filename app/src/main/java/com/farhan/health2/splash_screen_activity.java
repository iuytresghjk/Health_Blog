package com.farhan.health2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("Health Blogs");


        new Handler(getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(this,MainActivity.class));
            finish();
        },4000);
    }
    }
