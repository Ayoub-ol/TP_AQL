package TP01.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramBranchTest {

    @Test
    void testAllBranches() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // chemin positif
        assertFalse(Anagram.isAnagram("chien", "chat")); // mauvais contenu
        assertFalse(Anagram.isAnagram("chat", "chats")); // longueurs différentes
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test")); // null check
    }
}
