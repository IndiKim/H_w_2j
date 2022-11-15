package com.company;

import java.awt.*;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Vegetables Cucumber = createObject("Cucumber");
        System.out.println(Cucumber);
        Cucumber.print();
        System.out.println();
        Vegetables Tomato = createObject("Tomato");
        System.out.println(Tomato);
        Tomato.print();
        System.out.println();
        Vegetables Potatoes = createObject("Potatoes");
        System.out.println(Potatoes);
        Potatoes.print();
        System.out.println();


    }private static Vegetables createObject(String className){
        switch (className) {
            case "Cucumber":
                return new Cucumber("Огурцы", "China", Color.GREEN);
            case "Tomato":
                return new Tomato("Помидор", "Alay", Color.RED );
            default:
                return new Potatoes("Картошка", "Chon Alay", Color.BLACK);
        }
    }
}
