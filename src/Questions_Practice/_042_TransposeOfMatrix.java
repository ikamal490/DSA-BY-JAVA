package Questions_Practice;
import java.util.Arrays;
import java.util.Scanner;

// Transpose Matrix
public class _042_TransposeOfMatrix {
    public static void print2DArray(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }


    public static void main(String[] args) {
        int[][] matrix1 = { {2,3,7},
                           {5,6,7} };

        int[][] matrix2 = {  {2,3,7},
                             {5,6,7},
                             {1,2,3}};

        int[][] transposed1 = transpose(matrix1);
        int[][] transposed2 = transpose(matrix2);

        print2DArray(transposed1);
        System.out.println();
        print2DArray(transposed2);
    }
}
/*
Output:
2 5
3 6
7 7

2 5 1
3 6 2
7 7 3
 */
