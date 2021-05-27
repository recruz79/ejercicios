package com.recs.algoritmos.fibonacci;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by recruz on 14/11/2016.
 */
@Component
class FibonacciApiImpl implements FibonacciApi{

    public FibonacciApiImpl() {}

    public List<Long> generateSequence(final long startingFrom, final long numberOfTerms) {
        ArrayList<Long> fibonacciList = new ArrayList();
        long startingNumber = startingFrom;
        long index = numberOfTerms;
        long secondNumber;
        long firstNumber;

        if(startingNumber > 0) {
            firstNumber = startingNumber - 1;
            fibonacciList.add(startingNumber);
        } else {
            firstNumber = 0L;
            secondNumber = 1L;
            fibonacciList.add(firstNumber);
            fibonacciList.add(secondNumber);
            startingNumber = secondNumber;
            index -= 1;
        }
        for (int i = 1; i < index; i++) {
            secondNumber = startingNumber + firstNumber;
            firstNumber = startingNumber;
            startingNumber = secondNumber;
            fibonacciList.add(secondNumber);
        }

        return fibonacciList;
    }

    public static int fibonacci(int num) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return ((int) ((Math.pow(phi, num) - Math.pow(1 - phi, num)) / Math
                .sqrt(5)));
    }

    public static int fibonacciRecursive(int num, String caseDef) {
        if (num == 1 || num == 2) {
            System.out.println("Stopping case is: " + num);
            return (1);
        }
        System.out.println("caseDef is:" + caseDef + ", num value is: " + num);
        int result1 = fibonacciRecursive(num - 1, " First Number ");
        int result2 = fibonacciRecursive(num - 2, " Second Number ");
        return (result1 + result2);
    }

    public static void main(String[] args) {
        int i = 6;
        System.out.println(fibonacciRecursive(i, " Starting "));
        Boolean b = true;
        boolean a = b;
        System.out.println("El valor de a es:  " + a);
    }

}
