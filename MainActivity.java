package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the placeName category
        TextView placeName = (TextView) findViewById(R.id.placeName);

        // Set a click listener on that View
        placeName.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NationalParkActivity}
                Intent NationalParkIntent = new Intent(MainActivity.this, NationalPark.class);

                // Start the new activity
                startActivity(NationalParkIntent);
            }
        });

        //find the View that shows the lakes category
        TextView lakes = findViewById(R.id.lakes);

        // Set a click Listener on that View
        lakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link LakesActivity}
                Intent LakesIntent = new Intent(MainActivity.this,Lakes.class);

                //Start the new Activity
                startActivity(LakesIntent);
            }
        });

        TextView mountains = findViewById(R.id.mountains);

        mountains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the mountains Activity
                Intent mountainsIntent = new Intent(MainActivity.this,Mountains.class);

                //Start new Activity
                startActivity(mountainsIntent);

            }
        });

    }
}
