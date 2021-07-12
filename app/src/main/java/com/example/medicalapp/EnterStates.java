package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EnterStates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_states);
    }
     FirebaseDatabase rootNode;
    DatabaseReference reference;
    public void submit(View v){
        SeekBar generalStateBar = (SeekBar)findViewById(R.id.generalState);
        SeekBar breathingBar = (SeekBar)findViewById(R.id.breathing);
        SeekBar heartRateBar = (SeekBar)findViewById(R.id.heartRate);
        SeekBar longevity = (SeekBar)findViewById(R.id.longevity);

        int a = generalStateBar.getProgress();
        int b = breathingBar.getProgress();
        int c = heartRateBar.getProgress();
        int d = longevity.getProgress();

        String firstName = "", lastName = "", age = "";

        firstName = Proceed.returnFirstName();
        lastName = Proceed.returnLastName();
        age = Proceed.returnAge();

        Person p = new Person(firstName, lastName, age,a,b,c,d);//creating a person p
        Algorithm.addPerson(p);

        rootNode = FirebaseDatabase.getInstance();

        reference = rootNode.getReference("Users");
        reference.child(firstName + " " + lastName).setValue(p);
        Intent i = new Intent(this, Submitted.class);
        startActivity(i);
    }
}