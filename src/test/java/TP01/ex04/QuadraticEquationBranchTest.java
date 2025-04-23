package TP01.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationBranchTest {

    @Test
    void testAllBranches() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1)); // branche a == 0
        assertNull(QuadraticEquation.solve(1, 1, 1)); // Δ < 0
        assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1)); // Δ == 0
        double[] roots = QuadraticEquation.solve(1, -3, 2); // Δ > 0
        assertEquals(2, roots.length);
    }
}
