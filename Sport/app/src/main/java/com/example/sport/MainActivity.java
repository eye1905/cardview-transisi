package com.example.sport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvsport;
    private ArrayList<Sport> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvsport = findViewById(R.id.recy);

        list.addAll(SportData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvsport.setLayoutManager(new LinearLayoutManager(this));
        SportAdapter listPlayerAdapter = new SportAdapter(list);

        rvsport.setAdapter(listPlayerAdapter);
    }
}
