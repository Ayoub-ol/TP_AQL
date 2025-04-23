package TP01.ex05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralBranchTest {

    @Test
    void testAllBranches() {
        // branche d'erreur n < 1
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));

        // branche d'erreur n > 3999
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));

        // boucle while utilisée
        assertEquals("III", RomanNumeral.toRoman(3)); // plusieurs fois "I"

        // n == valeur exacte
        assertEquals("X", RomanNumeral.toRoman(10));
    }
}
