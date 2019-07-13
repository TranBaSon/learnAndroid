package com.example.intentobjectbyson;

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

        person son = (person) intent.getSerializableExtra("data");
        txtData.setText(son.getName() + " - " + son.getAge());
    }
}
