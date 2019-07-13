package com.example.calendarbyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtShow = findViewById(R.id.txtShow);

        Calendar calendar = Calendar.getInstance();

        txtShow.append(calendar.getTime() + "");
        txtShow.append("\n Date: " + calendar.get(Calendar.DATE));
        txtShow.append("\n Month: " + (calendar.get(Calendar.MONTH) + 1));
        txtShow.append("\n Year: " + calendar.get(Calendar.YEAR) + "\n");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss a");
        txtShow.append(format.format(calendar.getTime()));


    }
}
