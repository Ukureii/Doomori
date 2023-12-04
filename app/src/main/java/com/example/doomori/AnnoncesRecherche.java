package com.example.doomori;

import android.graphics.drawable.Icon;
import android.widget.ImageView;

public class AnnoncesRecherche {
    protected String title, subtitle, prix, txt;
    protected int icon;

    public AnnoncesRecherche(String title, String subtitle, String prix, String txt, int icon) {
        this.title = title;
        this.subtitle = subtitle;
        this.prix = prix;
        this.txt = txt;
        this.icon = icon;
    }
    public AnnoncesRecherche(String title, String subtitle, String prix, String txt) {
        this.title = title;
        this.subtitle = subtitle;
        this.prix = prix;
        this.txt = txt;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public String getPrix() {
        return prix;
    }
    public void setPrix(String prix) {
        this.prix = prix;
    }
    public String getTxt() {
        return txt;
    }
    public void setTxt(String txt) {
        this.txt = txt;
    }
    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }
}
