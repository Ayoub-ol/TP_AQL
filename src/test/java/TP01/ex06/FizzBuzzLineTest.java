package TP01.ex06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzLineTest {

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void testNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1));
    }
}
