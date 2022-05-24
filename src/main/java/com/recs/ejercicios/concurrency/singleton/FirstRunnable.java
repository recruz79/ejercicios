package com.recs.ejercicios.concurrency.singleton;

public class FirstRunnable {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");

        t.start(); // I am running in My Thread
        // t.run(); // I am running in Main NO NO NO this does not create a new thread, it will run the runnable inside the thread of main
    }
}


