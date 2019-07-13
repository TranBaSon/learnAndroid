package com.example.contextmenubyson;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ConstraintLayout layoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        layoutMain = findViewById(R.id.layoutMain);

        registerForContextMenu(btn);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("select color background!");
        menu.setHeaderIcon(R.drawable.iconselected);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuBlue: layoutMain.setBackgroundColor(Color.parseColor("#12CBC4"));
                break;
            case R.id.menuGreen: layoutMain.setBackgroundColor(Color.parseColor("#C4E538"));
                break;
            case R.id.menuPurple: layoutMain.setBackgroundColor(Color.parseColor("#D980FA"));
                break;
        }

        return super.onContextItemSelected(item);
    }
}
