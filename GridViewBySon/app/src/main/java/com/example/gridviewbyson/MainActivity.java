package com.example.gridviewbyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    List<ImageViewGrid> list;
    ImageGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        adapter = new ImageGridAdapter(MainActivity.this, R.layout.item, list);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "index: " + position + "name: " + list.get(position).getName(), Toast.LENGTH_LONG).show();
            }
        });

    }



    public void mapping(){
        gridView = findViewById(R.id.gridViewImage);
        list = new ArrayList<>();
        list.add(new ImageViewGrid("hinh1", R.drawable.image1));
        list.add(new ImageViewGrid("hinh2", R.drawable.image2));
        list.add(new ImageViewGrid("hinh3", R.drawable.image3));
        list.add(new ImageViewGrid("hinh4", R.drawable.image4));
        list.add(new ImageViewGrid("hinh5", R.drawable.image5));
        list.add(new ImageViewGrid("hinh6", R.drawable.image6));
        list.add(new ImageViewGrid("hinh7", R.drawable.image7));
        list.add(new ImageViewGrid("hinh8", R.drawable.image8));
        list.add(new ImageViewGrid("hinh9", R.drawable.image9));
        list.add(new ImageViewGrid("hinh10", R.drawable.image10));

    }
}
