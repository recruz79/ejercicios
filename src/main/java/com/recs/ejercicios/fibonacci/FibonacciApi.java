package com.recs.ejercicios.fibonacci;

import java.util.List;

public interface FibonacciApi {

    public List<Long> generateSequence(final long startingFrom, final long numberOfTerms);

}
