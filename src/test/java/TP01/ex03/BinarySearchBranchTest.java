package TP01.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchBranchTest {

    @Test
    void testAllBranches() {
        // Branch 1: array[mid] == element
        assertEquals(0, BinarySearch.binarySearch(new int[]{3}, 3));

        // Branch 2: array[mid] < element
        assertEquals(1, BinarySearch.binarySearch(new int[]{2, 4}, 4));

        // Branch 3: array[mid] > element
        assertEquals(-1, BinarySearch.binarySearch(new int[]{3, 6}, 2));
    }
}
