package com.iua.work5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class BirdAdapterClass extends BaseAdapter {

    Context BirdContext;
    private String [] Title;
    private String [] Description;
    private int [] image;

    public BirdAdapterClass(Context birdContext, String[] title, String[] description, int[] image) {
        BirdContext = birdContext;
        Title = title;
        Description = description;
        this.image = image;
    }

    @Override
    public int getCount() {

        return Title.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layaout1;
        layaout1=LayoutInflater.from(BirdContext);
        convertView=layaout1.inflate(R.layout.work5fileressources,parent,false);
        ImageView img1=(ImageView) convertView.findViewById(R.id.imgid);
        TextView text1=(TextView) convertView.findViewById(R.id.title);
        TextView text2=(TextView) convertView.findViewById(R.id.description);
        img1.setImageResource(image[position]);
        text1.setText(Title[position]);
        text2.setText(Description[position]);
        return convertView;

    }
}
