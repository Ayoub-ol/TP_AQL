package TP01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeConditionTest {
    @Test
    void testConditions() {
        assertTrue(Palindrome.isPalindrome("madam")); // égalité à chaque position
        assertFalse(Palindrome.isPalindrome("hello")); // inégalité au moins une fois
    }
}
