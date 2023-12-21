package com.example.doomori.objects;

import android.graphics.drawable.Icon;
import android.widget.ImageView;

public class PosterAnnonce {
    protected String title, subtitle;
    protected int icon;

    public PosterAnnonce(String title, String subtitle, int icon) {
        this.title = title;
        this.subtitle = subtitle;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String newSubtitle) {
        this.subtitle = newSubtitle;
    }
    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }
}
