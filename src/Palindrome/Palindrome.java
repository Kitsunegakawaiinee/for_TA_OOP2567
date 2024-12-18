package Palindrome;
import java.util.LinkedList;

public class Palindrome
{
    //public
        public LinkedList<Character> string_to_linkedlist(String input)
        {
            input = input.toLowerCase();
            LinkedList<Character> for_return = new LinkedList<>();

            if(input.isEmpty()) return for_return;
            else 
            {
                for(int i = 0; i< input.length(); i++) for_return.add((Character) input.charAt(i));

                return for_return;
            }
        }

        public boolean palindrome_correct(LinkedList<Character> input)
        {
            if(input.size() <= 1) return true;

            char first = input.removeFirst(), second = input.removeLast();

            if(first == second) return (true && palindrome_correct(input));
            else return false;
        }
        
        public boolean palindrome_WTH_REC(LinkedList<Character> input)
        {
            boolean result = false; 

            if (input.isEmpty()) return result;

            if (input.size() == 1) return result;

            Character first = input.removeFirst(), last = input.removeLast();

            boolean check = first == last; 

            return check || palindrome_WTH_REC(input); 
        }

        public Boolean palindrome_WTH_LOO(LinkedList<Character> input)
        {
            Boolean result = false; 

            while(input.size() > 1)
            {
                Character first = input.removeFirst(), last = input.removeLast();

                boolean check = first == last;  

                result = check || result; 
            }

            result = result || false; 

            return result;
        }
}
