package com.recs.ejercicios.patterns;

public class FactoryPattern {

    public static void main(String args[]) {
        Fruit fruit = FruitFactory.create("apple", "red", "crunchy");

    }
}