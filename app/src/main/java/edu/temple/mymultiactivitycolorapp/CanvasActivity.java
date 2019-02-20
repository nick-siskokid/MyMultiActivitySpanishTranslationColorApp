package edu.temple.mymultiactivitycolorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    TextView testTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();

        String backgroundColor = intent.getStringExtra("Key");

        testTextView = findViewById(R.id.testTextView);
        testTextView.setText(backgroundColor);
    }
}
