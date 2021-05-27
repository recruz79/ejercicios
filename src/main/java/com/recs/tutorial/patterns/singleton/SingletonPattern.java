package com.recs.tutorial.patterns.singleton;

/**
 * Created by recruz on 17/11/2016.
 */
public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
    }

    public static synchronized SingletonPattern getInstance() {
        if(instance == null) {
            instance = new SingletonPattern();
        } else {
            return instance;
        }
        return null;
    }
}
