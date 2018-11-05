package com.example.bryanzheng.treasurehunt;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private final String[] namesIds;
    private final int[] levelIds;
    private final int[] healthIds;
    private final int[] staminaIds;
    private int[] imageIds;
    private Listener listener;

    interface Listener{
        void onClick(int position);
    }

    public void setListener(Listener listener){
        this.listener = listener;
    }

    public CaptionedImagesAdapter(String[] namesIds, int[] imageIds, int[] levelIds, int[] healthIds, int[] staminaIds){
        this.namesIds = namesIds;
        this.levelIds = levelIds;
        this.healthIds = healthIds;
        this.staminaIds = staminaIds;
        this.imageIds = imageIds;
    }

    @Override
    public int getItemCount(){
        return namesIds.length;
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //our onCreateViewHolder code goes here!
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate((R.layout.card_ninja), parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position){
        final CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.image_view);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(namesIds[position]);
        TextView nameTV = (TextView)cardView.findViewById(R.id.cardNameTV);
        nameTV.setText(namesIds[position]);

        TextView levelTV = (TextView)cardView.findViewById(R.id.cardLevelTV);
        levelTV.setText("Level: "+Integer.toString(levelIds[position]));

        TextView healthTV = (TextView)cardView.findViewById(R.id.cardHealthTV);
        healthTV.setText("Health: "+ Integer.toString(healthIds[position]));

        TextView staminaTV = (TextView)cardView.findViewById(R.id.cardStaminaTV);
        staminaTV.setText("Stamina: "+Integer.toString(staminaIds[position]));
        //let's also bind a click listener -- that will invoke the listener's onClick method!
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(listener != null){
                    listener.onClick(position);
                }
            }
        });

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //define the view to be used for each data item
        private CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }
}