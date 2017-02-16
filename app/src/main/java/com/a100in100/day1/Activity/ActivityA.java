package com.a100in100.day1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.a100in100.day1.R;

import org.w3c.dom.Text;

import java.util.Random;

public class ActivityA extends AppCompatActivity {

    public final static String RANDOM_SA = "com.a100in100.day1.RANNUMSTRINGA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitya);

        //get text from intent and apply to textview
        Intent intent = getIntent();
        String sNumber = intent.getStringExtra(ActivityB.RANDOM_SB);
        TextView textView = (TextView) findViewById(R.id.textViewA);
        textView.setText(sNumber);



    }

    //called when button clicked
    public void goToB(View view){
        Random r = new Random();
        int n = r.nextInt(100)+1;
        String s = String.valueOf(n);

        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra(RANDOM_SA, s);
        startActivity(intent);

        finish();

    }


}
