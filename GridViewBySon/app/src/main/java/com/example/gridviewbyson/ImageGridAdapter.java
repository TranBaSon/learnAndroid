package com.example.gridviewbyson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class ImageGridAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ImageViewGrid> listImage;

    public ImageGridAdapter(Context context, int layout, List<ImageViewGrid> listImage) {
        this.context = context;
        this.layout = layout;
        this.listImage = listImage;
    }

    private class ViewHolder{
        ImageView image;
    }


    @Override
    public int getCount() {
        return listImage.size();
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
            holder.image = convertView.findViewById(R.id.imageItem);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        ImageViewGrid imageView = listImage.get(position);

        holder.image.setImageResource(imageView.getImage());


        return convertView;
    }
}
