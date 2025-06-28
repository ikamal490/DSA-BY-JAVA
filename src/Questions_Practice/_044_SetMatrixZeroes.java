package Questions_Practice;
//Set Matrix Zeroes Brute Force
//Time Complexity = O( row x col )
//Space Complexity = O(row + col )  ---> we can optimize SC to O(1)
public class _044_SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++){
                if(rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printArr(int[][] matrix){
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
                         {5, 0, 7 },
                         {9,10, 11 }};

        setZeroes(matrix);
        printArr(matrix);
    }
}
/*
Output:
1 0 3
0 0 0
9 0 11
 */