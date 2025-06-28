package Questions_Practice;
//Search a 2D Matrix Brute Force
//Time Complexity = O(n x m)
//Space Complexity = O(1)
public class _046_Search_2DMatrix {

    public static boolean searchMatrixBrute(int[][] matrix, int target) {
        //Brute Force
        //Time complexity - O(n x m)
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3,   5,   7},
                         {10, 11,  16,  20 },
                         {23, 30,  34,  60 }};  //3x4

        System.out.println(searchMatrixBrute(matrix,3));
    }
}
