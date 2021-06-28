package com.recs.tutorial.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by recruz on 09/01/2017.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ArrayExamplesTest {

    ArrayExamples arrayExamples;

    @BeforeEach
    public void setUp() {
        arrayExamples = new ArrayExamples();
    }

    @Test
    public void givenArrayWhenArrayIsLoadedThenArrayIsIterated() {
        int[] anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        arrayExamples.arrayIteration(anArray);
    }

    @Test
    public void givenArrayWhenArrayReadedThenSubarrayIsReturned() {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        int from = 2;
        int to = 9;
        arrayExamples.arrayFixedSizeAssignment(copyFrom, from, to);
    }

    @Test
    public void givenMatrixWhenReadedThenMatrixSumIsReturned() {
        double[][] grades = new double [3][4] ;
        for(int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for(int columnIndex = 0; columnIndex < 4; columnIndex++) {
                grades[rowIndex][columnIndex] = columnIndex;
            }
        }

        arrayExamples.arrayMultiDimDemo(grades);
    }

    @Test
    public void givenArrayWhenReadThenCopyIsCreated() {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        arrayExamples.arrayCopy(copyFrom);
    }

    @Test
    public void givenExerciseWhenProcessedThenResolutionIsDone() {
        arrayExamples.resolveFizzBuzz();
    }

}
