package Palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    public static Palindrome open = new Palindrome();

    @Test
    void try_fail()
    {
//        assertEquals();
        fail();
    }

    @Test
    @DisplayName("This for test correct version of palindrome")
    void test1()
    {

        assertAll
                (
                        () -> assertEquals(true, open.palindrome_correct(open.string_to_linkedlist("Mom"))),
                        () -> assertEquals(true, open.palindrome_correct(open.string_to_linkedlist("Dad"))),
                        () -> assertEquals(true, open.palindrome_correct(open.string_to_linkedlist("POP"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("Mono Poly"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("ManekiNeko"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("Blue Archive"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("KaliYuunai"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("kaliYuunii"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("Polar bear"))),
                        () -> assertEquals(false, open.palindrome_correct(open.string_to_linkedlist("OREO")))
                );
    }

    @Test
    @DisplayName("Test 3 character")
    void test2()
    {
        boolean correct1 = open.palindrome_correct(open.string_to_linkedlist("Mom"));
        boolean correct2 = open.palindrome_correct(open.string_to_linkedlist("dad"));
        boolean correct3 = open.palindrome_correct(open.string_to_linkedlist("PoP"));

        assertEquals(correct1, open.palindrome_WTH_REC(open.string_to_linkedlist("Mom")));
        assertEquals(correct2, open.palindrome_WTH_REC(open.string_to_linkedlist("dad")));
        assertEquals(correct3, open.palindrome_WTH_REC(open.string_to_linkedlist("PoP")));

        assertEquals(correct1, open.palindrome_WTH_LOO(open.string_to_linkedlist("Mom")));
        assertEquals(correct2, open.palindrome_WTH_LOO(open.string_to_linkedlist("dad")));
        assertEquals(correct3, open.palindrome_WTH_LOO(open.string_to_linkedlist("PoP")));
    }

    @Test
    void test_not_palindrome()
    {
        boolean correct1 = open.palindrome_correct(open.string_to_linkedlist("Mono Poly"));
        boolean correct2 = open.palindrome_correct(open.string_to_linkedlist("ManekiNeko"));
        boolean correct3 = open.palindrome_correct(open.string_to_linkedlist("Blue Archive"));
        boolean correct4 = open.palindrome_correct(open.string_to_linkedlist("KaliYuunai"));
        boolean correct5 = open.palindrome_correct(open.string_to_linkedlist("kaliYuunii"));
        boolean correct6 = open.palindrome_correct(open.string_to_linkedlist("Polar bear"));

        assertEquals(correct1, open.palindrome_WTH_REC(open.string_to_linkedlist("Mono Poly")));
        assertEquals(correct1, open.palindrome_WTH_LOO(open.string_to_linkedlist("Mono Poly")));

        assertEquals(correct2, open.palindrome_WTH_REC(open.string_to_linkedlist("ManekiNeko")));
        assertEquals(correct2, open.palindrome_WTH_LOO(open.string_to_linkedlist("ManekiNeko")));

        assertEquals(correct3, open.palindrome_WTH_REC(open.string_to_linkedlist("Blue Archive")));
        assertEquals(correct3, open.palindrome_WTH_LOO(open.string_to_linkedlist("Blue Archive")));

        assertEquals(correct4, open.palindrome_WTH_REC(open.string_to_linkedlist("KaliYuunai")));
        assertEquals(correct4, open.palindrome_WTH_LOO(open.string_to_linkedlist("KaliYuunai")));

        assertEquals(correct5, open.palindrome_WTH_REC(open.string_to_linkedlist("kaliYuunii")));
        assertEquals(correct5, open.palindrome_WTH_LOO(open.string_to_linkedlist("kaliYuunii")));

        assertEquals(correct6, open.palindrome_WTH_REC(open.string_to_linkedlist("Polar bear")));
        assertEquals(correct6, open.palindrome_WTH_LOO(open.string_to_linkedlist("Polar bear")));
    }

    @Test
    @DisplayName("Test oReo case")
    void test()
    {
        boolean correct6 = open.palindrome_correct(open.string_to_linkedlist("oREo"));

        assertEquals(correct6, open.palindrome_WTH_REC(open.string_to_linkedlist("oREo")));
        assertEquals(correct6, open.palindrome_WTH_LOO(open.string_to_linkedlist("oREo")));
    }
}