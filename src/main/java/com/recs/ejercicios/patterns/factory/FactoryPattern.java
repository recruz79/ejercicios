package com.recs.ejercicios.patterns.factory;

import com.recs.ejercicios.patterns.factory.interfaces.Reader;

/**
 * Created by recruz on 16/11/2016.
 */
public class FactoryPattern {

    /*
    Create a factory pattern
    - A main class which returns a created Object
     */
    public static void main(String args[]) {
        Reader reader = ReaderFactory.buildReader(1);
        reader.readerType();
        //System.out.println("Reader obtained: " + reader.readerType());
    }

}
