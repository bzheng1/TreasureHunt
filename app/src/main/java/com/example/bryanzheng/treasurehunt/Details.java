package com.example.bryanzheng.treasurehunt;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class Details extends AppCompatActivity {
    public static final String EXTRA_ID = "Turtle_id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        int turtleID = getIntent().getIntExtra(EXTRA_ID, -10);

        NinjaTurtle ninjaTurtle = NinjaTurtle.NinjaTurtles[turtleID];

        TextView name = (TextView)findViewById(R.id.nameTV);
        name.setText(ninjaTurtle.getName());

        TextView health = (TextView)findViewById(R.id.healthTV);
        health.setText(ninjaTurtle.getHealth());

        TextView stamina = (TextView)findViewById(R.id.staminaTV);
        stamina.setText(ninjaTurtle.getStamina());

        TextView level = (TextView)findViewById(R.id.levelTV);
        level.setText(ninjaTurtle.getLevel());

        ImageView photo = (ImageView)findViewById(R.id.imageView);
        photo.setImageResource(ninjaTurtle.getImageResourceID());
        photo.setContentDescription(ninjaTurtle.getName());

    }


}
