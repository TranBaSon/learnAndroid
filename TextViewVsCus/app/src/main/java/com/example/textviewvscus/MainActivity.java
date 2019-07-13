package com.example.textviewvscus;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.textView1);
        // set phong chu

        text.setTypeface(Typeface.DEFAULT, Typeface.BOLD_ITALIC);

        // set drawble
        text.setCompoundDrawables(null, AppCompatResources.getDrawable(this, R.drawable.icocus), null, null);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(null);
            }
        });
    }
}
