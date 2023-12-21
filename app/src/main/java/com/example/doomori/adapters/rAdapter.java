package com.example.doomori.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doomori.objects.A_venir;
import com.example.doomori.R;

import java.util.ArrayList;

public class rAdapter extends RecyclerView.Adapter<rAdapter.rViewHolder> {
    private ArrayList<A_venir> liste;
    private Context context;

    public rAdapter(ArrayList<A_venir> liste, Context context) {
        this.liste = liste;
        this.context = context;
    }

    @NonNull
    @Override
    public rViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.a_venir, parent, false);
        return new rViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull rViewHolder holder, int position) {
        A_venir r = this.liste.get(position);
        holder.text1.setText(r.getTitle());
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public static class rViewHolder extends RecyclerView.ViewHolder {
        TextView text1;

        public rViewHolder(View v) {
            super(v);

            text1 = v.findViewById(R.id.titreAV);

        }
    }
}
