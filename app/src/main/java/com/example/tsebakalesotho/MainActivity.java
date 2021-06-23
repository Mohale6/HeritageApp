package com.example.tsebakalesotho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager mlayoutManager;

    String[] s1;
    String[] s2;
    int[] img = {R.drawable.afriski,
            R.drawable.kome,
            R.drawable.thaba,
            R.drawable.sehlabathebe,
            R.drawable.maliba,
            R.drawable.maletsunyane,
            R.drawable.sani};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.heritages);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, img);
        recyclerView.setAdapter(myAdapter);

        mlayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.setHasFixedSize(true);
    }
}