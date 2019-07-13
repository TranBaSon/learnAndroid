package com.example.popupmenubyson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu();
            }
        });
    }


    private void showMenu(){
        PopupMenu popupMenu = new PopupMenu(this, btn);

        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menuThem: btn.setText("Menu Thêm");
                        break;
                    case R.id.menuSua: btn.setText("Menu Sửa");
                        break;
                    case R.id.menuXoa: btn.setText("Menu Xoá");
                        break;
                }


                return false;
            }
        });

        popupMenu.show();
    }
}
