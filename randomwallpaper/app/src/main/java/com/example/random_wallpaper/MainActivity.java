package com.example.random_wallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    ArrayList<Integer> arrayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.myLinearLayout);

        arrayImage = new ArrayList<>();
        arrayImage.add(R.drawable.bg1);
        arrayImage.add(R.drawable.bg2);
        arrayImage.add(R.drawable.bg3);
        arrayImage.add(R.drawable.bg4);

        Random random = new Random();
        int viTri = random.nextInt(arrayImage.size());
        linearLayout.setBackgroundResource(arrayImage.get(viTri));


    }
}
