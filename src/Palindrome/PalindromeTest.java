package Palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    /**
     * Helper method to compare the results of all palindrome methods.
     */
    private void checkRecursivePalindromeCorrectness(String input) {
        LinkedList<Character> list = Palindrome.stringToLinkedList(input);

        boolean correctResult = Palindrome.palindromeCorrect(new LinkedList<>(list));
        boolean recursiveResult = Palindrome.palindromeWTHRecursive(new LinkedList<>(list));

        assertEquals(correctResult, recursiveResult);
    }

    @Test
    @DisplayName("Test Palindromes")
    void testPalindromes() {
        checkRecursivePalindromeCorrectness("Mom");
        checkRecursivePalindromeCorrectness("abba");
        checkRecursivePalindromeCorrectness("PoP");
        checkRecursivePalindromeCorrectness("RaceCar");
        checkRecursivePalindromeCorrectness("A");
    }

    @Test
    @DisplayName("Test Non-Palindromes")
    void testNonPalindromes() {
        checkRecursivePalindromeCorrectness("Mono Poly");
        checkRecursivePalindromeCorrectness("ManekiNeko");
        checkRecursivePalindromeCorrectness("Blue Archive");
        checkRecursivePalindromeCorrectness("KaliYuunai");
        checkRecursivePalindromeCorrectness("Polar bear");
    }

    @Test
    @DisplayName("Test Edge Cases")
    void testEdgeCases() {
        // Empty string
        checkRecursivePalindromeCorrectness("");

        // Single character
        checkRecursivePalindromeCorrectness("A");
        checkRecursivePalindromeCorrectness("z");

        // Case sensitivity
        checkRecursivePalindromeCorrectness("oREo");
        checkRecursivePalindromeCorrectness("AbcBA");
    }

    @Test
    @DisplayName("Test Exception for Null Input")
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.palindromeWTHRecursive(null));
    }
}
