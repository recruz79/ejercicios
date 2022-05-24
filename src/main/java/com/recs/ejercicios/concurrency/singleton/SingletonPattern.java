package com.recs.ejercicios.concurrency.singleton;

/*
    thread scheduler pauses threads in order to maintain an order in the execution
    If two threads are accesing at same time it may raise a race condition issue
    synchronized :

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
