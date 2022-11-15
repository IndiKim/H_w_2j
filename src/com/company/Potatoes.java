package com.company;

import java.awt.*;

public class Potatoes extends Vegetables{

    public Potatoes(String name, String made, Color color) {
        super(name, made, color);
    }

    @Override
    public void print() {
        System.out.println("Potatoes{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}


