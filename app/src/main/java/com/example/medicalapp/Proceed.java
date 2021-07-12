package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Proceed extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);
    }
    static String firstName;
    static String lastName;
    static String age;

    public void next (View v){
        TextView t = ((TextView)findViewById(R.id.FirstName));//first name stuff
        firstName = t.getText().toString();

        if(firstName == null){
            firstName = "unknown";
        }

        t = (TextView)findViewById(R.id.LastName);//last name stuff;
        lastName = t.getText().toString();

        if(lastName == null){
            lastName = "unknown";
        }

        t = (TextView)findViewById(R.id.age);//age stuff
        age = (t.getText().toString());
        if(age == null){
            age = "-1";
        }

        Intent i = new Intent(this, EnterStates.class);
        startActivity(i);

    }

    public static String returnFirstName(){
        return firstName;
    }
    public static String returnLastName(){
        return lastName;
    }
    public static String returnAge(){
        return age;
    }



}