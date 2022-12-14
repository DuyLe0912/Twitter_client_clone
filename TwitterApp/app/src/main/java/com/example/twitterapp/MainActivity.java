package com.example.twitterapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
        username.add("Dog 1");
        post.add("Woof.");
        username.add("Dog 2");
        post.add("Bark.");
        username.add("Dog 3");
        post.add("Gau.");
        username.add("Dog 4");
        post.add("GRRR.");
        username.add("Dog 5");
        post.add("whatever man.");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.Tweet);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, username,post);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view) {
        Toast.makeText(this, "Not yet in development tho", Toast.LENGTH_SHORT).show();
    }
}