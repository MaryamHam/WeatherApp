package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items ;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        ImageView imageView = convertView.findViewById(R.id.itemImageView);
        TextView contentTextView = convertView.findViewById(R.id.contentTextView);

       // TextView detailTextView = convertView.findViewById(R.id.contentTextView2);

        Item item = (Item) getItem(position);

        titleTextView.setText(item.getTitle());
        imageView.setImageResource(item.getImage());
        contentTextView.setText(item.getContent());

     //   detailTextView.setText(item.getContent());


        return convertView;
    }
}