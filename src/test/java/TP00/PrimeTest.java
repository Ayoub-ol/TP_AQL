package TP00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime_WhenNumberIsLessThan2_ShouldReturnFalse() {
        assertFalse(Prime.isPrime(-10));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    void testIsPrime_WhenNumberIs2_ShouldReturnTrue() {
        assertTrue(Prime.isPrime(2));
    }

    @Test
    void testIsPrime_WhenNumberIs3_ShouldReturnTrue() {
        assertTrue(Prime.isPrime(3));
    }

    @Test
    void testIsPrime_WhenNumberIs4_ShouldReturnFalse() {
        assertFalse(Prime.isPrime(4));
    }

    @Test
    void testIsPrime_WhenNumberIs17_ShouldReturnTrue() {
        assertTrue(Prime.isPrime(17));
    }

    @Test
    void testIsPrime_WhenNumberIs100_ShouldReturnFalse() {
        assertFalse(Prime.isPrime(100));
    }

    @Test
    void testIsPrime_WhenNumberIs97_ShouldReturnTrue() {
        assertTrue(Prime.isPrime(97));
    }
}
