package com.ayan.workspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView ContactListView;
    ArrayList<ListVIewModel> dataModels;
    private ListView listView;
    ListAdapter adapter;
    ArrayList<String> dataItems = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ContactListView=findViewById(R.id.listView);


        dataModels=new ArrayList<>();

        dataModels.add(new ListVIewModel("Contact1","9862471065"));
        dataModels.add(new ListVIewModel("Contact2","7062471065"));
        dataModels.add(new ListVIewModel("Contact3","9622471065"));
        dataModels.add(new ListVIewModel("Contact4","4562471065"));
        System.out.println("Details= "+dataModels.toArray());

        ListAdapter listViewAdapter=new ListAdapter(dataModels,getApplicationContext());
       ContactListView.setAdapter(listViewAdapter);


    }

}