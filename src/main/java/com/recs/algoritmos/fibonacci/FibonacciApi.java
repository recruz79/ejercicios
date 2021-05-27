package com.recs.algoritmos.fibonacci;

import java.util.List;

/**
 * Created by rcruz on 16/03/2017.
 */
public interface FibonacciApi {

    public List<Long> generateSequence(final long startingFrom, final long numberOfTerms);

}
