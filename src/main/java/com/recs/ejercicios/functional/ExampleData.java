package com.recs.ejercicios.functional;

import java.util.Arrays;
import java.util.List;

public class ExampleData {

    private static final List<PersonModel> PERSONS = Arrays.asList(
            new PersonModel("raul", 29, "masculino"),
            new PersonModel("ariel", 7, "masculino"),
            new PersonModel("pedro", 26, "masculino"),
            new PersonModel("romina", 16, "femenino"),
            new PersonModel("mauro", 21, "masculino"),
            new PersonModel("martin", 5, "masculino"),
            new PersonModel("rosalia", 25, "femenino"),
            new PersonModel("beatriz", 19, "femenino")
    );

    public static List<PersonModel> getPersons() {
        return PERSONS;
    }
}
