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


        /*declaration for array of color names. Takes string array resource from strings.xml file
        with respect to the language set on the emulator */
        Resources res = getResources();
        String[] colors = res.getStringArray(R.array.colors_array);
        spinner = findViewById(R.id.spinner);
        //declaration for colors array (their integer values).
        //each index of colors and color_ints correspond to a color and its integer value
        final int[] color_ints = res.getIntArray(R.array.color_ints);        ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("white"));
                //intent declaration
                Intent intent = new Intent(MainActivity.this, CanvasActivity.class);


                /*grab the color and its corresponding integer when user selects particular text view*/
                String backgroundColor = parent.getItemAtPosition(position).toString();
                int color = color_ints[position];
                /*
                create bundle object to pass data of multiple types
                to child activity
                */

                Bundle bundle = new Bundle();
                bundle.putString("StringKey", backgroundColor);
                bundle.putInt("IntKey", color);
                /*attach bundle to the intent*/
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}