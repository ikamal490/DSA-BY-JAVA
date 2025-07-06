package _032_Stacks_Part2;
import java.util.Stack;
//Duplicate Parentheses
//Time Complexity O(n)
public class _02_Duplicate_Parentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') { // while(s.pop() --> we can also do that
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                }
                else {
                    s.pop(); //opening pair
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //valid String
        String str = "((a+b))"; //true
        String str2 = "(a-b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
