package Questions_Practice;
//Search a 2D Matrix Optimized
//Time Complexity: O(log(m*n))
//Space Complexity: O(1)
public class _047_SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0 , high = n*m-1;
        while(low <= high) {
            int mid = (low + high)/2;
            int row = mid / m;
            int col = mid % m;
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3,   5,   7},
                        {10, 11,  16,  20 },
                        {23, 30,  34,  60 }};  //3x4

        System.out.println(searchMatrix(matrix,23));
        System.out.println(searchMatrix(matrix,7));
        System.out.println(searchMatrix(matrix,72));
    }
}
/*
Output:
true
true
false
 */