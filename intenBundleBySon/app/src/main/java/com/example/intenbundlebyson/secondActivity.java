package com.example.intenbundlebyson;

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

        Bundle bundle = intent.getBundleExtra("data");

        String s = bundle.getString("string");
        int i = bundle.getInt("int");
        String[] arr = bundle.getStringArray("arr");
        txtData.setText(s +  " - " + i + "\n" + arr[0] + " " + arr[1] + " " +arr[2]);


    }
}
