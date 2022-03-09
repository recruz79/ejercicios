package com.recs.ejercicios.functional.streams;

import com.recs.ejercicios.functional.ExampleData;
import org.junit.jupiter.api.Test;

public class StreamCollectorsTest {

    StreamCollectors streamReduce = new StreamCollectors();

    @Test
    public void testStreamReduceExample() {
        streamReduce.reduceStreamExample(ExampleData.getPersons());
    }

    @Test
    public void testStreamReduceVsCollectExample() {
        streamReduce.reduceCollectPersonNamesExample(ExampleData.getPersons());
    }

    @Test
    public void testStreamReduceAccumulator() {
        streamReduce.reduceAccumulator(ExampleData.getPersons());
    }

}
