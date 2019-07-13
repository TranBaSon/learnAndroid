package com.example.intenbundlebyson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);

                Bundle bundle = new Bundle();

                String[] arr = {"son","dep","trai"};
                bundle.putStringArray("arr",arr);
                bundle.putString("string", "bundle string");
                bundle.putInt("int",18);
                intent.putExtra("data", bundle);



                startActivity(intent);
            }
        });


    }
}
