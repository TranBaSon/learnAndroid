package com.example.learnactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// 1 activity khi no ke thua class AppcompatActivity va khai bao trong manifests
public class firstActivity extends AppCompatActivity {
    private String Tag = "firstActivityLog";
    // lap chong oncreate de set giao dien xml

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Tag,"onCreate");

        setContentView(R.layout.layout_firstactivity);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //khoi tao intent
                Intent intent = new Intent();
                intent.setClass(firstActivity.this, secondActivity.class);
                startActivity(intent);
//                Toast.makeText(firstActivity.this,"da click", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");

    }
}
