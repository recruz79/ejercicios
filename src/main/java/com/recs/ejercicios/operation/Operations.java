package com.recs.ejercicios.operation;

public class Operations {

    private Integer multiply(Integer x, Integer y) {
        Integer result = 0;
        for(int index = 0; index != y; index++) {
            result += x;
        }

        return result;
    }

}
