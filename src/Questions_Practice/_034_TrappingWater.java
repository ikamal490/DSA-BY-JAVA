package Questions_Practice;
//Trapping Rain Water
public class _034_TrappingWater {
    public static int trappedWater(int[] arr) {
        //waterLevel = min(leftMax , rightMax )
        //trappedWater = WaterLevel - barLevel
        int n = arr.length;
        int trappedWater = 0;
        //Left Max Boundary
            //we create an auxiliary array
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //Right Max Boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);
        trappedWater += waterLevel - arr[i];
        }

        return trappedWater;


    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWater(arr));
        System.out.println(trappedWater(arr1));
    }
}
/*
Output:
9
6
 */