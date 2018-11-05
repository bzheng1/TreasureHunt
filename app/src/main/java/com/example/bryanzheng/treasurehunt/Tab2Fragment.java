package com.example.bryanzheng.treasurehunt;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by User on 2/28/2017.
 */

public class Tab2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Get reference to RecyclerView, using layout we just defined.
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.tab2fragment, container, false);

        //Get array of of Strings for captions
        String[] names = new String[NinjaTurtle.NinjaTurtles.length];
        for(int i = 0; i < names.length; i++){
            names[i] = NinjaTurtle.NinjaTurtles[i].getName();
        }
        //Get array of ints for Ids
        int[] images = new int[NinjaTurtle.NinjaTurtles.length];
        for(int i = 0; i < images.length; i++){
            images[i] = NinjaTurtle.NinjaTurtles[i].getImageResourceID();
        }

        int[] ninjaLevel = new int[NinjaTurtle.NinjaTurtles.length];
        for(int i = 0; i < ninjaLevel.length; i++){
            ninjaLevel[i] = NinjaTurtle.NinjaTurtles[i].getLevel();
        }
        int[] ninjaHealth = new int[NinjaTurtle.NinjaTurtles.length];
        for(int i = 0; i < ninjaHealth.length; i++){
            ninjaHealth[i] = NinjaTurtle.NinjaTurtles[i].getHealth();
        }
        int[] ninjaStamina = new int[NinjaTurtle.NinjaTurtles.length];
        for(int i = 0; i < ninjaStamina.length; i++){
            ninjaStamina[i] = NinjaTurtle.NinjaTurtles[i].getStamina();
        }

        //Create instance of our custom RecyclerViewAdapter, passing in the captions and image ids
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, images, ninjaLevel, ninjaHealth, ninjaStamina);
        pizzaRecycler.setAdapter(adapter); //attach our adapter to our RecyclerView.

        //Create a layout manager and attach it to our RecyclerView
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        pizzaRecycler.setLayoutManager(layoutManager);

        //Create a listener (anonymously), and pass it into the adapter's setListener method
        //When a view is clicked inside of THIS INSTANCE of the adapter, this method will execute.
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra(DetailsActivity.EXTRA_ID, (long) position);
                getActivity().startActivity(intent);
            }
        });

        return pizzaRecycler;
    }

}