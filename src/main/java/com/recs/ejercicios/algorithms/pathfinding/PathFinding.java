package com.recs.ejercicios.algorithms.pathfinding;

public class PathFinding {

    protected OrientedArc calculateShortestPath(int circunferemce, int start, int end) {
        int distance = start - end;
        OrientedArc orientedArc1 = new OrientedArc(Math.abs(distance), distance >= 0 ? true : false);
        OrientedArc orientedArc2= new OrientedArc(circunferemce - Math.abs(distance), !orientedArc1.clockwise);

        return orientedArc1.length <= orientedArc2.length ? orientedArc1 : orientedArc2;
    }

}
