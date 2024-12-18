package Fact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.factorialLoop(0));
        assertDoesNotThrow(() -> Factorial.factorialLoop(1));
    }

    @Test
    void testFactorialOne() {
        assertDoesNotThrow(() -> Factorial.factorialLoop(1));
        assertEquals(1, Factorial.factorialLoop(1));
    }

    @Test
    void testFactorialSmallNumber() {
        assertDoesNotThrow(() -> Factorial.factorialLoop(2));
        assertEquals(2, Factorial.factorialLoop(2));

        assertDoesNotThrow(() -> Factorial.factorialLoop(5));
        assertEquals(120, Factorial.factorialLoop(5));
    }

    @Test
    void testFactorialLargeNumber() {
        assertDoesNotThrow(() -> Factorial.factorialLoop(10));
        assertEquals(3628800, Factorial.factorialLoop(10));

        assertDoesNotThrow(() -> Factorial.factorialLoop(12));
        assertEquals(479001600, Factorial.factorialLoop(12));
    }

    @Test
    void testNegativeNumber() {
        Exception exception = assertThrows(RuntimeException.class, () -> Factorial.factorialLoop(-5));
        assertEquals("How to cal factorial of negative nuymber?", exception.getMessage());
    }
}
