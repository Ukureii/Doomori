package com.example.doomori;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class arAdapter extends RecyclerView.Adapter<arAdapter.arViewHolder> {
    private ArrayList<AnnoncesRecherche> liste;
    private Context context;

    public arAdapter(ArrayList<AnnoncesRecherche> liste, Context context) {
        this.liste = liste;
        this.context = context;
    }

    @NonNull
    @Override
    public arViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.annonces, parent, false);
        return new arViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull arViewHolder holder, int position) {
        AnnoncesRecherche ar = this.liste.get(position);
        holder.text1.setText(ar.getTitle());
        holder.text2.setText(ar.getSubtitle());
        holder.text3.setText(ar.getPrix());
        holder.text4.setText(ar.getTxt());
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public static class arViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2, text3, text4;

        public arViewHolder(View v) {
            super(v);
            text1 = v.findViewById(R.id.titleAr);
            text2 = v.findViewById(R.id.subtitleAr);
            text3 = v.findViewById(R.id.prixAr);
            text4 = v.findViewById(R.id.txtAr);

        }
    }
}
