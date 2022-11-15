package com.company;

import java.awt.*;

public class Cucumber extends Vegetables{

    public Cucumber(String name, String made, Color color) {
        super(name, made, color);
    }

    @Override
    public void print() {
        System.out.println("Cucumber{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}

