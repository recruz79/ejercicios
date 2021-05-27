package com.recs.algoritmos.collections;

import java.util.*;

/**
 * Created by recruz on 09/01/2017.
 */
public class CollectionsChallenge {

    /**
     * Given two sorted arrays, write a function that will merge them into a single sorted array
     * for example:
     * a = [1, 5 ,9]
     * b = [3, 4, 5, 10]
     * merged(a,b) == [1, 3, 4, 5, 9, 10]
     */
    public void mergeSortedArrays(Integer[] arrayOne, Integer[] arrayTwo) {
        System.out.println("Array a : " + Arrays.toString(arrayOne));
        System.out.println("Array b : " + Arrays.toString(arrayTwo));

        // SortedSet is an interface to use it we have to use TreeSet.
        SortedSet orderedArray = new TreeSet();
        orderedArray.addAll(Arrays.asList(arrayOne));
        orderedArray.addAll(Arrays.asList(arrayTwo));
        System.out.println("The result arrays is : " + orderedArray.toString());
    }



    /*
     *  Implement integer-integer multiplication without using the multiply operator.
     */
    private static Integer multiply(Integer x, Integer y) {
        Integer result = 0;
        for(int index = 0; index != y; index++) {
            result += x;
        }

        return result;
    }

    /*
     *  Order Map with duplicated values
     */
    private static void mapOrderWithDuplicates() {

        // Union
        List<Integer> set1 = new ArrayList<Integer>();
        List<Integer> set2 = new ArrayList<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(5);
        set2.add(7);

        SortedSet<Integer> result = new TreeSet<Integer>();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("result is : " + result.toString());

        // Intersection
        List<Integer> set3 = new ArrayList<Integer>();
        List<Integer> set4 = new ArrayList<Integer>();

        set3.add(10);
        set3.add(9);
        set3.add(8);
        set3.add(7);

        set4.add(2);
        set4.add(4);
        set4.add(6);
        set4.add(8);

        result = new TreeSet<Integer>();

        result.addAll(set3);
        result.retainAll(set4);

        System.out.println("result of intersection is : " + result);

        // Difference
        List<Integer> set5 = new ArrayList<Integer>();
        List<Integer> set6 = new ArrayList<Integer>();

        set5.add(5);
        set5.add(10);
        set5.add(15);
        set5.add(20);

        set6.add(0);
        set6.add(10);
        set6.add(20);

        result = new TreeSet<Integer>();

        result.addAll(set5);
        result.removeAll(set6);
        System.out.println("result of intersection is : " + result);
    }

    private static void mapOrderExercise() {
        Map<Integer, String> map = new HashMap<Integer, String>();


        map.put(1, "Pedro");
        map.put(2, "Juan");
        map.put(3, "Alberto");
        map.put(4, "Jose");

        String value = map.get(1);
        System.out.println("the value 1 is : " + value);

        int key = 4;
        if(map.containsKey(key)) {
            System.out.println("the key is contained in the map and the value is : " + map.get(key));
        }
    }

    private static void treeMapExample() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Data1");
        treeMap.put(23, "Data2");
        treeMap.put(70, "Data3");
        treeMap.put(4, "Data4");
        treeMap.put(2, "Data5");

        String message = "hello";
        StringBuilder str = new StringBuilder(message);
        message.toUpperCase();

        for(Map.Entry entry : treeMap.entrySet() ) {
            System.out.print("key is: "+ entry.getKey() + " & Value is: ");
            System.out.println(entry.getValue());
        }
    }

}
