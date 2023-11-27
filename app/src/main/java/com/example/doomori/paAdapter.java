package com.example.doomori;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class paAdapter extends RecyclerView.Adapter<paAdapter.paViewHolder> {
    private ArrayList<PosterAnnonce> liste;
    private Context context;

    public paAdapter(ArrayList<PosterAnnonce> liste, Context context) {
        this.liste = liste;
        this.context = context;
    }

    @NonNull
    @Override
    public paViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.poster_annonce, parent, false);
        return new paViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull paViewHolder holder, int position) {
        PosterAnnonce pa = this.liste.get(position);
        holder.text1.setText((CharSequence) pa.getText1());
        holder.text2.setText((CharSequence) pa.getText2());
        Picasso.get().load("pa.getIcon()").into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return this.liste.size();
    }

    public static class paViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2;
        ImageView icon;

        public paViewHolder(View v) {
            super(v);

            icon = v.findViewById(R.id.paIMG);
            text1 = v.findViewById(R.id.paTXT1);
            text2 = v.findViewById(R.id.paTXT2);

        }
    }
}
