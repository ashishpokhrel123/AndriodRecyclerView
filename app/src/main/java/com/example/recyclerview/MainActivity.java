package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import  java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        //create a list of contacts
        List<contact> contactsList = new ArrayList<>();
        contactsList.add(new contact("Saugat Malla","9851214572",R.drawable.saught));
        contactsList.add(new contact("Rajesh Hamal","9851421541",R.drawable.noavtar));
        contactsList.add(new contact("Dayahang Rai","9801245121",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));
        contactsList.add(new contact("Bhuwan Kc","9841526458",R.drawable.noavtar));


        //pass list to the adapter class
        RecyclerAdapater contactsAdapter = new RecyclerAdapater(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
