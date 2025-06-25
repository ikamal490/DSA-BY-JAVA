package Questions_Practice;
import java.util.Arrays;
//Squares of a Sorted Array
public class _032_SquareOfSortedArray {
    public static int[] sortedSquares(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}