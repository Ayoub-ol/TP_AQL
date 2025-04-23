package TP01.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchLineTest {

    @Test
    void testElementFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 1));
    }

    @Test
    void testSingleElementArrayFound() {
        int[] arr = {10};
        assertEquals(0, BinarySearch.binarySearch(arr, 10));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 4));
    }
}
