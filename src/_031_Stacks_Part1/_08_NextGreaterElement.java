package _031_Stacks_Part1;
import java.util.*;
//Next Greater Element
public class _08_NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            //3 push in stack
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

        //next Greater Right
        //next Greater Left --> we only change the for loop
        //next Smaller Right --> change in the while loop
        //next Smaller Left  --> change in for and while loop
    }
}
/*
Output:
8 -1 1 3 -1
 */