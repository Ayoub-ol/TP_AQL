package TP01.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class QuadraticEquationConditionTest {

    @Test
    void testConditions() {
        // a == 0 → true
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 3));

        // delta < 0 → true
        assertNull(QuadraticEquation.solve(2, 2, 2));

        // delta == 0 → true
        assertArrayEquals(new double[]{-2.0}, QuadraticEquation.solve(1, 4, 4));

        // delta > 0 → true
        double[] roots = QuadraticEquation.solve(1, 5, 6);
        assertEquals(2, roots.length);
    }
}
