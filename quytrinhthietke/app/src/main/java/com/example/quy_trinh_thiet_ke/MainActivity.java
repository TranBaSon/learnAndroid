package com.example.quy_trinh_thiet_ke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView noiDung ; // toàn cục
    EditText content;
    Button btnClick;
    Button btnGetContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ánh xạ
        noiDung = (TextView) findViewById(R.id.textViewNoiDung);

        // viết code

        btnClick = (Button) findViewById(R.id.buttonClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noiDung.setText("Hello world!");
            }
        });

        content = (EditText) findViewById(R.id.content);

        btnGetContent = (Button) findViewById(R.id.btnGetContent);
        btnGetContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content1 = content.getText().toString();
                Toast.makeText(MainActivity.this, content1, Toast.LENGTH_LONG).show();
            }
        });
    }
}
