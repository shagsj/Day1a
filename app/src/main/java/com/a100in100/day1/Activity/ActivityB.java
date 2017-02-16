package com.a100in100.day1.Activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.a100in100.day1.R;

import java.util.Random;

public class ActivityB extends AppCompatActivity {

    public final static String RANDOM_SB = "com.a100in100.day1.RANNUMSTRINGB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
        String sNumber = intent.getStringExtra(ActivityA.RANDOM_SA);
        TextView textView = (TextView) findViewById(R.id.textViewB);
        textView.setText(sNumber);
    }

    //called when button clicked
    public void goToA(View view){
        Random r = new Random();
        int n = r.nextInt(100)+1;
        String s = String.valueOf(n);

        Intent intent = new Intent(this, ActivityA.class);
        intent.putExtra(RANDOM_SB, s);
        startActivity(intent);

        finish();

    }
}
