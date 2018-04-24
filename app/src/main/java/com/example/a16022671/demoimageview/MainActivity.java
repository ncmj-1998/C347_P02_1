package com.example.a16022671.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivDay2 = (ImageView) findViewById(R.id.imageView2) ;
        ivDay2.setImageResource(R.drawable.day2);

        ImageView ivDay3 = (ImageView) findViewById(R.id.imageView3) ;
        ivDay3.setImageResource(R.drawable.day3);

        ImageView ivDay4 = (ImageView) findViewById(R.id.imageView4) ;
        ivDay4.setImageResource(R.drawable.day2);

        ImageView ivDay5 = (ImageView) findViewById(R.id.imageView5) ;
        ivDay5.setImageResource(R.drawable.day5);

    }
}
