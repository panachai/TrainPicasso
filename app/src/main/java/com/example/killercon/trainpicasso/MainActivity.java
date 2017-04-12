package com.example.killercon.trainpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int radius = 30;
        int stroke = 5;
        int margin = 5;
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Picasso.with(getApplicationContext()).load("https://lh4.ggpht.com/wKrDLLmmxjfRG2-E-k5L5BUuHWpCOe4lWRF7oVs1Gzdn5e5yvr8fj-ORTlBF43U47yI=w300-rw")
                .transform(new RoundedRectTransformation(radius, stroke, margin))
                .into(imageView);
    }
}
