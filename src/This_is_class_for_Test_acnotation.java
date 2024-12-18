import org.junit.jupiter.api.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class This_is_class_for_Test_acnotation
{
    static String[] for_print =
            {
                    "BeforeAll: Hi, I am from BeforeAll\n",
                    "AfterALL: I'm from AfterALL. Hello and Good bye",
                    "BeforeEach1: Let's start test",
                    "BeforeEach2: I'm so lazy",
                    "AfterEach1: Test2, what going on?\n",
                    "BeforeEach3: zzzzzzzzzzzzzzzz",
                    "AfterEach2: No Test, No bug"
            };

    @AfterEach
    void afe()
    {
        System.out.println(for_print[6]);
    }

    @BeforeAll
    static void bfa()
    {
        System.out.println(for_print[0]);
    }

    @AfterAll
    static  void afa()
    {
        System.out.println(for_print[1]);
    }

    @BeforeEach
    void bfe1()
    {
        System.out.println(for_print[2]);
    }

    @Test
    void test1()
    {
        System.out.println("Test1 : What do you want to test");
    }

    @BeforeEach
    void bfe2()
    {
        System.out.println(for_print[3]);
    }

    @Test
    void test2()
    {
        System.out.println("Test2:...");
    }

    @AfterEach
    void afe1()
    {
        System.out.println(for_print[4]);
    }

    @Test
    void test3()
    {
        System.out.println("Test3: you pass");
    }

    @BeforeEach
    void bfe3()
    {
        System.out.println(for_print[5]);
    }
}