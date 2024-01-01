package com.example.doomori.frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.DevenirGardienActivity;
import com.example.doomori.PosterAnnonceActivity;
import com.example.doomori.objects.PosterAnnonce;
import com.example.doomori.R;
import com.example.doomori.adapters.paAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class AnnonceFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private CardView cvDG;
    private ArrayList<PosterAnnonce> posterAnnonce = new ArrayList<>();
    private int[] posterAnnonceIMG = {R.drawable.dog_bowl, R.drawable.two_paws, R.drawable.suitcase};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_magnifying, container, false);

        recyclerView = view.findViewById(R.id.paRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpPosterAnnonce();

        paAdapter adapter = new paAdapter(posterAnnonce, this.getContext(), this, R.layout.poster_annonce, R.id.iconPa, R.id.titlePa, R.id.subtitlePa, R.id.descPa);

        cvDG = view.findViewById(R.id.btDevenirGardien);
        cvDG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DevenirGardienActivity.class);
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }
    private void setUpPosterAnnonce() {
        String[] paTitle = getResources().getStringArray(R.array.TypeAnnonces_title);
        String[] paSubtitle = getResources().getStringArray(R.array.TypeAnnonces_subtitle);
        String[] paDesc = getResources().getStringArray(R.array.TypeAnnonces_desc);

        for(int i  = 0 ; i < paTitle.length ; i++) {
            posterAnnonce.add(new PosterAnnonce(paTitle[i], paSubtitle[i], paDesc[i], posterAnnonceIMG[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getContext(), PosterAnnonceActivity.class);
        intent.putExtra("Title", posterAnnonce.get(position).getTitle());
        //intent.putExtra("IMG", posterAnnonce.get(position).getIcon());
        startActivity(intent);
    }
}