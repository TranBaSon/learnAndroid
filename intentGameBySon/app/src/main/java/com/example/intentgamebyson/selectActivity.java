package com.example.intentgamebyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.Collections;

public class selectActivity extends AppCompatActivity {
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        table = findViewById(R.id.table);
        int col = 3;
        int row = 8;

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 95, r.getDisplayMetrics());
        Collections.shuffle(MainActivity.arrName);
        for (int i = 1; i <= row; i++) {
            TableRow tableRow = new TableRow(this);
            for (int j = 1; j <= col; j++) {
                final int index = col * (i - 1) + j - 1;
                ImageView imageView = new ImageView(this);
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(px,px);
                imageView.setLayoutParams(layoutParams);
                int imageId = getResources().getIdentifier(MainActivity.arrName.get(index), "drawable", getPackageName());

                imageView.setImageResource(imageId);
                tableRow.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.putExtra("index", MainActivity.arrName.get(index));
                        setResult(RESULT_OK, intent);
                        Toast.makeText(selectActivity.this, "" + index, Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
            }
            table.addView(tableRow);

        }


    }
}
