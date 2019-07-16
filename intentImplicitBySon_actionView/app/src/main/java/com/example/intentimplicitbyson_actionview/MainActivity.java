package com.example.intentimplicitbyson_actionview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgGG;
    ImageView imgSend, imgCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGG = findViewById(R.id.imgGG);
        imgSend = findViewById(R.id.imgSend);
        imgCall = findViewById(R.id.imgCall);

        imgGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://google.com"));
                startActivity(intent);
            }
        });


        imgSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body", "noi dung muon gui day ne!");
                intent.setData(Uri.parse("sms:0984328923"));

                startActivity(intent);

            }
        });

        imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0984328923"));

                startActivity(intent);
            }
        });

    }
}
