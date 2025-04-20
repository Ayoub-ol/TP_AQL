package TP00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetFullName_ShouldReturnFirstNameAndLastName() {
        Person person = new Person("Ayoub", "Boudiba", 24);
        assertEquals("Ayoub Boudiba", person.getFullName());
    }

    @Test
    void testIsAdult_WhenAgeIsExactly18_ShouldReturnTrue() {
        Person person = new Person("Bedr eddine", "Chabaane", 18);
        assertTrue(person.isAdult());
    }

    @Test
    void testIsAdult_WhenAgeIsLessThan18_ShouldReturnFalse() {
        Person person = new Person("Rahim", "Boussala", 17);
        assertFalse(person.isAdult());
    }

    @Test
    void testIsAdult_WhenAgeIsGreaterThan18_ShouldReturnTrue() {
        Person person = new Person("belguendouz", "wassim", 24);
        assertTrue(person.isAdult());
    }
}
