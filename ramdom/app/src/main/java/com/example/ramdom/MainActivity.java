package com.example.ramdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnRandom;
    EditText minNumber;
    EditText maxNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getMinN = minNumber.getText().toString();
                String getMaxN = maxNumber.getText().toString();
                //ép kiểu


                if (getMaxN.isEmpty() || getMinN.isEmpty()){
                    Toast.makeText(MainActivity.this, "vui lòng nhập đủ số", Toast.LENGTH_LONG).show();
                }else {
                    int minN = Integer.parseInt(getMinN);
                    int maxN = Integer.parseInt(getMaxN);
                    if (minN >= maxN){
                        Toast.makeText(MainActivity.this, "số thứ nhất phải nhỏ hơn số thứ 2", Toast.LENGTH_LONG).show();
                    }
                    else {
                        //tạo số ngẫu nhiên
                        Random random = new Random();
                        int number = random.nextInt(maxN - minN + 1) + minN; // 0 -> 99
                        txtNumber.setText(String.valueOf(number));// cách fix 1: (number + "") || 2: (String.valueOf(number))
                    }
                }

            }
        });
    }

    private void mapping(){
        txtNumber = (TextView) findViewById(R.id.textViewNumber);
        btnRandom = (Button) findViewById(R.id.buttonRandom);
        minNumber = (EditText) findViewById(R.id.minNumber);
        maxNumber = (EditText) findViewById(R.id.maxNumber);
    };
}
