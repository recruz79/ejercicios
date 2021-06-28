package com.recs.ejercicios.postfix;

// CSE 143, Summer 2012
// This program evaluates "postfix" expressions (also called "Reverse Polish
// Notation"), which are mathematical expressions but with the operators placed
// after operands instead of between.
// For example: 1 + 2 * 3 + 4  is written as 1 2 3 * + 4 +

import java.util.*;

public class Postfix {
    public static void main(String[] args) {
        // 1 + 2
        System.out.println(postfixEvaluate("1 2 +"));               // 3
        // 1 + 2 * 3 + 4
        System.out.println(postfixEvaluate("1 2 3 * + 4 +"));       // 11
        // 5 + 4 * 2 - 7
        System.out.println(postfixEvaluate("5 2 4 * + 7 -"));       // 6
        // 3 + 2 + 5 * 4
        System.out.println(postfixEvaluate("2 3 + 4 5 * +"));       // 25

        System.out.println(postfixEvaluate("8 5 * 7 4 2 + * +"));   // 82
        System.out.println(postfixEvaluate("6 8 2 / 1 - *"));       // 18
    }

    // Evaluates the given postfix expression string and returns the result.
    // Precondition: expression consists only of integers, +-*/, and spaces in
    //               proper postfix format such as "2 3 - 4 *"
    public static int postfixEvaluate(String exp) {
        Stack<Integer> s = new Stack<Integer> ();
        Scanner tokens = new Scanner(exp);

        while (tokens.hasNext()) {
            if (tokens.hasNextInt()) {
                s.push(tokens.nextInt());
            } else {
                int num2 = s.pop();
                int num1 = s.pop();
                String op = tokens.next();

                if (op.equals("+")) {
                    s.push(num1 + num2);
                } else if (op.equals("-")) {
                    s.push(num1 - num2);
                } else if (op.equals("*")) {
                    s.push(num1 * num2);
                } else {
                    s.push(num1 / num2);
                }

                //  "+", "-", "*", "/"
            }
        }
        return s.pop();
    }
}

