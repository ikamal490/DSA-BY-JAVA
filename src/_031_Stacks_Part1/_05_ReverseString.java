package _031_Stacks_Part1;
//Reverse of string
import java.util.Stack;

public class  _05_ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Hello";
        String result = reverseString(str);
        System.out.println(result);
    }
}
/*
Output:
olleH
 */
