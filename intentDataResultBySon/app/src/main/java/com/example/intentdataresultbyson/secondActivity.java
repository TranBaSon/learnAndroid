package com.example.intentdataresultbyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {
    EditText edtName;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtName = findViewById(R.id.edtName);
        btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newName = edtName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name", newName);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
