package com.company;

import java.awt.*;

public class Pear extends Fruit {

    public Pear(String name, Color color, String made) {
        super(name, color, made);
    }

    @Override
    public void print() {
        System.out.println("Pear{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}

