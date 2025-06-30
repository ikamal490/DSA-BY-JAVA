package Questions_Practice;
import java.util.Arrays;

//Two Sum II - Input Array Is Sorted
public class _054_TwoSum_II {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int lp = 0;
        int rp = n-1;

        while(lp < rp) {
            if(arr[lp] + arr[rp] == target) {
                return new int[]{lp+1,rp+1};  // Arrays are  0-indexed we have to add +1 in that
            }
            else if((arr[lp] + arr[rp]) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int target1 = 9;

        int[] arr2 = {2,3,4};
        int target2 = 6;

        int[] arr3 = {-1,0};
        int target3 = -1;

        System.out.println(Arrays.toString(twoSum(arr1,target1)));
        System.out.println(Arrays.toString(twoSum(arr2,target2)));
        System.out.println(Arrays.toString(twoSum(arr3,target3)));
    }
}
/*
Output:
[1, 2]
[1, 3]
[1, 2]
 */