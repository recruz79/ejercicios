package com.recs.ejercicios.streams;


import com.recs.ejercicios.streams.model.Bar;
import com.recs.ejercicios.streams.model.Foo;
import com.recs.ejercicios.streams.model.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
1.- Streams in JAVA 8 are created to make iterative operations, they can be lineal or parallel operations
2.- Streams are monads that play a big part in functional programming
3.- You must understand the reduce, collect and flatMap in detail
4.- Streams operations are intermediate or terminal check: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
    3.1.- filter, map and sorted(stateful operation) are intermediate since they return a stream
    3.2.- forEach, sum, average, collect are terminal operations once they finish the stream is closed
5.- Streams has a lot of functionalities, we should check each of them to understand it correctly
6.- flatMap and Collect understand them deeply
7.- You need to understand how th manage the flow cycle:
    7.1.- Stop iteration by logical checking (this one can be hard)
    7.2.- Stop iteration by numeric interval
    7.3.-
8.- Streams no funciona bien para iteraciones que usen una logica que necesita no procesar todos los items, nos obliga a hacer cosas irregulares
9.- Optional its a patern to avoid null exception, instead of null you receive an optional Class which wraps the real value so it can verified
    the problem of options is the nested invocation, need to understand how this works.
10.- Streams are not only a new feature it represents a new way of programming, take it easy and get it slowly
11.- Para que sirve peek -> sirve para ver todos los casos que pasan por el sin poner filtros o hacer un cambio como lo hacen sus allegados
12.- Para que sirve flatMap -> Crea un stream a partir de un segundo item muy util para procesar todos los childs
13.- Para que sirve Map -> Lee cada item y realiza algun proceso sobre el y luego lo devuelve
14.- Para que sirve filter -> Procesa un item y dependiendo de lo que se procese si devuelve false el item sera eliminado de la lista inicial
15.- Usar predicados en streams mejora la lectura del proceso dentro de una clase agregar un metodo expresivo para ser invocado desde el stream


*/
public class StreamTest {

    static List<Person> persons =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));

    public static void main(String args[]) {
        printEndOfLine();
        singleStream();
        printEndOfLine();
        noTerminalOperation();
        printEndOfLine();
        processingOrder();
        printEndOfLine();
        sortedFiltered();
        printEndOfLine();
        findPersonsByAge();
        printEndOfLine();
        groupPersonsByAge();
        printEndOfLine();
        flatMapExample();
        printEndOfLine();
        printLengthOfList();
    }

    public static void singleStream() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    // With no terminal operation the intermediate operation will never run
    public static void noTerminalOperation() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });
        //.forEach(s -> System.out.println("forEach: " + s));
    }

    // By changing the processing order the efficiency can vary
    public static void processingOrder() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

        // map:      d2
        // anyMatch: D2
        // map:      a2
        // anyMatch: A2
    }

    // Sorting can be more efficiente if we filter objects first and then sort not backwards
    public static void sortedFiltered() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        // filter:  d2
        // filter:  a2
        // filter:  b1
        // filter:  b3
        // filter:  c
        // map:     a2
        // forEach: A2
    }

    public static void findPersonsByAge() {

        String phrase = persons
                .stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);
        // In Germany Max and Peter and Pamela are of legal age.
    }

    public static void groupPersonsByAge() {
        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        // age 18: [Max]
        // age 23: [Peter, Pamela]
        // age 12: [David]
    }

    public static void flatMapExample() {
        IntStream.range(1, 4)
                .mapToObj(i -> new Foo("Foo" + i))
                .peek(f -> IntStream.range(1, 4)
                        .mapToObj(i -> new Bar("Bar" + i + " <- " + f.name))
                        .forEach(f.bars::add))
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));
    }

    public static void printEndOfLine() {
        System.out.println("************************************************************************************************************");
    }

    // Hacer una iteration basada en el length de un array
    public static void printLengthOfList() {
        /**
         * Learn how to use Optional!!
         * stream.of(I), list.asStream()
         * filter, sorted, map, anyMatch, noneMatch, findFirst, ifPresent, average, max, mapToInt, mapToObj,
         * intStream.range, mapToInt, Collectors... groupingBy, averagingInt, summarizingInt, joining, toMap, .of()
         * peek, reduce
         * forEach, flatMap, collect
         * get
         */
        System.out.println("Printing value of: " + "");
        // Ejercicio imprimir 10 veces un hola mundo con streams
        IntStream.range(1, 10).forEach(p -> System.out.println("Hola mundo! " + p));
        LongStream.rangeClosed(1, 10).forEach(p -> System.out.println("Hola mundo! ahora con LONGS! " + p));
        // Ejercicio imprimir un lista de strings, ordenarlo y filtrar la letra C
        printEndOfLine();
        List<String> myList = Arrays.asList("Ac", "aQ", "PP", "CA", "ZE", "wQ", "Pk", "cC");
        myList.stream().filter(p -> !p.contains("c") && !p.contains("C"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(p -> System.out.println(p));
        printEndOfLine();
        // Ejercicio leer un stream y terminarla si se encuentra un item null
        // Va contra la naturaleza de los streams terminar un flujo sin leer todos los items, pero se puede lograr con un
        // Leer todos los items hasta encontrar un null y quedar ahi... se puede?!?!?!
        List<String> myList2 = Arrays.asList("Ac", "aQ", "PP", "CA", "ZE", "wQ", null, "Pk", "cC");
        String result = myList2.stream()
                //.peek(p -> System.out.println("the value found is: " + p))
                //.map(Optional::ofNullable)
                .filter(Objects::nonNull)
                .findFirst().get();

        System.out.println("The result is: " + result);
    }
}