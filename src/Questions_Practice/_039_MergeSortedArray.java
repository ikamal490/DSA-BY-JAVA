package Questions_Practice;
//Merge Sorted Array
//Time complexity = O(n+m)
//Space complexity = O(1)

public class _039_MergeSortedArray {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        //Here, we are using of 3 pointer approach
        int i = m - 1;          // last index of actual elements in arr1
        int j = n - 1;          // last index of arr2
        int k = m + n - 1;      // last index of merged array

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // If arr2 still has elements, copy them
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int[] arr3 = {0};
        int[] arr4 = {1};

        int[] arr5 = {4,5,6,0,0,0};
        int[] arr6 = {1,2,3};

        int m = 3, n = 3;
        merge(arr5, m, arr6,n);
        for(int nums: arr5) {
            System.out.print(nums+" ");
        }
    }
}
/*
Input: arr1 = {4,5,6,0,0,0}
       arr2 = {1,2,3}
       m = 3 , n = 3
Output:
1 2 3 4 5 6

Input: arr1 = {1,2,3,0,0,0}
       arr2 = {2,5,6}
       m = 3 , n = 3
Output:
1,2,2,3,5,6
 */