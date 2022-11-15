package com.company;

import java.awt.*;

public class Peach extends Fruit{

    public Peach(String name, Color color, String made) {
        super(name, color, made);
    }

    @Override
    public void print() {
        System.out.println("Peach{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}



