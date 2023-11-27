package com.example.doomori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputLayout;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<PosterAnnonce> posterAnnonce = new ArrayList<>();
    private int[] posterAnnonceIMG = {R.drawable.dog_bowl, R.drawable.paws, R.drawable.suitcase};
    private RecyclerView rvPA;
    private AnnonceFragment annonceFragment;
    private SettingsFragment settingsFragment;
    private AnimalsFragment animalsFragment;
    private MagnifyingFragment magnifyingFragment;
    private Button btSettings, btPaw, btMagnifying, btAnnonce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPA = findViewById(R.id.rvPA);

        //paAdapter adapter = new paAdapter(paListe, this);
        //rvPA.setAdapter(adapter);
        //this.rvPA.setLayoutManager(new GridLayoutManager(this, 1));


        btSettings = findViewById(R.id.btSettings);
        btSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        btPaw = findViewById(R.id.btAnimals);
        btPaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        btMagnifying = findViewById(R.id.btSearch);
        btMagnifying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        btAnnonce = findViewById(R.id.btPost);
        btAnnonce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    private void setUpPosterAnnonce() {
        String[] paTitle = getResources().getStringArray(R.array.TypeAnnonces_title);
        String[] paSubtitle = getResources().getStringArray(R.array.TypeAnnonces_subtitle);

        for(int i  = 0 ; i < paTitle.length ; i++) {
            posterAnnonce.add(new PosterAnnonce(paTitle[i], paSubtitle[i], posterAnnonceIMG[i]));
        }
    }
}