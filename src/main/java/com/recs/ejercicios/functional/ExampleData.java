package com.recs.ejercicios.functional;

import java.util.Arrays;
import java.util.List;

public class ExampleData {

    private static final List<PersonModel> PERSONS = Arrays.asList(
            new PersonModel("raul", 29, "masculino", "123"),
            new PersonModel("ariel", 7, "masculino", "1234"),
            new PersonModel("pedro", 26, "masculino", "12345"),
            new PersonModel("romina", 16, "femenino", "123456"),
            new PersonModel("mauro", 21, "masculino", "1234567"),
            new PersonModel("martin", 5, "masculino", "1234567"),
            new PersonModel("rosalia", 25, "femenino", "12345678"),
            new PersonModel("beatriz", 19, "femenino", "123456789")
    );

    public static List<PersonModel> getPersons() {
        return PERSONS;
    }
}
