package com.company;

import java.awt.*;

public class Apple extends Fruit{

    public Apple(String name, Color color, String made) {
        super(name, color, made);
    }

    @Override
    public void print() {
        System.out.println("Apple{" +
                "\nname=" + getName() +
                "\ncolor=" + getColor() +
                "\nmade=" + getMade()+
                '}');
    }
}
