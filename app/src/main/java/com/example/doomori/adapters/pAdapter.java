package com.example.doomori.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doomori.objects.MesAnimaux;
import com.example.doomori.R;
import com.example.doomori.objects.Reglage;

import java.util.ArrayList;

public class pAdapter extends RecyclerView.Adapter<pAdapter.pViewHolder> {
    private ArrayList<Reglage> liste;
    private Context context;

    public pAdapter(ArrayList<Reglage> liste, Context context) {
        this.liste = liste;
        this.context = context;
    }

    @NonNull
    @Override
    public pViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile, parent, false);
        return new pViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull pViewHolder holder, int position) {
        Reglage r = this.liste.get(position);
        holder.text1.setText(r.getTitle());
        holder.icon.setImageResource(r.getIcon());
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public static class pViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        ImageView icon;

        public pViewHolder(View v) {
            super(v);
            text1 = v.findViewById(R.id.titreR);
            icon = v.findViewById(R.id.iconR);
        }
    }
}
