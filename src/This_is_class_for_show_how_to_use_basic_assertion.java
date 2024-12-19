import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class This_is_class_for_show_how_to_use_basic_assertion {
    static boolean for_return_true() {
        return true;
    }

    static Object forReturnNull() {
        return null;
    }

    @Test
    void showAssertEqual() {


        assertEquals(true, This_is_class_for_show_how_to_use_basic_assertion.for_return_true());

        assertTrue(() -> {
            return true;
        }); //สามารถใช้อันนี้ได้
        assertTrue(This_is_class_for_show_how_to_use_basic_assertion.for_return_true());

        Integer i = null;
//        assertEquals(null, null); //อันนี้จะใช้ไม่ได้เพราะว่า เราไม่รู้ว่า null เป็นคลาสไหนกันแน่
        assertEquals(null, i); //อันนี้่เราใช้ได้เพราะเราจะรู้ว่า null เป็น Integer
        assertEquals(null, forReturnNull());
        assertNull(forReturnNull()); //แน่นอนว่า ใช้อันนี้แทนได้
    }

    @Test
    @DisplayName("TestAssertThrown") //อันนี้เอาไว้เพื่อแสดงว่าชื่อ ที่จะเอาไปแสดงมันไม่ใช่ชื่อเดี่ยวกับ method test1 เราจะเอาชื่อที่อยู่ใน DisplayName ไปแสดงแทน
    void test1() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
        });

        assertThrows(Exception.class, () -> {
            throw new FileNotFoundException();
        });

        assertThrows(NumberFormatException.class, () -> Integer.parseInt("eiei"));

        assertThrowsExactly(FileNotFoundException.class, () -> { throw new FileNotFoundException(); });
        //assertThrowsExactly(FileNotFoundException.class, () -> { throw new NullPointerException(); }); //show if error
    }

    @Test
    void testNotThrown()
    {
        assertDoesNotThrow( () -> { return 1; });

        //assertDoesNotThrow( () -> { throw new RuntimeException(); }); //show if error
    }

    @Test
    @DisplayName("assertTimeOut")
    void test2() {
        assertTimeout(Duration.ofMillis(500), () -> {
            Thread.sleep(2000);
        }); //อันนี้คือโค้ดที่ จะทำการ Sleep เป็นเวลา 2000 มิลิวินาที

//        assertTimeout( // เนื่องจากเราเอาเวลาหลังทำงานเสร็จมาเทียบ เราไม่สามารถใช้แบบนี้ได้ อาจจะต้องใช้ @Timeout แทน ในเคสนี้
//                Duration.ofMillis(500),
//                () -> { while (true); });
    }

//    @Disabled
    @Disabled
    @Test
    void ignoreThisTest() {
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("eiei"));
        System.out.println("Ah sh_T, I have to work again.");
    }

    @Test
    void all()
    {
        assertAll //ถ้าอันใดอันนึงพัง ก็ถือว่า ไม่ผ่าน
                (
                        () -> assertTrue(true),
                        () -> assertNull(null),
                        // () -> assertTrue(false), //พังเพราะ อันนี้ทำให้พัง
                        () -> assertAll
                                (
                                        () -> assertDoesNotThrow(() -> { return null; }),
                                        () -> assertThrows(Error.class, () -> { throw new StackOverflowError(); }),
                                        () -> assertTimeout(Duration.ofMillis(500), () -> { return 0; })
                                )
                );
    }
}