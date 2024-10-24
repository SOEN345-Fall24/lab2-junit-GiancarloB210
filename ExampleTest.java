package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    Example e = new Example(2, 2);

    @Test
    public void testFunctionA_YNegative() {
        assertEquals("Function A should yield -4 because y is less than 0, thus subtracting 2 from -2.",-4, e.Function_A(-2));
    }

    @Test
    public void testFunctionA_YPositive() {
        assertEquals("Function A should yield 5 because y is greater than 0, thus adding 2 to 3.",5, e.Function_A(3));
    }

    @Test
    public void testFunctionB_YGreaterThan6() {
        assertEquals("Function B should yield 4 because y is greater than 6, thus subtracting 2 from 8.",6, e.Function_B(8));
    }

    @Test
    public void testFunctionB_YLessThan6() {
        assertEquals("Function B should yield 6 because y is less than 6, thus adding 2 to 4.",6, e.Function_B(4));
    }
}