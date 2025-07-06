package _031_Stacks_Part1;
//Stack Using Collections
import java.util.*;

public class _03_StackUsing_CollectionFramework {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
/*
Output:
3
2
1
 */