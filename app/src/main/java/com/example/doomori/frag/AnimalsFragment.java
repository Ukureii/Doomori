package com.example.doomori.frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.doomori.MyAnimalsActivity;
import com.example.doomori.objects.MesAnimaux;
import com.example.doomori.R;
import com.example.doomori.adapters.maAdapter;
import com.example.doomori.rvInterface;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class AnimalsFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private FloatingActionButton plusMA;
    private ArrayList<MesAnimaux> mesAnimaux = new ArrayList<>();
    private int mesAnimauxIMG = R.drawable.two_paws;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animals, container, false);

        recyclerView = view.findViewById(R.id.maRecyclerView);
        plusMA = view.findViewById(R.id.btPlus);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpMesAnimaux();

        maAdapter adapter = new maAdapter(mesAnimaux, this.getContext());

        plusMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MyAnimalsActivity.class);
                startActivity(intent);
            }
        });


        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setUpMesAnimaux() {
        String[] maNom = getResources().getStringArray(R.array.MesAnimaux_nom);
        String[] maRace = getResources().getStringArray(R.array.MesAnimaux_race);
        String[] maAge = getResources().getStringArray(R.array.MesAnimaux_age);

        for(int i  = 0 ; i < maNom.length ; i++) {
            mesAnimaux.add(new MesAnimaux(maNom[i], maRace[i], maAge[i], mesAnimauxIMG));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}