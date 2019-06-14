package com.example.anime_racing;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtDiem;
    CheckBox cb1, cb2, cb3;
    SeekBar sk1, sk2, sk3;
    ImageButton play;
    int soDiem = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        sk1.setEnabled(false);
        sk2.setEnabled(false);
        sk3.setEnabled(false);

        txtDiem.setText(soDiem + "");

        final CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number = 6;

                Random random = new Random();
                int one = random.nextInt(number);
                int Two = random.nextInt(number);
                int Three = random.nextInt(number);

                //check win
                if (sk1.getProgress() >= sk1.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "st 1 Win!", Toast.LENGTH_SHORT).show();
                    play.setVisibility(View.VISIBLE);
                    //check dat cuoc
                    if (cb1.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "ban da thang cuoc", Toast.LENGTH_LONG).show();
                    }else {
                        soDiem -= 10;
                        Toast.makeText(MainActivity.this, "ban da thua cuoc", Toast.LENGTH_LONG).show();
                    }
                    txtDiem.setText(soDiem + "");
                    enableCheckBox();

                }
                if (sk2.getProgress() >= sk2.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "st 2 Win!", Toast.LENGTH_SHORT).show();
                    play.setVisibility(View.VISIBLE);
                    if (cb2.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "ban da thang cuoc", Toast.LENGTH_LONG).show();
                    }else {
                        soDiem -= 10;
                        Toast.makeText(MainActivity.this, "ban da thua cuoc", Toast.LENGTH_LONG).show();
                    }
                    txtDiem.setText(soDiem + "");
                    enableCheckBox();
                }
                if (sk3.getProgress() >= sk3.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "st 3 Win!", Toast.LENGTH_SHORT).show();
                    play.setVisibility(View.VISIBLE);
                    if (cb3.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "ban da thang cuoc", Toast.LENGTH_LONG).show();
                    }else {
                        soDiem -= 10;
                        Toast.makeText(MainActivity.this, "ban da thua cuoc", Toast.LENGTH_LONG).show();
                    }
                    txtDiem.setText(soDiem + "");
                    enableCheckBox();
                }


                sk1.setProgress(sk1.getProgress() + one);
                sk2.setProgress(sk2.getProgress() + Two);
                sk3.setProgress(sk3.getProgress() + Three);

            }

            @Override
            public void onFinish() {

            }
        };
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked()) {
                    sk1.setProgress(0);
                    sk2.setProgress(0);
                    sk3.setProgress(0);
                    play.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    disableCheckBox();
                }else{
                    Toast.makeText(MainActivity.this, "vui long chon con vat ban muon dat cuoc", Toast.LENGTH_LONG).show();
                }
            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cb1.setChecked(false);
                    cb3.setChecked(false);
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cb2.setChecked(false);
                    cb1.setChecked(false);
                }
            }
        });

    }

    public void anhXa(){
        txtDiem = (TextView) findViewById(R.id.textViewDiemSo);
        cb1 = (CheckBox) findViewById(R.id.checkboxOne);
        cb2 = (CheckBox) findViewById(R.id.checkboxTwo);
        cb3 = (CheckBox) findViewById(R.id.checkboxThree);
        sk1 = (SeekBar) findViewById(R.id.seekBaOne);
        sk2 = (SeekBar) findViewById(R.id.seekBarTwo);
        sk3 = (SeekBar) findViewById(R.id.seekBarThree);
        play = (ImageButton) findViewById(R.id.buttonPlay);

    }

    public void enableCheckBox(){
        cb1.setEnabled(true);
        cb2.setEnabled(true);
        cb3.setEnabled(true);
    }

    public void disableCheckBox(){
        cb1.setEnabled(false);
        cb2.setEnabled(false);
        cb3.setEnabled(false);
    }
}
