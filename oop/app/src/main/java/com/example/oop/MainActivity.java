package com.example.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sinhVien sinhVien1 = new sinhVien();

        sinhVien1.HoTen = "Nguyen Van A";
        sinhVien1.DiaChi = "Ho Chi Minh";
        sinhVien1.NamSinh = 2000 ;

        Toast.makeText(MainActivity.this, sinhVien1.HoTen + " " + sinhVien1.NamSinh, Toast.LENGTH_LONG).show();
    }
}
