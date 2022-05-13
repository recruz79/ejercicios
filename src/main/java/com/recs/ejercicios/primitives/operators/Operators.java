package com.recs.ejercicios.primitives.operators;

/**
 * Created by recruz on 14/11/2016.
 */
public class Operators {

    public static void main(String[] args){
        continueLoop();
        //conditionalsTest();
        //ternaryOperator();
    }

    public static void conditionalsTest() {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }

        if((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }
    }

    public static void ternaryOperator(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }

    public static void continueLoop() {
        for(int index = 0; index <= 10; index++) {
            if(index == 5) {
                continue;
            }

            if(index == 7) {
                break;
            }

            System.out.println("Index value is : " + index);
        }
    }
}
