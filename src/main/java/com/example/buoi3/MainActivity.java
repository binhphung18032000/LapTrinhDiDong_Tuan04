package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    ListView listView;
//    GridView listView;
    Spinner listView;
    ArrayList<Nation> DuLieu = new ArrayList<>();
    NationAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstView);

        DuLieu.add(new Nation(R.drawable.argentina, "Argentina", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.brazil, "Brazil", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.cambodia, "Cambodia", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.singapore, "Singapore", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.switzerland, "Switzerland", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.usa, "USA", "523.653.456"));
        DuLieu.add(new Nation(R.drawable.vietnam, "Viet Nam", "523.653.456"));

        adapter = new NationAdapter(this, DuLieu);
        listView.setAdapter(adapter);
//        String[] data = {"Nokia", "Samsum","Nokia", "Samsum","Nokia", "Samsum","Nokia", "Samsum","Nokia", "Samsum","Nokia", "Samsum"};
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, data);
//
//        lstView.setAdapter(adapter);

    }
}