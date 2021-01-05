package com.example.umerfyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BMLdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_ldetails);
    }

    public void move(View view) {
        Intent i=new Intent(getBaseContext(),dietlist.class);
        startActivity(i);


    }
}