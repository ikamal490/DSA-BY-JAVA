package Questions_Practice;
//Rotate Image by 90 degree
//Time complexity = O(n^2)
//Space complexity = O(1)

public class _045_RotateImage {
    /*

                   (0,0) (0,1), (0,2)
                   (1,0), (1,1), (1,2)
                   (2,0), (2,1), (2,2)

    (2,0)  (1,0)  (0,0)
    (2,1)  (1,1)  (0,1)
    (2,2)  (1,2)  (0,2)
 */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose the matrix --  for (n x n) matrix
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse each row
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    public static void printArr(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4,  5, 6 },
                          {7,  8, 9 }};

        rotate(matrix);
        printArr(matrix);
    }
}
/*
7 4 1
8 5 2
9 6 3
 */