package com.recs.ejercicios.patterns.strategy;

/**
 * Created by recruz on 17/11/2016.
 */
public class Context {

    Strategy c;

    public Context(Strategy c) {
            this.c = c;
    }

    public void setStrategy(Strategy c) {
        this.c = c;
    }

    //Método de estrategia 'c'
    public void some_method() {
        c.behaviour();
    }

}
