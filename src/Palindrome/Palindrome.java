package Palindrome;
import java.util.LinkedList;

public class Palindrome
{
    //public
        /**
         * ใช้สำหรับแปลง string -> LinkedList
         * @param input ต้องเป็น string : ต้องไม่เป็น null
         * @return empty list เมื่อ empty string| linkedlist of character
         */
        public static LinkedList<Character> stringToLinkedList(String input)
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

        /**
         * This method ใช่เพื่อดูว่าสิ่งที่ใส่เข้ามาเป็น palindrome หรือไม่
         * @param input ต้องเป็น Linkedlist ของ character | not null
         * @return จะจริงเมื่อ มีตัวอักษร 0 หรือ 1 และ ตัวอักษรตัวหน้าและหลังในตำแหน่งที่ i และ lenght-i ต้องเป็นตัวเดียวกัน โดยที่ไม่เป็น Sensitive case 
         */
        public static boolean palindromeCorrect(LinkedList<Character> input)
        {
            if(input.size() <= 1) return true;

            char first = input.removeFirst(), second = input.removeLast();

            if(first == second) return (true && palindromeCorrect(input));
            else return false;
        }
        
        /**
         * This method ใช่เพื่อดูว่าสิ่งที่ใส่เข้ามาเป็น palindrome หรือไม่
         * @param input ต้องเป็น Linkedlist ของ character | not null
         * @return จะจริงเมื่อ มีตัวอักษร 0 หรือ 1 และ ตัวอักษรตัวหน้าและหลังในตำแหน่งที่ i และ lenght-i ต้องเป็นตัวเดียวกัน โดยที่ไม่เป็น Sensitive case 
         */
        public static boolean palindromeWTHRecursive(LinkedList<Character> input)
        {
            boolean result = false; 

            if (input.isEmpty()) return result;

            if (input.size() == 1) return result;

            Character first = input.removeFirst(), last = input.removeLast();

            boolean check = first == last; 

            return check || palindromeWTHRecursive(input); 
        }

        /**
         * This method ใช่เพื่อดูว่าสิ่งที่ใส่เข้ามาเป็น palindrome หรือไม่
         * @param input ต้องเป็น Linkedlist ของ character | not null
         * @return จะจริงเมื่อ มีตัวอักษร 0 หรือ 1 และ ตัวอักษรตัวหน้าและหลังในตำแหน่งที่ i และ lenght-i ต้องเป็นตัวเดียวกัน โดยที่ไม่เป็น Sensitive case 
         */
        public static Boolean palindromeWTHLoop(LinkedList<Character> input)
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
