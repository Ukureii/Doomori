package com.example.doomori.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doomori.R;
import com.example.doomori.objects.A_venir;
import com.example.doomori.adapters.rAdapter;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class AVenirFragment extends Fragment  implements rvInterface {

    private RecyclerView recyclerView;
    private ArrayList<A_venir> a_venirs = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a_venir, container, false);

        recyclerView = view.findViewById(R.id.RecyclerViewAVenir);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        setUpA_venir();

        rAdapter adapter = new rAdapter(a_venirs, this.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setUpA_venir() {
        String[] rTitle = getResources().getStringArray(R.array.Agenda_title);

        for(int i  = 0 ; i < rTitle.length ; i++) {
            a_venirs.add(new A_venir(rTitle[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
    }
}