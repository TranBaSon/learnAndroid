package com.example.appglobalbyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTitle;
    TextView txtShow;
    Button btn;
    EditText editName, editEmail, editPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitle = findViewById(R.id.textView);
        txtShow = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        editName = findViewById(R.id.editText);
        editEmail = findViewById(R.id.editText2);
        editPhone = findViewById(R.id.editText3);

        final String hello = getResources().getString(R.string.show_hello);
        final String email = getResources().getString(R.string.show_email);
        final String phone = getResources().getString(R.string.show_phone);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtShow.setText(hello + ": " + editName.getText() + "\n" + email + ": " + editEmail.getText() + "\n" + phone + ": " + editPhone.getText());
            }
        });

    }
}
