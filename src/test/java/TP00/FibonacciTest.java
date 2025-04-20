package TP00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacci_Zero_ShouldReturn0() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacci_One_ShouldReturn1() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacci_Two_ShouldReturn1() {
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    void testFibonacci_Five_ShouldReturn5() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    void testFibonacci_Ten_ShouldReturn55() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    void testFibonacci_Negative_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}
