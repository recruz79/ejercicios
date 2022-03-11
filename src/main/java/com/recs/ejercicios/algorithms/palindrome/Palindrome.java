package com.recs.ejercicios.algorithms.palindrome;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by recruz on 17/11/2016.
 */
public class Palindrome {

    public static void main(String args[]) {
        System.out.println("Finding all palindromes in a given string : ");
        subPal("abcacbbbca");

    }


    private static void subPal(String str) {
        String s1 = "";
        int stringLength = str.length();
        Set<String> palindromeArray = new HashSet<String>();
        System.out.println("Given string : " + str);
        System.out.println("******** Ignoring single character as substring palindrome");
        for (int index1 = 2; index1 <= stringLength; index1++) {
            for (int index2 = 0; index2 <= stringLength; index2++) {
                int k = index1 + index2 - 1;
                if (k >= stringLength) {
                    continue;
                }
                s1 = str.substring(index2, index1 + index2);
                if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                    palindromeArray.add(s1);
                }
            }

        }
        System.out.println(palindromeArray);
        for (String s : palindromeArray)
            System.out.println(s + " - is a palindrome string.");
        System.out.println("The no.of substring that are palindrome : "
                + palindromeArray.size());
    }

    /*
 * Given a string of finite length, implement a function that returns the longest substring that is a palindrome.
 * For example func(“bubba ho-tep”) would return “bub”, and func(“xx123454321zz”) would return “123454321”.
 * Coding Challenge
 */
    public void findBiggestPalindrome() {
        StringBuilder messageTest = new StringBuilder("bubba ho-tep");
        Set<String> palindromeArray = new HashSet<String>();

        for(int index = 0; index < (messageTest.length() - 2); index++) {
            System.out.println("index : " + index);
            System.out.println(messageTest.substring(index,index + 1));
            if(messageTest.charAt(index) == messageTest.charAt(index + 2)) {
                System.out.println("palindrome found : " + messageTest.substring(index, index + 3));
                //String st1;
                //palindromeArray.add(str1);
            }
        }
    }
}
