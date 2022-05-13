package com.recs.ejercicios.primitives.readers;

import java.io.IOException;

/**
 * Created by recruz on 08/11/2016.
 * Practicar la lectura de codigo.
 *
 */
public class CharArray {

    public static void main(String[] args) {
        String wordString = "abcdefgh";
        int stringLength = wordString.length();
        int c = 0;
        char chars[] = new char[stringLength];
        wordString.getChars(0, stringLength, chars, 0);
        CharArrayReader reader1 = new CharArrayReader(c);
        CharArrayReader reader2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try {
            while ((i = reader1.read()) == (j = reader2.read())) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
