package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//import com.example.medicalapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void proceed(View v){
        Intent i =new Intent(this, Proceed.class);
        startActivity(i);
    }
    public void login(View v){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}