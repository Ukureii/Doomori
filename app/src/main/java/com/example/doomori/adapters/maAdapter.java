package com.example.doomori.adapters;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doomori.MyAnimalsActivity;
import com.example.doomori.objects.MesAnimaux;
import com.example.doomori.R;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class maAdapter extends RecyclerView.Adapter<maAdapter.maViewHolder> {
    private ArrayList<MesAnimaux> liste;
    private static Context context;

    public maAdapter(ArrayList<MesAnimaux> liste, Context context) {
        this.liste = liste;
        this.context = context;
    }

    @NonNull
    @Override
    public maViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mes_animaux, parent, false);

        return new maViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull maViewHolder holder, int position) {
        MesAnimaux ma = this.liste.get(position);
        holder.text1.setText(ma.getName());
        holder.text2.setText(ma.getRace());
        holder.text3.setText(ma.getAge());
        holder.icon.setImageResource(ma.getPic());
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public static class maViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2, text3;
        ImageView icon;

        public maViewHolder(View v) {
            super(v);

            icon = v.findViewById(R.id.picMa);
            text1 = v.findViewById(R.id.nameMa);
            text2 = v.findViewById(R.id.raceMa);
            text3 = v.findViewById(R.id.ageMa);

        }
    }
}
