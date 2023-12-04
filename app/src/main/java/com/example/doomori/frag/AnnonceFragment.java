package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.PosterAnnonce;
import com.example.doomori.R;
import com.example.doomori.paAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class AnnonceFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<PosterAnnonce> posterAnnonce = new ArrayList<>();
    private int[] posterAnnonceIMG = {R.drawable.dog_bowl, R.drawable.paws, R.drawable.suitcase};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_annonce, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpPosterAnnonce();

        paAdapter adapter = new paAdapter(posterAnnonce, this.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }
    private void setUpPosterAnnonce() {
        String[] paTitle = getResources().getStringArray(R.array.TypeAnnonces_title);
        String[] paSubtitle = getResources().getStringArray(R.array.TypeAnnonces_subtitle);

        for(int i  = 0 ; i < paTitle.length ; i++) {
            posterAnnonce.add(new PosterAnnonce(paTitle[i], paSubtitle[i], posterAnnonceIMG[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}