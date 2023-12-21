package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.R;
import com.example.doomori.adapters.pAdapter;
import com.example.doomori.objects.Reglage;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class ProfileFragment extends Fragment implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<Reglage> reglages = new ArrayList<>();
    private int[] profileIMG = {R.drawable.user_id, R.drawable.paw_outlined, R.drawable.credit_card, R.drawable.notification, R.drawable.vacation};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.RecyclerViewProfile);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpReglages();

        pAdapter adapter = new pAdapter(reglages, this.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
    private void setUpReglages() {
        String[] rTitle = getResources().getStringArray(R.array.Profile_title);

        for(int i  = 0 ; i < rTitle.length ; i++) {
            reglages.add(new Reglage(rTitle[i], profileIMG[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}