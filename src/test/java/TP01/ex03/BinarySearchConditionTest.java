package TP01.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchConditionTest {

    @Test
    void testConditionEvaluation() {
        // Test with all boolean paths:
        int[] arr = {1, 3, 5, 7};

        assertEquals(0, BinarySearch.binarySearch(arr, 1)); // low == high path
        assertEquals(1, BinarySearch.binarySearch(arr, 3)); // mid < element
        assertEquals(-1, BinarySearch.binarySearch(arr, 6)); // element not found
    }
}
