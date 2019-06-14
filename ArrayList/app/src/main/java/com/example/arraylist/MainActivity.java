package com.example.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewFuirt;
    ArrayList<Fuirt> listFuirt;
    FuirtAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();
        adapter = new FuirtAdapter(this,R.layout.fuirt_item, listFuirt);
        listViewFuirt.setAdapter(adapter);
    }

    private void mapping() {
        listViewFuirt = (ListView) findViewById(R.id.ListViewFuirt);
        listFuirt = new ArrayList<>();
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i1));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i2));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i3));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i4));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i5));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i6));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i7));
        listFuirt.add(new Fuirt("apple","Contrary to popular belief, Lorem Ipsum is not simply random text", R.drawable.i8));

    }
}
