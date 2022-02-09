package com.recs.ejercicios.functional;

public class PersonModel {

    String name;
    Integer age;
    String document;
    GenderType gender;

    public PersonModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonModel(String name, int age, GenderType genero, String document) {
        this.name = name;
        this.age = age;
        this.gender = genero;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public GenderType getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", document='" + document + '\'' +
                '}';
    }
}
