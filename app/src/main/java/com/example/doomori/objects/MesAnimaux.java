package com.example.doomori.objects;

import android.graphics.drawable.Icon;
import android.widget.ImageView;

public class MesAnimaux {
    protected String name, race, age;
    protected int pic;

    public MesAnimaux(String name, String race, String age, int pic) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.pic = pic;
    }
    public MesAnimaux(String name, String race, String age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
