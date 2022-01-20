package com.recs.ejercicios.patterns;

class FruitFactory {

    static Fruit create(String name, String color, String firmness) {
        // Additional logic
        return new Fruit(name, color, firmness);
    }
}