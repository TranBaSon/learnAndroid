package com.example.intentgamebyson;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    String nameImgDefault;
    int REQUEST_CODE = 200;
    ImageView img1, img2;
    public static ArrayList<String> arrName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        String[] getName = getResources().getStringArray(R.array.list_name);
        arrName = new ArrayList<>(Arrays.asList(getName));

        Collections.shuffle(arrName);
        reload();

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this, selectActivity.class), REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {

            String nameImg = data.getStringExtra("index");
            Collections.shuffle(arrName);
            int imageId = getResources().getIdentifier(nameImg, "drawable", getOpPackageName());
            img2.setImageResource(imageId);

            if (nameImgDefault.equals(nameImg)) {
                new CountDownTimer(2000, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        reload();
                    }
                }.start();
                Toast.makeText(this, "ban da chon dung", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "ban da chon sai", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "ban chua chon", Toast.LENGTH_SHORT).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.reload, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.reloadItem) {
            Collections.shuffle(arrName);
            reload();
        }

        return super.onOptionsItemSelected(item);
    }

    private void reload() {
        int imageId = getResources().getIdentifier(arrName.get(1), "drawable", getOpPackageName());
        img1.setImageResource(imageId);
        nameImgDefault = arrName.get(1);
    }
}
