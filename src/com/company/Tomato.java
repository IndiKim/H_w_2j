package com.company;

import java.awt.*;

public class Tomato extends Vegetables{

    public Tomato(String name, String made, Color color) {
        super(name, made, color);
    }

    @Override
    public void print() {
        System.out.println("Tomato{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}


