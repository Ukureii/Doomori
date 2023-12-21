package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.objects.AnnoncesRecherche;
import com.example.doomori.R;
import com.example.doomori.adapters.arAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class MagnifyingFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<AnnoncesRecherche> annoncesRecherche = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_magnifying, container, false);

        //recyclerView = view.findViewById(R.id.dgRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpAnnoncesRecherche();

        arAdapter adapter = new arAdapter(annoncesRecherche, this.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setUpAnnoncesRecherche() {
        String[] arTitle = getResources().getStringArray(R.array.AnnoncesRecherche_title);
        String[] arSubtitle = getResources().getStringArray(R.array.AnnoncesRecherche_subtitle);
        String[] arPrix = getResources().getStringArray(R.array.AnnoncesRecherche_prix);
        String[] arTxt = getResources().getStringArray(R.array.AnnoncesRecherche_txt);

        for(int i  = 0 ; i < arTitle.length ; i++) {
            annoncesRecherche.add(new AnnoncesRecherche(arTitle[i], arSubtitle[i], arPrix[i], arTxt[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}