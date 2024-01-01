package com.example.doomori.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doomori.objects.PosterAnnonce;
import com.example.doomori.R;
import com.example.doomori.rvInterface;

import java.util.ArrayList;

public class paAdapter extends RecyclerView.Adapter<paAdapter.paViewHolder> {
    private final rvInterface rvInterface;
    private ArrayList<PosterAnnonce> liste;
    private Context context;
    private int layoutId, iconId, titleId, subtitleId, descId;

    public paAdapter(ArrayList<PosterAnnonce> liste, Context context, rvInterface rvInterface, int layoutId, int iconId, int titleId, int subtitleId, int descId) {
        this.liste = liste;
        this.context = context;
        this.rvInterface = rvInterface;
        this.layoutId = layoutId;
        this.iconId = iconId;
        this.titleId = titleId;
        this.subtitleId = subtitleId;
        this.descId = descId;
    }

    @NonNull
    @Override
    public paViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        return new paViewHolder(v, rvInterface, iconId, titleId, subtitleId, descId);
    }

    @Override
    public void onBindViewHolder(@NonNull paViewHolder holder, int position) {
        PosterAnnonce pa = this.liste.get(position);

        if (pa != null) {
            holder.title.setText(pa.getTitle());
            holder.subtitle.setText(pa.getSubtitle());
            holder.desc.setText(pa.getDesc());
            holder.icon.setImageResource(pa.getIcon());
        }
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public static class paViewHolder extends RecyclerView.ViewHolder {
        TextView title, subtitle, desc;
        ImageView icon;
        public paViewHolder(View v, rvInterface rvInterface, int iconId, int titleId, int subtitleId, int descId) {
            super(v);

            icon = v.findViewById(iconId);
            title = v.findViewById(titleId);
            subtitle = v.findViewById(subtitleId);
            desc = v.findViewById(descId);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (rvInterface != null) {
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION) {
                            rvInterface.onItemClick(pos);
                        }
                    }
                }
            });

        }
    }
}
