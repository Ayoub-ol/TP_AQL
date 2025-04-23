package TP01.ex05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConditionTest {

    @Test
    void testConditions() {
        // n < 1
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-5));

        // n > 3999
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(9999));

        // n entre 1 et 3999
        assertEquals("XXI", RomanNumeral.toRoman(21));
    }
}
