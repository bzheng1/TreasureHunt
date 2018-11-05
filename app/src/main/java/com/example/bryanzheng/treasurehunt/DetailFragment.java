package com.example.bryanzheng.treasurehunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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
            //name.setText(turtle.getName());
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
//        //Get reference to RecyclerView, using layout we just defined.
//        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.tab2fragment, container, false);
//
//        //Get array of of Strings for captions
//        String[] names = new String[Pizza.PIZZAS.length];
//        for(int i = 0; i < names.length; i++){
//            names[i] = Pizza.PIZZAS[i].getName();
//        }
//        //Get array of ints for Ids
//        int[] images = new int[Pizza.PIZZAS.length];
//        for(int i = 0; i < images.length; i++){
//            images[i] = Pizza.PIZZAS[i].getImageResourceID();
//        }
//
//        int[] ninjaLevel = new int[Pizza.PIZZAS.length];
//        for(int i = 0; i < ninjaLevel.length; i++){
//            ninjaLevel[i] = Pizza.PIZZAS[i].getLevel();
//        }
//        int[] ninjaHealth = new int[Pizza.PIZZAS.length];
//        for(int i = 0; i < ninjaHealth.length; i++){
//            ninjaHealth[i] = Pizza.PIZZAS[i].getHealth();
//        }
//        int[] ninjaStamina = new int[Pizza.PIZZAS.length];
//        for(int i = 0; i < ninjaStamina.length; i++){
//            ninjaStamina[i] = Pizza.PIZZAS[i].getStamina();
//        }
//
//        //Create instance of our custom RecyclerViewAdapter, passing in the captions and image ids
//        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, images, ninjaLevel, ninjaHealth, ninjaStamina);
//        pizzaRecycler.setAdapter(adapter); //attach our adapter to our RecyclerView.
//
//        //Create a layout manager and attach it to our RecyclerView
//        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
//        pizzaRecycler.setLayoutManager(layoutManager);
//
//        return pizzaRecycler;
        return inflater.inflate(R.layout.details, container, false);
    }

    public void setTurtle(long id){
        this.turtleId = id;
    }

}
