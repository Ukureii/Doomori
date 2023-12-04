package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.AnnoncesRecherche;
import com.example.doomori.MesAnimaux;
import com.example.doomori.R;
import com.example.doomori.arAdapter;
import com.example.doomori.maAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class AnimalsFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<MesAnimaux> mesAnimaux = new ArrayList<>();
    private int[] mesAnimauxIMG = {R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animals, container, false);

        recyclerView = view.findViewById(R.id.maRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpMesAnimaux();

        maAdapter adapter = new maAdapter(mesAnimaux, this.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setUpMesAnimaux() {
        String[] maNom = getResources().getStringArray(R.array.MesAnimaux_nom);
        String[] maRace = getResources().getStringArray(R.array.MesAnimaux_race);
        String[] maAge = getResources().getStringArray(R.array.MesAnimaux_age);

        for(int i  = 0 ; i < maNom.length ; i++) {
            mesAnimaux.add(new MesAnimaux(maNom[i], maRace[i], maAge[i], mesAnimauxIMG[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}