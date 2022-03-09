package com.recs.ejercicios.collections;

import java.util.*;

public class ListExamples {

    public Set listMergedArrays(Integer[] arrayOne, Integer[] arrayTwo) {
        System.out.println("Array a : " + Arrays.toString(arrayOne));
        System.out.println("Array b : " + Arrays.toString(arrayTwo));

        SortedSet orderedArray = new TreeSet();
        orderedArray.addAll(Arrays.asList(arrayOne));
        orderedArray.addAll(Arrays.asList(arrayTwo));
        System.out.println("The result arrays is : " + orderedArray.toString());
        return orderedArray;
    }

    private void listAggregation() {
        List<Integer> set1 = new ArrayList();
        List<Integer> set2 = new ArrayList();

        set1.addAll(Arrays.asList(1, 2, 3));
        set2.addAll(Arrays.asList(3, 5, 7));

        SortedSet<Integer> result = new TreeSet<>();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("result of aggregation is : " + result);
    }

    private void listIntersection() {
        SortedSet<Integer> result = new TreeSet<>();
        List<Integer> set3 = new ArrayList();
        List<Integer> set4 = new ArrayList();

        set3.addAll(Arrays.asList(10, 9, 8, 7));
        set4.addAll(Arrays.asList(2, 4, 6, 8));

        result = new TreeSet<>();
        result.addAll(set3);
        result.retainAll(set4);

        System.out.println("result of intersection is : " + result);
    }

    private void listDifference() {
        SortedSet<Integer> result = new TreeSet<>();;
        List<Integer> set5 = new ArrayList<>();
        List<Integer> set6 = new ArrayList<>();

        set5.addAll(Arrays.asList(5, 10, 15, 20));
        set6.addAll(Arrays.asList(0, 10, 20));

        result.addAll(set5);
        result.removeAll(set6);
        System.out.println("result of difference is : " + result);
    }

    private void listMapHandling() {
        Map<Integer, String> map = new HashMap();

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

    private void listTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Data1");
        treeMap.put(23, "Data2");
        treeMap.put(70, "Data3");
        treeMap.put(4, "Data4");
        treeMap.put(2, "Data5");

        String message = "hello";
        message.toUpperCase();

        for(Map.Entry entry : treeMap.entrySet() ) {
            System.out.print("key is: "+ entry.getKey() + " & Value is: ");
            System.out.println(entry.getValue());
        }
    }

    protected List<Integer> removeNumbersFromList(List<Integer> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer item = (Integer) it.next();
            if (item < 10 || item > 80) {
                it.remove();
            }
        }
        return list;
    }

}
