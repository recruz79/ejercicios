package com.recs.ejercicios.functional.streams;

import org.junit.jupiter.api.Test;

public class StreamCollectorsTest {

    StreamCollectors streamReduce = new StreamCollectors();

    @Test
    public void testStreamReduceExample() {
        streamReduce.reduceStreamExample();
    }

    @Test
    public void testStreamReduceVsCollectExample() {
        streamReduce.reduceCollectPersonNamesExample();
    }

    @Test
    public void testStreamReduceAccumulator() {
        streamReduce.reduceAccumulator();
    }

}
