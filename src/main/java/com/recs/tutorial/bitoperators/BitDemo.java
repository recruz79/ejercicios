package com.recs.tutorial.bitoperators;

/**
 * //The unary bitwise complement operator "~" inverts a bit pattern; it can be applied to any of the integral types,
 * making every "0" a "1" and every "1" a "0". For example, a byte contains 8 bits; applying this operator to a value
 * whose bit pattern is "00000000" would change its pattern to "11111111".
 * The signed left shift operator "<<" shifts a bit pattern to the left, and the signed right shift operator ">>"
 * shifts a bit pattern to the right. The bit pattern is given by the left-hand operand, and the number of positions
 * to shift by the right-hand operand. The unsigned right shift operator ">>>" shifts a zero into the leftmost
 * position, while the leftmost position after ">>" depends on sign extension.
 * <p>
 * The bitwise & operator performs a bitwise AND operation.
 * The bitwise ^ operator performs a bitwise exclusive OR operation.
 * The bitwise | operator performs a bitwise inclusive OR operation.
 * The following program, BitDemo, uses the bitwise AND operator to print the number "2" to standard output.
 * <p>
 * int i = 10;
 * int n = i++%5;
 * Question: What are the values of i and n after the code is executed?
 * Answer: i is 11, and n is 0.
 * Question: What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
 * Answer: i is 11, and n is 1.
 */
class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;

        // prints "2"
        System.out.println(val & bitmask);
    }
}
