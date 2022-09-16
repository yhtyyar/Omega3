package com.example.omega3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.omega3.adapter.MainPageAdapter;
import com.example.omega3.model.MainPage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MainPage> menuList = new ArrayList<>();

        menuList.add(new MainPage("Исследовательская работа"));
        menuList.add(new MainPage("Калькулятор Omega-3"));
        menuList.add(new MainPage("Препараты и БАДы Omega-3"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView.Adapter<MainPageAdapter.MainPageViewHolder> adapter =
                new MainPageAdapter(menuList, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}