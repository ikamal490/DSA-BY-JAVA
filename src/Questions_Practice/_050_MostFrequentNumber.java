package Questions_Practice;
//Most Frequent Number Following Key In an Array
//Time Complexity - O(n)
public class _050_MostFrequentNumber {
    public static int mostFrequent(int[] arr, int key) {
        int n = arr.length;
       int[] count = new int[1001];

       for(int i=0; i<n-1; i++) {
           if(arr[i] == key) {
               count[arr[i+1]]++;
           }
       }

       int max = 0;
       int result = 0;

       for(int i=0; i<count.length; i++) {
           if(count[i] > max) {
               max = count[i];
               result = i;
           }
       }
       return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,100,200,1,100};
        int key1 = 1;
        int[] arr2 = {2,2,2,2,3};
        int key2 = 2;
        System.out.println(mostFrequent(arr1,key1));
        System.out.println(mostFrequent(arr2,key2));
    }
}
/*
Output:
100
2
 */