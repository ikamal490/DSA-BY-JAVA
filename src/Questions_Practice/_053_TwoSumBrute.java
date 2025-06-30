package Questions_Practice;
import java.util.Arrays;

//Two Sum using of Brute Force
public class _053_TwoSumBrute {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr[i]+arr[j]) == target) {
                    return new int[]{i,j};
                    /*
                    int[] res = {i, j}; // Works only inside a method
                    But if we want to return that immediately:
                    return new int[]{i, j}; // Needed outside variable assignment
                     */
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int target1 = 9;

        int[] arr2 = {3,2,4};
        int target2 = 6;

        int[] arr3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(arr1,target1)));
        System.out.println(Arrays.toString(twoSum(arr2,target2)));
        System.out.println(Arrays.toString(twoSum(arr3,target3)));
    }
}
/*
Output:
[0, 1]
[1, 2]
[0, 1]
 */