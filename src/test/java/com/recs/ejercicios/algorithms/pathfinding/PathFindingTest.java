package com.recs.ejercicios.algorithms.pathfinding;

import org.junit.jupiter.api.Test;

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

}