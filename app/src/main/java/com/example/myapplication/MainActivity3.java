package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private ListView itemListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        itemListView = findViewById(R.id.itemListView);

        List<Item> items = generateSamplePosts();
        ItemAdapter adapter = new ItemAdapter(this, items);
        itemListView.setAdapter(adapter);
        
    }

    private List<Item> generateSamplePosts() {
        List<Item> items = new ArrayList<>();
                items.add(new Item("Mon",R.drawable.pic1, "Mostly clear               20/16"));
        items.add(new Item("Sun",R.drawable.pic2, "ThundersShowers           20/16"));
        items.add(new Item("Tue",R.drawable.pic3, "with fog                       20/16"));
        items.add(new Item("Wed",R.drawable.pic4, "Partly clear                  20/16"));
        items.add(new Item("Thu",R.drawable.pic5, "Sunny                          20/16"));
        items.add(new Item("Fri",R.drawable.pic6, "Showers                         20/16"));
        items.add(new Item("Sat",R.drawable.cloud , "Mostly cloudy                 20/16"));

        return items;
    }
}