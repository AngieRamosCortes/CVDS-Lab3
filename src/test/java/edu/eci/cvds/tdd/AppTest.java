package edu.eci.cvds.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /**
     * Simple test example.
     */
    @Test
    public void testApp() {
        assertTrue(true, "This test should always pass.");
    }

    /**
     * Example of a failing test.
     */
    @Test
    public void testFailureExample() {
        int expected = 10;
        int actual = 5 + 5;
        assertEquals(expected, actual, "The sum should be 10.");
    }
}
