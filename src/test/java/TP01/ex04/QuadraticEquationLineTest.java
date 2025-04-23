package TP01.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationLineTest {

    @Test
    void testDeltaPositive() {
        double[] roots = QuadraticEquation.solve(1, -3, 2); // x² - 3x + 2 = 0
        assertNotNull(roots);
        assertEquals(2, roots.length);
        assertTrue(roots[0] == 2.0 || roots[1] == 2.0);
        assertTrue(roots[0] == 1.0 || roots[1] == 1.0);
    }

    @Test
    void testDeltaZero() {
        double[] root = QuadraticEquation.solve(1, 2, 1); // x² + 2x + 1 = 0
        assertArrayEquals(new double[]{-1.0}, root);
    }

    @Test
    void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 1)); // Δ < 0
    }

    @Test
    void testIllegalArgumentForZeroA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }
}
