package com.example.customizeadapterlistviewbyson;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<fruit> fruitList;


    private class ViewHolder{
        ImageView imageFruit ;
        TextView nameFruit ;
        TextView descriptionFruit;
    }



    public FruitAdapter(Context context, int layout, List<fruit> fruitList) {
        this.context = context;
        this.layout = layout;
        this.fruitList = fruitList;
    }

    @Override
    public int getCount() {
        return fruitList.size();
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

        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, null);

            holder.imageFruit = convertView.findViewById(R.id.imageFruit);
            holder.nameFruit = convertView.findViewById(R.id.nameFruit);
            holder.descriptionFruit = convertView.findViewById(R.id.descriptionFruit);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        // gan gia tri cho fruit

        fruit fruit = fruitList.get(position);

        holder.imageFruit.setImageResource(fruit.getImage());
        holder.nameFruit.setText(fruit.getName());
        holder.descriptionFruit.setText(fruit.getDescription());

        return convertView;
    }
}
