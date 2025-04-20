package TP00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    private Matrix m1;
    private Matrix m2;

    @BeforeEach
    void setUp() {
        m1 = new Matrix(2);
        m2 = new Matrix(2);
        m1.set(0, 0, 1);
        m1.set(0, 1, 2);
        m1.set(1, 0, 3);
        m1.set(1, 1, 4);

        m2.set(0, 0, 5);
        m2.set(0, 1, 6);
        m2.set(1, 0, 7);
        m2.set(1, 1, 8);
    }

    @Test
    void testAddValidMatrix() {
        m1.add(m2);
        assertEquals(6, m1.get(0, 0));
        assertEquals(8, m1.get(0, 1));
        assertEquals(10, m1.get(1, 0));
        assertEquals(12, m1.get(1, 1));
    }

    @Test
    void testAddNullMatrix_ShouldThrowException() {
        assertThrows(NullPointerException.class, () -> m1.add(null));
    }

    @Test
    void testAddWithDifferentSize_ShouldThrowException() {
        Matrix m3 = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> m1.add(m3));
    }

    @Test
    void testMultiplyValidMatrix() {
        m1.multiply(m2);
        assertEquals(19, m1.get(0, 0));
        assertEquals(22, m1.get(0, 1));
        assertEquals(43, m1.get(1, 0));
        assertEquals(50, m1.get(1, 1));
    }

    @Test
    void testMultiplyWithNull_ShouldThrowException() {
        assertThrows(NullPointerException.class, () -> m1.multiply(null));
    }

    @Test
    void testMultiplyWithDifferentSize_ShouldThrowException() {
        Matrix m3 = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> m1.multiply(m3));
    }

    @Test
    void testTranspose() {
        m1.transpose();
        assertEquals(1, m1.get(0, 0));
        assertEquals(3, m1.get(0, 1));
        assertEquals(2, m1.get(1, 0));
        assertEquals(4, m1.get(1, 1));
    }

    @Test
    void testToString() {
        String expected =
                "[1, 2]\n" +
                        "[3, 4]\n";
        assertEquals(expected, m1.toString());
    }
}
