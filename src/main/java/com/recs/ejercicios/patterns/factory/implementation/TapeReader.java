package com.recs.ejercicios.patterns.factory.implementation;

import com.recs.ejercicios.patterns.factory.interfaces.Reader;

/**
 * Created by recruz on 16/11/2016.
 */
public class TapeReader implements Reader {

    public void readerType() {
        System.out.println("Reader type is TAPE");
    }
}
