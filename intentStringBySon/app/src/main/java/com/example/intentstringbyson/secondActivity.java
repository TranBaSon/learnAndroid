package com.example.intentstringbyson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtData = findViewById(R.id.txtData);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        txtData.setText(data);
    }
}
