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
        //Retrieve bundle attached to intent
        Bundle bundle = intent.getExtras();
        //get color and its integer from the bundle
        int color = bundle.getInt("IntKey");
        //String backgroundColor = bundle.getString("StringKey");


        constraintLayout = findViewById(R.id.canvasConstraintLayout);

        //testTextView = findViewById(R.id.testTextView);
        //testTextView.setText(backgroundColor);

        //set background color of layout
        constraintLayout.setBackgroundColor(color);
        //constraintLayout.setBackgroundColor(Color.parseColor(backgroundColor));

    }
}
