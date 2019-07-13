package com.example.activity_intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    Button button1;
    TextView textView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity1);
        button1 = findViewById(R.id.button1);
        textView = findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(Activity1.this, Activity2.class);
                i.putExtra("duLieu", textView.getText());
                String text = textView.getText().toString();
                //startActivity(i);
                startActivityForResult(i, Activity2.TraVeTu_Activity2);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==  Activity2.TraVeTu_Activity2){
            String s = data.getStringExtra("duLieu");
            textView.setText(s);
        }
    }
}
