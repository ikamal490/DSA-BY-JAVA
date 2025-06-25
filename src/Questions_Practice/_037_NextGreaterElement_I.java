package Questions_Practice;
import java.util.*;
//Next Greater Element I
//Total Time Complexity =  O(n) + O(n x m) => O(n x m)
public class _037_NextGreaterElement_I {
    public static int[] nextGreaterElement_I(int[] arr1, int[] arr2) {
        int[] nge = new int[arr2.length];
        Stack<Integer> stack = new Stack<>();

        //Time Complexity = O(n)
        for (int i = arr2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr2[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(arr2[i]);
            //nge = {3, 4, -1, -1 }
        }

        //Time Complexity = O(m x n)
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result[i] = nge[j];
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3, 4, 2};

        int[] arr3 = {2,4};
        int[] arr4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement_I(arr1, arr2)));
        System.out.println(Arrays.toString(nextGreaterElement_I(arr3, arr4)));
    }
}
/*
Output:
[-1, 3, -1]
[3, -1]
 */
