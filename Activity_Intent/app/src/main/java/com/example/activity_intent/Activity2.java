package com.example.activity_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    public static  int TraVeTu_Activity2 = 1000;
    Button button2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);

        Intent i = getIntent();
        String duLieu = i.getStringExtra("duLieu");
        editText.setText(duLieu);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                String s = editText.getText().toString();
                i.putExtra("duLieu", s);
                setResult(TraVeTu_Activity2, i);


                finish();
            }
        });
    }
}
