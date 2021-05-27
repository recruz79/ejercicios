package com.recs.tutorial.patterns.strategy;

/**
 * Created by recruz on 17/11/2016.
 */
public class StrategyPattern {
    public static void main(String args[]) {
        //Usamos la estrategia A
        Strategy estrategia_inicial = new StrategyA();
        Context context = new Context(estrategia_inicial);
        context.some_method();

        //Decidimos usar la estrategia B
        Strategy estrategia2 = new StrategyB();
        context.setStrategy(estrategia2);
        context.some_method();

        //Finalmente,usamos de nuevo la estrategia A
        context.setStrategy(estrategia_inicial);
        context.some_method();

        /** Salida:
         * Estrategia A
         * Estrategia B
         * Estrategia A
         **/
    }
}
