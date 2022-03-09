package com.recs.ejercicios.functional;

import java.util.Arrays;
import java.util.List;

public class ExampleData {

    private static final List<PersonModel> PERSONS = Arrays.asList(
            new PersonModel("raul", 29, GenderType.MASCULINO, "123"),
            new PersonModel("ariel", 7, GenderType.MASCULINO, "1234"),
            new PersonModel("pedro", 26, GenderType.MASCULINO, "12345"),
            new PersonModel("romina", 16, GenderType.FEMENINO, "123456"),
            new PersonModel("mauro", 21, GenderType.MASCULINO, "1234567"),
            new PersonModel("martin", 5, GenderType.MASCULINO, "1234567"),
            new PersonModel("rosalia", 25, GenderType.FEMENINO, "12345678"),
            new PersonModel("beatriz", 19, GenderType.FEMENINO, "123456789")
    );

    public static List<PersonModel> getPersons() {
        return PERSONS;
    }
}

