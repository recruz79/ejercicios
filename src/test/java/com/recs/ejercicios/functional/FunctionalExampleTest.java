package com.recs.ejercicios.functional;

import org.junit.jupiter.api.Test;

class FunctionalExampleTest {

    FunctionalExample functionalExample = new FunctionalExample();

    @Test
    public void iterateListForEach() {
        functionalExample.iterateListForEach();
    }

    @Test
    public void filtrarPersonasPorMayoresFemenino() {
        functionalExample.filtrarPersonasPorMayoresFemenino(ExampleData.getPersons());
    }

    @Test
    public void findPersonByName() {
        functionalExample.findPersonByName("rosalia", ExampleData.getPersons());
    }

    @Test
    public void findPersonByDocument() {
        functionalExample.findPersonByDocument("123456", ExampleData.getPersons());
    }

    @Test
    public void findPersonByDocumentAngeGender() {
        functionalExample.findPersonByDocumentAngeGender("1234567", "masculino", ExampleData.getPersons());
    }
}