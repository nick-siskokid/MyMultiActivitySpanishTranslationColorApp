package edu.temple.mymultiactivitycolorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("cyan");
        colors.add("green");
        colors.add("yellow");
        colors.add("magenta");
        colors.add("maroon");
        colors.add("aqua");
        colors.add("lime");
        colors.add("purple");
        */

        //obtains string array resource by id
        //appropriate sptring array resource will be picked according to emulator configuration
        Resources res = getResources();
        String[] colors = res.getStringArray(R.array.colors_array);
        spinner = findViewById(R.id.spinner);

        ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("white"));
                Intent intent = new Intent(MainActivity.this, CanvasActivity.class);
                //String backgroundColor = "green";
                String backgroundColor = parent.getItemAtPosition(position).toString();
                intent.putExtra("Key", backgroundColor);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}