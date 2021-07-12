package com.example.medicalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SignIn extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        listView = findViewById(R.id.listview);
        final ArrayList<String> list = new ArrayList<>();

        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView9, list);

        listView.setAdapter(adapter);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Users");

       reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot dataSnapshot) {

                list.clear();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Person person = snapshot.getValue(Person.class);
                    String generalStateString = String.valueOf(person.getGeneralState());
                    String heartRateString = String.valueOf(person.getHeartRate());
                    String breathing = String.valueOf(person.getBreathing());
                    String longevity = String.valueOf(person.getLongevity());
                    String s = "General State: " + generalStateString + "  Heart Rate : " + heartRateString + "  Breathing: " + breathing + "  Longevity: " + longevity;
                    String txt = person.getFirstName() + " " + person.getLastName() + "   Age: " + String.valueOf(person.getAge()) + "\n" + s;
                    list.add(txt);
                 }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

    }


}