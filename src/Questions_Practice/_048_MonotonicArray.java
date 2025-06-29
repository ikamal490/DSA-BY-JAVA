package Questions_Practice;
//Monotonic Array
public class _048_MonotonicArray {
    public static boolean isMonotonic(int[] arr) {
        int n = arr.length;
        boolean increase = true;
        boolean decrease = true;
        for(int i=1; i<n; i++) {
            if(arr[i] > arr[i-1]) {
                decrease = false;
            }
            if(arr[i] < arr[i-1]) {
                increase = false;
            }
        }

        return increase || decrease;

    }

    public static void main(String[] args) {
        int[] arr1 = {6,5,4,4};
        int[] arr2 = {1,2,2,3};
        int[] arr3 = {1,3,2};
        System.out.println(isMonotonic(arr1));
        System.out.println(isMonotonic(arr2));
        System.out.println(isMonotonic(arr3));
    }
}
