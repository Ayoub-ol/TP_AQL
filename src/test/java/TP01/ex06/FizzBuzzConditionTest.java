package TP01.ex06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConditionTest {

    @Test
    void testConditions() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1));  // n <= 1

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // %15 == 0

        assertEquals("Fizz", FizzBuzz.fizzBuzz(3)); // %3 == 0

        assertEquals("Buzz", FizzBuzz.fizzBuzz(5)); // %5 == 0

        assertEquals("11", FizzBuzz.fizzBuzz(11)); // aucun
    }
}
