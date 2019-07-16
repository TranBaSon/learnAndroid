package com.example.intentdataresultbyson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtName;
    Button btnGetName;
    int REQEST_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        btnGetName = findViewById(R.id.btnGetName);

        btnGetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                startActivityForResult(intent, REQEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQEST_CODE && resultCode == RESULT_OK && data != null){
            String newName = data.getStringExtra("name");
            txtName.setText(newName);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
