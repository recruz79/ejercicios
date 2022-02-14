package com.recs.ejercicios.functional.streams;

import org.junit.jupiter.api.Test;

public class StreamReduceTest {

    StreamReduce streamReduce = new StreamReduce();

    @Test
    public void testStreamReduceExample() {
        streamReduce.reduceStreamExample();
    }

    @Test
    public void testStreamReduceVsCollectExample() {
        streamReduce.reduceCollectDifferenceExample();
    }

}
