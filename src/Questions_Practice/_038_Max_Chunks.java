package Questions_Practice;
//Max Chunks To Make Sorted
//Time complexity = O(n)
//Space Complexity = O(1)

public class _038_Max_Chunks {
    public static int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
            if(max < i+1) { //here, we compare max with next index value
                count++;
            }
        }
        return count;
    }

    //It is the bruteForce approach for this function
    public static int maxChunkBrute(int[] arr) {
        int n = arr.length;
        int chunk = 0;
        for(int i=0; i<arr.length; i++) {
            int max = arr[0];
            for(int j=0; j<=i; j++) {
                max = Math.max(max , arr[i]);
            }
            if(max == i) {
                chunk++;
            }
        }
        return chunk;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 4};
        int[] arr2 = {4,3,2,1,0};
        int[] arr3 = {4, 3, 2, 5};
        System.out.println("Max chunks are: "+maxChunksToSorted(arr1));
        System.out.println("Max chunks are using brute force : "+maxChunkBrute(arr1));
        System.out.println("Max chunks are: "+maxChunksToSorted(arr2));
        System.out.println("Max chunks are: "+maxChunksToSorted(arr3));
    }
}
/*
Output:
Max chunks are: 4
Max chunks are using brute force : 4
Max chunks are: 1
Max chunks are: 0
 */