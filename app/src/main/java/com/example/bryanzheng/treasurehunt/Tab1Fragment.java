package com.example.bryanzheng.treasurehunt;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.AppComponentFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by User on 2/28/2017.
 */

public class Tab1Fragment extends Fragment{
    private static final String TAG = "Tab1Fragment";
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1fragment,container,false);
        listView = (ListView) view.findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1);
        arrayAdapter.add("Leonardo");
        arrayAdapter.add("Michelangelo");
        arrayAdapter.add("Donatello");
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Tab1Fragment.this, Details.class);
            }
        });
        return view;
    }
}