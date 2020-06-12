package com.ayan.workspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CallingActivity extends AppCompatActivity {
TextView textViewCallingName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);
        textViewCallingName=findViewById(R.id.textviewName);
        Intent intent=getIntent();

        textViewCallingName.setText(intent.getStringExtra("ITEMNAME"));


    }
}