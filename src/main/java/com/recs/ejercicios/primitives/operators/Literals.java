package com.recs.ejercicios.primitives.operators;

/**
 * Created by recruz on 08/11/2016.
 * Los literales en Java tienen una cache que los mantiene con vida luego de su primer uso
 * por eso pueden darse problemas al reutilizarlos luego cuando se comparan con objetos creados con ellos.
 */
public class Literals {

    public static void main(String args[]) {

        String objetoLiteral = "Pablo";
        String objetoLiteral2 = "Pablo";
        String objetoNoLiteral = new String("Pablo");


        if(objetoLiteral == objetoLiteral2) {
            System.out.println("true 0, since two objects has the reference of a literal they will the same object");
        }

        if(objetoLiteral2 == objetoNoLiteral) {
            System.out.println("true 3, Un literal que se iguala contra un nuevo string creado de ese literal son objetos diferentes.");
        }

        if(objetoLiteral == "Pablo") {
            System.out.println("true 1, Los literales tienen cache asi que si se los reutiliza se tiene el mismo objeto");
        }

        if(objetoLiteral.equals("Pablo")) {
            System.out.println("true 2, Esta siempre da true, sea literal o no es una regla basica de Java, comprando 2 string por su metodo equals.");
        }
    }
}
