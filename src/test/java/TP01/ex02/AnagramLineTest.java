package TP01.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramLineTest {

    @Test
    void testAnagramBasic() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void testNotAnagramDifferentLetters() {
        assertFalse(Anagram.isAnagram("chien", "chat"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("ami", "amiable"));
    }

    @Test
    void testAnagramWithSpacesAndCase() {
        assertTrue(Anagram.isAnagram("Clint Eastwood", "Old West Action"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }
}
