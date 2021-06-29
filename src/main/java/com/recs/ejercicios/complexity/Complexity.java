package com.recs.ejercicios.complexity;

public class Complexity {

    public static  void main(String args[]) {
        System.out.println(palindrome("peeep"));
    }

    /**
    Constant complexity O(1)
     */
    public boolean biggerValue(int value1, int value2) {
        return value1 > value2;
    }

    /**
    linear complexity O(n)
     */
    public static boolean palindrome(String value) {
        int length = value.length();
        for(int index = 0; index < length; index++) {
            if(value.charAt(index) != value.charAt(length - index - 1)) {
                return false;
            }
        }
        return true;
    }

}
