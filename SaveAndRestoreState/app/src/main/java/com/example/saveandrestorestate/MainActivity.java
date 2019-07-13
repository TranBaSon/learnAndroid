package com.example.saveandrestorestate;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView message;
    Button button;

    private int m_lessons = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        setMessage();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_lessons++;
                setMessage();
                button.setBackgroundColor(Color.GREEN);
            }
        });
    }

    private void setMessage(){
        message.setText("bai hoc " + m_lessons);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        m_lessons = savedInstanceState.getInt("baihoc");
        button.setBackgroundColor(savedInstanceState.getInt("mamau"));
        setMessage();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ColorDrawable color = (ColorDrawable) button.getBackground();
        int c = color.getColor();
        outState.putInt("baihoc", m_lessons);
        outState.putInt("mamau", c);
    }
}
