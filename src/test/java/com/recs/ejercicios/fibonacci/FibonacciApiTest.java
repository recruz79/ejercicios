package com.recs.ejercicios.fibonacci;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class FibonacciApiTest {

    @Autowired
    FibonacciApi fibonacciApi;

    private static final int STARTING_TERM = 0;
    private static final short TERMS = 9;

    private static List<Long> expectedSequence = new ArrayList<Long>(FibonacciApiTest.TERMS) {
        {
            this.add(0L);
            this.add(1L);
            this.add(1L);
            this.add(2L);
            this.add(3L);
            this.add(5L);
            this.add(8L);
            this.add(13L);
            this.add(21L);
        }
    };

    public FibonacciApiTest() {
    }

    @Test
    public void shouldGenerateSequence() {
        List<Long> sequence = fibonacciApi.generateSequence(FibonacciApiTest.STARTING_TERM, FibonacciApiTest.TERMS);
        assertThat(sequence.containsAll(this.expectedSequence)).isTrue();
        assertThat(this.expectedSequence.containsAll(sequence)).isTrue();
    }

}