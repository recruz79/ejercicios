package com.recs.ejercicios.algorithms.pathfinding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

class PathFindingTest {

    PathFinding pathFinding = new PathFinding();

    @Test
    public void testArcMinimunPath() {
        OrientedArc orientedArc = pathFinding.calculateShortestPath(25, 0, 18);
        System.out.println("The returned Arc has the shortest distance with : " + orientedArc.length + " steps, clockswise: " + orientedArc.clockwise);
    }

    @Test
    public void testArcMinimunPath2() {
        OrientedArc orientedArc = pathFinding.calculateShortestPath(25, 10, 15);
        System.out.println("The returned Arc has the shortest distance with : " + orientedArc.length + " steps, clockswise: " + orientedArc.clockwise);
    }

    @Test
    public void testCountTotalSteps() {
        String word = "ARCO".toLowerCase();
        List<Integer> listOfCharacters = word.chars().mapToObj(p -> p).collect(Collectors.toList());

        System.out.println(listOfCharacters);
        Integer start = 1;
        Integer circumference = 26;
        Integer totalSteps = 0;
        for(Integer characterd : listOfCharacters) {
            Integer positionedCharacter = (characterd - 96);
            OrientedArc orientedArc = pathFinding.calculateShortestPath(circumference, start, positionedCharacter);
            System.out.println("First step count : " + orientedArc.length + ", with values: start " + start + " character : " + positionedCharacter );
            totalSteps += orientedArc.length;
            start = positionedCharacter;
        }

        System.out.println("Total steps counted : " + totalSteps);
    }

}