package com.recs.tutorial.reflection;


import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by recruz on 15/11/2016.
 */
public class TestReflection {

    public static void main(String args[]) {

        //testReflection();
        System.out.println("*****************************************");
        //testReflectionCase2();
        System.out.println(evalPf("12 + 2"));
    }

    /**
     * read two classes and find the methods which have the same name method with the same signature.
     * WRONG WAY
     */
    public static void testReflection() {
        Martin martin = new Martin();
        Pedro pedro = new Pedro();

        Class martinClass = martin.getClass();
        Method[] martinMethods = martinClass.getMethods();

        Class pedroClass = pedro.getClass();
        Method[] pedroMethods = pedroClass.getMethods();


        List<Method> pedroMethodsList = Arrays.asList(pedroMethods);
        List<Method> martinMethodsList = Arrays.asList(martinMethods);

        // Metodo con FOR
        List<Method> resultSimilarMethods = new ArrayList<Method>();

        for(Method method : martinMethodsList) {
            for(Method innerMethod : pedroMethodsList) {
                if(method.getName().equals(innerMethod.getName()) &&
                        method.getParameterCount() == innerMethod.getParameterCount()) {
                        resultSimilarMethods.add(method);
                }
            }
        }

        System.out.println("resulting methods : " + resultSimilarMethods.size());
        for(Method method : resultSimilarMethods) {
            System.out.println("resulting methods : " + method.getName());
            System.out.println("resulting methods : " + method.getParameters());
            System.out.println("");
        }
    }

    static int evalPf(String str)
    {
        Scanner sc = new Scanner(str);
        Stack<Integer> stack = new Stack<Integer>();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                stack.push(sc.nextInt());
                continue;
            }
            int b = stack.pop();
            int a = stack.pop();
            char op = sc.next().charAt(0);
            if      (op == '+') stack.push(a + b);
            else if (op == '-') stack.push(a - b);
            else if (op == '*') stack.push(a * b);
            else if (op == '/') stack.push(a / b);
            else if (op == '%') stack.push(a % b);
        }

        sc.close();
        return stack.pop();
    }

    /**
     * this does not work since we required to do 2 for in the end
     */
    public static void testReflectionCase2() {
        Martin martin = new Martin();
        Pedro pedro = new Pedro();

        Class martinClass = martin.getClass();
        Method[] martinMethods = martinClass.getMethods();

        Class pedroClass = pedro.getClass();
        Method[] pedroMethods = pedroClass.getMethods();

        List<Method> pedroMethodsList = new ArrayList<Method>(Arrays.asList(pedroMethods));
        List<Method> martinMethodsList = new ArrayList<Method>(Arrays.asList(martinMethods));
        Map<String, Method> resultingMap = new HashMap();

        String methodKey;
        for(Method method : pedroMethodsList) {
            methodKey = method.getName() + method.getParameterCount();
            resultingMap.put(methodKey, method);
        }

        for(Method method : martinMethodsList) {
            methodKey = method.getName() + method.getParameterCount();
            resultingMap.put(methodKey, method);
        }

        for(Map.Entry<String, Method> entry : resultingMap.entrySet()) {
            System.out.println("resulting Key : " + entry.getKey());
            System.out.println("resulting Value : " + entry.getValue());
            System.out.println("");
        }
    }
}
