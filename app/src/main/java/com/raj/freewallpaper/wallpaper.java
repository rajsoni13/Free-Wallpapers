package com.raj.freewallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class wallpaper extends AppCompatActivity {
    TextView textView;
    String str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        textView = findViewById(R.id.tv_cate);
        str1 =getIntent().getStringExtra("namekey");
        textView.setText(str1);

    }
}