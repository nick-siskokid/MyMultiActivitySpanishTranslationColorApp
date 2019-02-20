package edu.temple.mymultiactivitycolorapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    //Test TextView to show that correct data string passed to Canvas Activity
    //TextView testTextView;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        //Retrieve intent passed from Main Activity
        Intent intent = getIntent();
        constraintLayout = findViewById(R.id.canvasConstraintLayout);
        String backgroundColor = intent.getStringExtra("Key");

        //testTextView = findViewById(R.id.testTextView);
        //testTextView.setText(backgroundColor);

        constraintLayout.setBackgroundColor(Color.parseColor(backgroundColor));

    }
}
