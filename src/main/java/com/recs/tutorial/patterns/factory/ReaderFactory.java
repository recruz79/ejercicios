package com.recs.tutorial.patterns.factory;

import com.recs.tutorial.patterns.factory.implementation.DiskReader;
import com.recs.tutorial.patterns.factory.implementation.TapeReader;
import com.recs.tutorial.patterns.factory.implementation.UsbReader;
import com.recs.tutorial.patterns.factory.interfaces.Reader;

/**
 * Created by recruz on 16/11/2016.
 */
public class ReaderFactory {

    public static Reader buildReader(int method) {
        if(method == 1) {
            return new DiskReader();
        }

        if(method == 2) {
            return new TapeReader();
        }

        if(method == 3) {
            return new UsbReader();
        }

        return null;
    }

}
