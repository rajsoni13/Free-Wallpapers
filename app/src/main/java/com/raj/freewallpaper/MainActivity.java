package com.raj.freewallpaper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<LangModel> langModelArrayList;

    int[] imgData = {
            R.drawable.beach,
            R.drawable.bikes,
            R.drawable.cars,
            R.drawable.minimalist,
            R.drawable.setup,
            R.drawable.studio,
            R.drawable.sunset,
            R.drawable.space,
            R.drawable.ab,
            R.drawable.mountains
    };

    String[] strData = {
           "beach" ,
            "bikes" ,
            "cars",
            "minimalist",
            "setup",
            "studio",
            "sunset" ,
            "space",
            "ab",
            "mountains"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= (GridView) findViewById(R.id.grdview);
        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; i < strData.length; i++) {

            LangModel langModel = new LangModel(strData[i], imgData[i]);

            langModelArrayList.add(langModel);

        }

        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this, langModelArrayList);
        gridView.setAdapter(myBaseAdapter);

    }
}
