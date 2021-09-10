package com.e.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private myAdapter adapter;
    private ArrayList<Hewan> hewanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rcv);

        adapter = new myAdapter(hewanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        hewanArrayList = new ArrayList<>();
        hewanArrayList.add(new Hewan("Jerapah", "Tumbuhan", "Padang rumput",R.drawable.jerapah));
        hewanArrayList.add(new Hewan("Singa", "Daging", "Hutan terbuka",R.drawable.singa));
        hewanArrayList.add(new Hewan("Harimau", "Daging", "Hutan",R.drawable.harimau));
        hewanArrayList.add(new Hewan("Monyet", "Buah - buahan dan biji - bijian", "Hutan",R.drawable.monyet));
        hewanArrayList.add(new Hewan("Serigala", "Daging", "Hutan Terbuka",R.drawable.serigala));
    }
}