package Questions_Practice;
// Rotate Array
public class _031_RotateArray {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverseArr(arr, 0, n-1); //Fully Reversed array
        reverseArr(arr, 0, k-1); // Reversed First k elements
        reverseArr(arr, k, n-1); // Reversed after k elements
    }

    public static void printArr(int[] arr) {
        for(int nums: arr) {
            System.out.print(nums+" ");
        }
    }

    public static void reverseArr(int[] arr, int start, int end) {
//        start = 0;
//        end = arr.length-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr,3);
        printArr(arr);
    }
}
