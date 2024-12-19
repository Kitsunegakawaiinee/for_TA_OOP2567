import org.junit.jupiter.api.*;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class This_is_class_for_Test_acnotation
{

    static HashMap<String, String> comunication;

    @AfterEach
    void afe2()
    {
        System.out.println(comunication.get("AfterEach2"));
    }

    @BeforeAll
    static void bfa()
    {
        comunication = new HashMap<>();

        comunication.put("BeforeALL1","BeforeAll1: Hi, I am from BeforeAll");
        comunication.put("BeforeALL2","BeforeAll2: HAHAHHAHAHAHA\n");
        comunication.put("AfterALL0", "AfterALL1: I'm from AfterALL. Hello and Good bye");
        comunication.put("AfterALLNoNumber", "AfterALLNoNumber: Hi I am afterALL with highest priority");

        comunication.put("BeforeEach1", "BeforeEach1: Let's start test");
        comunication.put("BeforeEach2", "BeforeEach2: I'm so lazy");
        comunication.put("BeforeEach3", "BeforeEach3: zzzzzzzzzzzzzzzz");

        comunication.put("AfterEach2", "AfterEach2: No Test, No bug\n");
        comunication.put("AfterEach1","AfterEach1: Test2, what going on?");

        System.out.println(comunication.get("BeforeALL1"));
    }

    @BeforeAll
    static  void bfa1()
    {
        System.out.println(comunication.get("BeforeALL2"));
    }

    @AfterAll
    static  void afa0()
    {
        System.out.println(comunication.get("AfterALL0"));
    }

    @BeforeEach
    void bfe1()
    {
        System.out.println(comunication.get("BeforeEach1"));
    }

    @Test
    void test4()
    {
        System.out.println("Test1 : What do you want to test");
    }

    @BeforeEach
    void bfe2()
    {
        System.out.println(comunication.get("BeforeEach2"));
    }

    @Test
    void test2()
    {
        System.out.println("Test2:...");
    }

    @AfterEach
    void afe1()
    {
        System.out.println(comunication.get("AfterEach1"));
    }

    @Test
    void test3()
    {
        System.out.println("Test3: you pass");
    }

    @BeforeEach
    void bfe3()
    {
        System.out.println(comunication.get("BeforeEach3"));
    }

    @AfterAll
    static void afa()
    {
        System.out.println(comunication.get("AfterALLNoNumber"));
    }

}