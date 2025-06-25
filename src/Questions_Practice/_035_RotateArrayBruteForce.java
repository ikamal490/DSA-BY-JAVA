package Questions_Practice;
//Rotate an Array using of brute force
public class _035_RotateArrayBruteForce {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        for(int i=0; i<k; i++) {
            int last = arr[n-1];
            for(int j=n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
                arr[0] = last;
        }
        for(int nums: arr) {
            System.out.print(nums+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr,k);
    }
}
/*
Output:
5 6 7 1 2 3 4
 */