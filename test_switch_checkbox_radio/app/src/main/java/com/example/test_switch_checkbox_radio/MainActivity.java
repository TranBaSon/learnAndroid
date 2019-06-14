package com.example.test_switch_checkbox_radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup testRadio;
    Button btnXacnhan;
    Switch swtWifi;
    RadioButton rdbPhp, rdbJava, rdbC;
    CheckBox cbAndroid, cbNodejs, cbIos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        swtWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "wifi on", Toast.LENGTH_LONG ).show();
                }else{
                    Toast.makeText(MainActivity.this, "wifi off", Toast.LENGTH_LONG ).show();
                }
            }

        });

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "select android", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "unSelect android", Toast.LENGTH_LONG).show();
                }
            }
        });

        cbIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "select IOS", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "unSelect IOS", Toast.LENGTH_LONG).show();
                }
            }
        });

        cbNodejs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "select NodeJS", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "unSelect NodeJS", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monHoc = " môn học bạn chọn là: \n";
                if (cbAndroid.isChecked()){
                    monHoc += cbAndroid.getText() + "\n";
                }
                if (cbIos.isChecked()){
                    monHoc += cbIos.getText() + "\n";
                }
                if (cbNodejs.isChecked()){
                    monHoc += cbNodejs.getText() + "\n";
                }

                Toast.makeText(MainActivity.this, monHoc, Toast.LENGTH_LONG).show();

                if (rdbC.isChecked()){
                    Toast.makeText(MainActivity.this, "select C", Toast.LENGTH_LONG).show();

                }
                if (rdbJava.isChecked()){
                    Toast.makeText(MainActivity.this, "select Java", Toast.LENGTH_LONG).show();

                }
                if (rdbPhp.isChecked()){
                    Toast.makeText(MainActivity.this, "select PHP", Toast.LENGTH_LONG).show();

                }
            }
        });

        testRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checketId : id cua radio select
                switch (checkedId){
                    case R.id.radioButtonC:
                        Toast.makeText(MainActivity.this, "select C", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButtonPhP:
                        Toast.makeText(MainActivity.this, "select Php", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButtonJava:
                        Toast.makeText(MainActivity.this, "select Java", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
    public void anhXa(){
        btnXacnhan = (Button) findViewById(R.id.buttonXacNhan);
        rdbPhp = (RadioButton) findViewById(R.id.radioButtonPhP);
        rdbJava = (RadioButton) findViewById(R.id.radioButtonJava);
        rdbC = (RadioButton) findViewById(R.id.radioButtonC);
        cbAndroid = (CheckBox) findViewById(R.id.checkBoxAndroid);
        cbNodejs = (CheckBox) findViewById(R.id.checkBoxNodejs);
        cbIos = (CheckBox) findViewById(R.id.checkBoxIos);
        swtWifi = (Switch) findViewById(R.id.switchWifi);
        testRadio = (RadioGroup) findViewById(R.id.radioGroupTest);
    }
}
