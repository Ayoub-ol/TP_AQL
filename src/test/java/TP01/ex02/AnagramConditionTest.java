package TP01.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramConditionTest {

    @Test
    void testConditionsEvaluation() {
        // s1.length() != s2.length()
        assertFalse(Anagram.isAnagram("abc", "ab"));

        // boucle count[i] != 0
        assertFalse(Anagram.isAnagram("abc", "abd"));

        // toutes les conditions à true
        assertTrue(Anagram.isAnagram("race", "care"));
    }
}
