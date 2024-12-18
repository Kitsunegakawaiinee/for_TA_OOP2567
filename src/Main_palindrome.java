import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Palindrome.Palindrome;

public class Main_palindrome 
{
    private static void test_case1()
    {
        Palindrome program = new Palindrome();

        List<String> test_case = Arrays.asList
        (
                "Mom",
                "Dad",
                "boB",
                "Mono Poly",
                "ManekiNeko",
                "Blue Archive",
                "KaliYuunai",
                "kaliYuunii",
                "Polar bear",
                "POP",
                "OREO"
        );

        for(String i: test_case)
        {
            LinkedList<Character> input1 = program.string_to_linkedlist(i);
            LinkedList<Character> input2 = program.string_to_linkedlist(i);
            LinkedList<Character> input3 = program.string_to_linkedlist(i);
            System.out.printf("(CORRECT) [is palindrome? : word ] = [%b : %s]\n",program.palindrome_correct(input1),i);
            System.out.printf("(WTH_REC) [is palindrome? : word ] = [%b : %s]\n",program.palindrome_WTH_REC(input2),i);
            System.out.printf("(WTH_LOO) [is palindrome? : word ] = [%b : %s]\n\n",program.palindrome_WTH_LOO(input3),i);
        }
    }

    public static void main(String[] args) 
    {
        test_case1();
    }
}
