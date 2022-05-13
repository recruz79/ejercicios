package com.recs.ejercicios.primitives.arrays;

import java.util.Arrays;

/**
 * Primitives facts:
 * Primitives can only be passed by value trough arguments not by reference since they are not objects.
 * Primitives can not be used as collections objects.
 */
public class ArrayExamples {

    public void arrayFixedSizeAssignment(char[] copyFrom, int from, int to) {
        char[] copyTo = Arrays.copyOfRange(copyFrom, from, to);
        System.out.println(new String(copyTo));
    }

    public void arrayCopy(char[] originalArray) {
        char[] copyTo = new char[7];
        System.arraycopy(originalArray, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

    public void arrayIteration(int[] anArray) {
        for (int index = 0; index < anArray.length; index++) {
            System.out.println("Element at index 0: "
                    + anArray[index]);
        }
    }

    public void arrayMultiDimDemo(double[][] grades) {
        double sum, average;
        for (int row = 0; row < 3; row++) {
            sum = 0;
            for (int column = 0; column < 3; column++) {
                sum += grades[row][column];
            }
            average = sum / 3;
            grades[row][3] = average;
        }
        System.out.println("You saved the following averages: ");
        for (int row = 0; row < 3; row++) {
            System.out.println("Student " + (row + 1) + ": " + grades[row][3]);
        }
    }

    /**
     * Write a program that prints the numbers from 1 to 100
     * but for multiples of three print 'Fizz' instead of the number
     * and for the multiples of five print 'Buzz', for numbers which are
     * multiple of both three and five print FizzBuzz and breaks loop and
     * print 'Puff' when '97' is found.
     */
    public void resolveFizzBuzz() {
        for (int index = 0; index <= 100; index++) {
            if (((index % 5) == 0) && ((index % 3) == 0)) {
                System.out.print("FizzBuzz : " + index + " ");
            } else {
                if ((index % 3) == 0) {
                    System.out.print("Fizz : " + index + " ");
                }
                if ((index % 5) == 0) {
                    System.out.println("Buzz : " + index + " ");
                }
                if (index == 91) {
                    System.out.println("Just ignore me, keep looping ");
                    continue;
                }
                if (index == 97) {
                    System.out.println("Puff : I will break loop");
                    break;
                }
            }
        }
    }

}
