package com.example.carla.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView ImageUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageUrl = (ImageView) findViewById(R.id.image_url);
        Picasso.with(getApplicationContext()).load("https://img.memesuper.com/debe3f6fb3e762ec8f52167bb0842eb7_memes-png-by-unbrokentutorials-memes-png-descargar_900-809.png").into(ImageUrl);
    }

}
