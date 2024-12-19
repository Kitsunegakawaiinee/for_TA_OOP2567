import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Palindrome.Palindrome;

public class Main_palindrome 
{
    private static void testCase1()
    {

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
            LinkedList<Character> input1 = Palindrome.stringToLinkedList(i);
            LinkedList<Character> input2 = Palindrome.stringToLinkedList(i);
            LinkedList<Character> input3 = Palindrome.stringToLinkedList(i);
            System.out.printf("(CORRECT) [is palindrome? : word ] = [%b : %s]\n",Palindrome.palindromeCorrect(input1),i);
            System.out.printf("(WTH_REC) [is palindrome? : word ] = [%b : %s]\n",Palindrome.palindromeWTHRecursive(input2),i);
            System.out.printf("(WTH_LOO) [is palindrome? : word ] = [%b : %s]\n\n",Palindrome.palindromeWTHLoop(input3),i);
        }
    }

    public static void main(String[] args) 
    {
        testCase1();
    }
}
