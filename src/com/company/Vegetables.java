package com.company;

import java.awt.*;

public abstract class Vegetables implements Printable{

    private String name;
    private String made;
    private Color color;

    public Vegetables(String name, String made, Color color) {
        this.name = name;
        this.made = made;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
