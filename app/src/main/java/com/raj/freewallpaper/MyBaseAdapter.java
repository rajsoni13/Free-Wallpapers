package com.raj.freewallpaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<LangModel> langModelArrayList;

    public MyBaseAdapter(Context context, ArrayList<LangModel> langModelArrayList) {

        this.context = context;
        this.langModelArrayList = langModelArrayList;
    }

    @Override
    public int getCount() {
        return langModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return langModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.raw, null);
        }

        ImageView imgData = (ImageView) convertView.findViewById(R.id.img_data);
        imgData.setImageResource(langModelArrayList.get(position).getImgLang());


        return convertView;
    }
}