package TP01.ex06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBranchTest {

    @Test
    void testAllBranches() {
        // n divisible par 3 et 5
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));

        // n divisible par 3 uniquement
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));

        // n divisible par 5 uniquement
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));

        // n non divisible ni par 3 ni par 5
        assertEquals("8", FizzBuzz.fizzBuzz(8));

        // n <= 1
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
}
