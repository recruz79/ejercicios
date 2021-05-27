package com.recs.algoritmos.fibonacci;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
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

	public FibonacciApiTest() {}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {}

	@Test
	public void shouldGenerateSequence() {
		// GIVEN
		// WHEN
		List<Long> sequence = fibonacciApi.generateSequence(FibonacciApiTest.STARTING_TERM, FibonacciApiTest.TERMS);
		// THEN
		assertThat(sequence.containsAll(this.expectedSequence)).isTrue();
        assertThat(this.expectedSequence.containsAll(sequence)).isTrue();
	}

}