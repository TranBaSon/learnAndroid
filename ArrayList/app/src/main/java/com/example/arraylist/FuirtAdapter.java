package com.example.arraylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FuirtAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Fuirt> fuirtList;

    public FuirtAdapter(Context context, int layout, List<Fuirt> fuirtList) {
        this.context = context;
        this.layout = layout;
        this.fuirtList = fuirtList;
    }

    @Override
    public int getCount() {
        return fuirtList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return one line on list
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        //maping view

        TextView txtName = (TextView) convertView.findViewById(R.id.textViewName);
        TextView txtDetail = (TextView) convertView.findViewById(R.id.textViewDetail);
        ImageView imgFuirt = (ImageView) convertView.findViewById(R.id.imageViewFuirt);

        //assign value
        Fuirt fuirt = fuirtList.get(position);

        txtName.setText(fuirt.getName());
        txtDetail.setText(fuirt.getDetail());
        imgFuirt.setImageResource(fuirt.getImage());

        return convertView;
    }
}
