package com.example.doomori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.doomori.adapters.paAdapter;
import com.example.doomori.objects.PosterAnnonce;

import java.util.ArrayList;

public class DevenirGardienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devenir_gardien);
    }
}