package TP00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void testIsEmpty_WhenNewStack_ShouldBeTrue() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPush_ShouldAddElementToTop() {
        stack.push(42);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals(42, stack.peek());
    }

    @Test
    void testPop_ShouldReturnLastElementAndRemoveIt() {
        stack.push(10);
        stack.push(20);
        int value = stack.pop();
        assertEquals(20, value);
        assertEquals(1, stack.size());
    }

    @Test
    void testPeek_ShouldReturnLastElementWithoutRemoving() {
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void testSize_ShouldReturnCorrectNumberOfElements() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
    }

    @Test
    void testPop_OnEmptyStack_ShouldThrowException() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    void testPeek_OnEmptyStack_ShouldThrowException() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }

    @Test
    void testPushBeyondInitialCapacity_ShouldExpandArray() {
        // Pousse 15 éléments pour dépasser la capacité initiale (10)
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());
    }
}
