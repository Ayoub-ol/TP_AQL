package TP01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeBranchTest {
    @Test
    void testAllBranches() {
        assertTrue(Palindrome.isPalindrome("kayak")); // true path
        assertFalse(Palindrome.isPalindrome("hello")); // false path
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // null
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama")); // test with ignoreCase + space
    }
}