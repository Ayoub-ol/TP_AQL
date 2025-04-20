package TP00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorial_Zero_ShouldReturn1() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testFactorial_One_ShouldReturn1() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void testFactorial_Five_ShouldReturn120() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testFactorial_Ten_ShouldReturn3628800() {
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    void testFactorial_Negative_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
