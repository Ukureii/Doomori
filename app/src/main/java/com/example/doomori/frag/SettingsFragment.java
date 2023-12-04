package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.AnnoncesRecherche;
import com.example.doomori.R;
import com.example.doomori.Reglages;
import com.example.doomori.arAdapter;
import com.example.doomori.rAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class SettingsFragment extends Fragment  implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<Reglages> reglages = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        recyclerView = view.findViewById(R.id.rRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpReglages();

        rAdapter adapter = new rAdapter(reglages, this.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setUpReglages() {
        String[] rTitle = getResources().getStringArray(R.array.Reglages_title);

        for(int i  = 0 ; i < rTitle.length ; i++) {
            reglages.add(new Reglages(rTitle[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}