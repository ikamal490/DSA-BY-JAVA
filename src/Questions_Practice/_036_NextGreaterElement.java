package Questions_Practice;
//Next Greater Element
import java.util.Arrays;
import java.util.Stack;

public class _036_NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];

        for(int i=n-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        int[] arr1 = {1, 3, 7, 4, 2, 9, 8};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
        System.out.println(Arrays.toString(nextGreaterElement(arr1)));
    }
}
/*
Output:
[3, 4, -1, -1]
[3, 7, 9, 9, 9, -1, -1]
 */
