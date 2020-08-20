package com.raj.freewallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int imgData[] = {R.mipmap.ic_launcher, R.drawable.ic_java, R.drawable.ic_ios,
            R.drawable.ic_php, R.drawable.ic_c, R.drawable.ic_cc, R.drawable.ic_python};
    ArrayList<LangModel> langModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= (GridView) findViewById(R.id.grdview);
        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; i < imgData.length; i++) {


            LangModel langModel = new LangModel(imgData[i]);

            langModelArrayList.add(langModel);
        }

        MyBaseAdapter myBaseAdapter = new
                MyBaseAdapter(this, langModelArrayList);
        gridView.setAdapter(myBaseAdapter);

    }
}
