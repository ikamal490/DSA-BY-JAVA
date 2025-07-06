package _031_Stacks_Part1;
//Push at Bottom of Stack
import java.util.Stack;

public class _04_PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()) {  //while the stack is not empty
            System.out.println(s.pop());
        }
    }
}
/*
Output:
3
2
1
4
 */