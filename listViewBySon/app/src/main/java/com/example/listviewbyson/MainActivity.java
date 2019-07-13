package com.example.listviewbyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> listCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCourse = new ArrayList<>();
        listView = findViewById(R.id.listCourse);

        listCourse.add("IOS");
        listCourse.add("PHP");
        listCourse.add("JS");
        listCourse.add("NODEJS");
        listCourse.add("JAVA");
        listCourse.add("C#");
        listCourse.add("C");
        listCourse.add("C++");
        listCourse.add("ReactJS");
        listCourse.add("React Native");


        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1, listCourse);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position la vi tri item
                Toast.makeText(MainActivity.this, "index: " + position + "  item: " + listCourse.get(position), Toast.LENGTH_SHORT ).show();
            }
        });

        // giu lau
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "index: " + position + "  long click " , Toast.LENGTH_SHORT ).show();

                return false;
            }
        });

    }
}
