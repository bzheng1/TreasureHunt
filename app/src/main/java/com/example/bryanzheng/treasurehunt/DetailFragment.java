package com.example.bryanzheng.treasurehunt;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailFragment extends Fragment {
    private long turtleId;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView name = (TextView) view.findViewById(R.id.nameTV);
            NinjaTurtle turtle = NinjaTurtle.NinjaTurtles[(int) turtleId];
            name.setText(turtle.getName());
            TextView health = (TextView) view.findViewById(R.id.healthTV);
            health.setText("Health:" +String.valueOf(turtle.getHealth()));
            TextView level = (TextView) view.findViewById(R.id.levelTV);
            level.setText("Level:" +String.valueOf(turtle.getLevel()));
            TextView stamina = (TextView) view.findViewById(R.id.staminaTV);
            stamina.setText("Stamina:" + String.valueOf(turtle.getStamina()));

            ImageView photo  = (ImageView)view.findViewById(R.id.imageView);
            photo.setImageResource(turtle.getImageResourceID());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.details, container, false);
    }

    public void setTurtle(long id){
        this.turtleId = id;
    }

}
