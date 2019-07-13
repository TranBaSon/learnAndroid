package com.example.drawableclipbyson;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewClip);
        btn = findViewById(R.id.btnClip);

        imageView.setImageLevel(300);
        final Handler handler = new Handler();

        final ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        int currentLever = clipDrawable.getLevel();
                        if (currentLever >= 10000){
                            currentLever = 0;
                        }

                        imageView.setImageLevel(currentLever + 1000);
                        handler.postDelayed(this,500);
                    }
                },1000);


            }
        });


    }
}
