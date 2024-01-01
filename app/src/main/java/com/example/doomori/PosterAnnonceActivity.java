package com.example.doomori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PosterAnnonceActivity extends AppCompatActivity {

    private String title;
    private int img;
    private TextView tvTitre;
    private ImageView ivImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster_annonce);

        title = getIntent().getStringExtra("Title");
        //img = getIntent().getIntExtra("IMG", 0);


        tvTitre = findViewById(R.id.lbTitle);
        //ivImg = findViewById(R.id.imgTitle);

        tvTitre.setText(title);
        //ivImg.setImageResource(img);
    }
}