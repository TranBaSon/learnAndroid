package com.example.apprandombyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mapping();
        textView.setText("0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int max = Integer.parseInt(String.valueOf(editText2.getText()));
                int min = Integer.parseInt(String.valueOf(editText1.getText()));
                int a = random.nextInt( max - min + 1) + min;

                textView.setText("" + a);
            }
        });


    }


    public void mapping(){
        this.editText1 = findViewById(R.id.editText1);
        this.editText2 = findViewById(R.id.editText2);
        this.button = findViewById(R.id.button);
        this.textView = findViewById(R.id.textView);
    }
}
