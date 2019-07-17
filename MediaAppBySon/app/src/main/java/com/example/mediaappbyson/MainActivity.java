package com.example.mediaappbyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView time, timeDefault, nameSong;
    ImageButton play, stop, prew, next;
    SeekBar seekBar;
    ArrayList<Song> listSong;
    private int position = 0;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maping();
        addSong();

        mediaPlayer();
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play.setImageResource(R.drawable.play);
                }else {
                    mediaPlayer.start();
                    play.setImageResource(R.drawable.pause);
                }

            }
        });


    }

    private void addSong(){
        listSong = new ArrayList<>();
        listSong.add(new Song("Có chàng trai viết lên cây", R.raw.co_chang_trai_viet_len_cay_phan_manh_quynh));
        listSong.add(new Song("Cuộc vui cô đơn ", R.raw.cuoc_vui_co_don_remix_le_bao_binh));
        listSong.add(new Song("Giá như mình đừng yếu nhau", R.raw.gia_nhu_minh_dung_yeu_nhau_quang_trung));
        listSong.add(new Song("Lạ lùng", R.raw.la_lung_vu));
        listSong.add(new Song("Màu nước mắt", R.raw.mau_nuoc_mat_nguyen_tran_trung_quan));
        listSong.add(new Song("Người lạ ơi", R.raw.nguoi_la_oi_karik_orange_superbrothers));
        listSong.add(new Song("Như gió với mây", R.raw.nhu_gio_voi_may_dinh_dai_vu));
        listSong.add(new Song("Sai người sai thời điểm", R.raw.sai_nguoi_sai_thoi_diem_thanh_hung));
        listSong.add(new Song("Suýt nữa thì", R.raw.suyt_nua_thi_chuyen_di_cua_thanh_xuan_ost_andiez));
        listSong.add(new Song("Vô tình", R.raw.vo_tinh_xesi_hoaprox));
        listSong.add(new Song("yêu đươn phương", R.raw.yeu_don_phuong_onlyc_karik));
    }


    private void maping(){
        time = findViewById(R.id.time);
        timeDefault = findViewById(R.id.timeDefault);
        nameSong = findViewById(R.id.nameSong);
        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);
        prew = findViewById(R.id.prew);
        next = findViewById(R.id.next);
        seekBar = findViewById(R.id.seekBar);
    }

    private void mediaPlayer(){
        mediaPlayer = MediaPlayer.create(MainActivity.this, listSong.get(position).getFile());
        nameSong.setText(listSong.get(position).getTilte());
    }
}
