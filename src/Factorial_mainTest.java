import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Fact.Factorial;
import org.junit.jupiter.api.function.Executable;

import java.io.FileNotFoundException;

class Factorial_mainTest
{

    @Test
    @DisplayName("input:0")
    void case0()
    {
        assertEquals(1, Factorial.factorial_loop(0));
        assertEquals(1, Factorial.factorial_recursive(0));
    }

    @Test
    @DisplayName("input:1")
    void case1()
    {
        assertAll
                (
                        () -> assertEquals(1, Factorial.factorial_loop(1)),
                        () -> assertEquals(1, Factorial.factorial_recursive(1)),

                        () -> assertEquals(2, Factorial.factorial_loop(2)),
                        () -> assertEquals(2, Factorial.factorial_recursive(2)),

                        () -> assertEquals(120, Factorial.factorial_loop(5)),
                        () -> assertEquals(120, Factorial.factorial_recursive(5)),

                        () -> assertEquals(479001600, Factorial.factorial_loop(12)),
                        () -> assertEquals(479001600, Factorial.factorial_recursive(12))

                );
    }

    //case negative
    @Test
    void case2()
    {
        assertThrows(RuntimeException.class, () -> Factorial.factorial_recursive(-1));
        assertThrows(RuntimeException.class, () -> Factorial.factorial_loop(-1));

        assertDoesNotThrow(() -> Factorial.factorial_recursive(150));
        assertDoesNotThrow(() -> Factorial.factorial_recursive(150));
    }
}