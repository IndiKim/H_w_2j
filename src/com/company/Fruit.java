package com.company;

import java.awt.*;
import java.util.PrimitiveIterator;

public abstract class Fruit implements Printable{

    private String name;
    private Color color;
    private String made;

    public Fruit(String name, Color color, String made) {
        this.name = name;
        this.color = color;
        this.made = made;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;

    }
}
