package com.example.customizeadapterlistviewbyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listViewFruit;
    List<fruit> listFruit;
    FruitAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();

        adapter = new FruitAdapter(MainActivity.this, R.layout.item_fruit, listFruit);
        listViewFruit.setAdapter(adapter);


    }


    public void mapping(){
        listViewFruit = findViewById(R.id.listViewFruit);
        listFruit = new ArrayList<>();

        listFruit.add(new fruit("Banana", " chuoi mien tay", R.drawable.banana));
        listFruit.add(new fruit("categories", " bo mien nam", R.drawable.categories));
        listFruit.add(new fruit("fresh", " ca rot ha noi", R.drawable.fresh));
        listFruit.add(new fruit("Oranges", " cam hai phong", R.drawable.oganges));
        listFruit.add(new fruit("Passion", " chanh leo bac giang", R.drawable.passion));
        listFruit.add(new fruit("Peach", " dao trung quoc", R.drawable.peach));
    }
}
