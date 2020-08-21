package com.raj.freewallpaper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<LangModel> langModelArrayList;

    public MyBaseAdapter(Context context, ArrayList<LangModel> langModelArrayList) {

        this.context =context;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView =  layoutInflater.inflate(R.layout.raw,null);
        }


        TextView tvData = (TextView)convertView.findViewById(R.id.textView2);
        ImageView imgData = (ImageView)convertView.findViewById(R.id.img_data);

        tvData.setText(langModelArrayList.get(position).getStrLang());

        imgData.setImageResource(langModelArrayList.get(position).getImgLang());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = langModelArrayList.get(position).getStrLang();
                int lmg = langModelArrayList.get(position).getImgLang();

                Intent i = new Intent(context, wallpaper.class);
                i.putExtra("namekey",name);
                context.startActivity(i);
            }
        });


        return convertView;
    }
}
