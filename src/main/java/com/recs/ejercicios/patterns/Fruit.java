package com.recs.ejercicios.patterns;

public class Fruit {

    String name;
    String color;
    String firmness;

    public Fruit(String name, String color, String firmness) {
        this.name = name;
        this.color = color;
        this.firmness = firmness;
    }

    public Fruit(FruitBuilder fruitBuilder) {
        this.name = fruitBuilder.name;
        this.color = fruitBuilder.color;
        this.firmness = fruitBuilder.firmness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFirmness() {
        return firmness;
    }

    public void setFirmness(String firmness) {
        this.firmness = firmness;
    }

    public static class FruitBuilder {
        String name;
        String color;
        String firmness;

        FruitBuilder setName(String name) {
            this.name = name;
            return this;
        }

        FruitBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        FruitBuilder setFirmness(String firmness) {
            this.firmness = firmness;
            return this;
        }

        Fruit build() {
            return new Fruit(this);
        }
    }
}
