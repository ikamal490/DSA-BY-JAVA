package Questions_Practice;
//Container With Most Water
//Time complexity - O(n)

public class _052_ContainerWithMostWater {
    public static int maxArea(int[] arr) {
        int n = arr.length;
        int lp = 0;
        int rp = n-1;
        int maxWater = 0;

        while(lp < rp) {
            int height = Math.min(arr[lp] , arr[rp]);
            int width = rp-lp;
            int currWater = height*width;
            maxWater = Math.max(maxWater,currWater);

            if(arr[lp] < arr[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        int[] arr2 = {1,1};
        int[] arr3 = {8,7,2,1};
        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
        System.out.println(maxArea(arr3));
    }
}
/*
Output:
49
1
7
 */