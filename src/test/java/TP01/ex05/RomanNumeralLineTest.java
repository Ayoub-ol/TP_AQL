package TP01.ex05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralLineTest {

    @Test
    void testBasicNumerals() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("L", RomanNumeral.toRoman(50));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("C", RomanNumeral.toRoman(100));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("D", RomanNumeral.toRoman(500));
        assertEquals("CM", RomanNumeral.toRoman(900));
        assertEquals("M", RomanNumeral.toRoman(1000));
    }

    @Test
    void testComplexNumerals() {
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999)); // max possible
    }

    @Test
    void testInvalidLowValue() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testInvalidHighValue() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
