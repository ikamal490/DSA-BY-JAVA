package Questions_Practice;
//Spiral Matrix
public class _043_SpiralMatrix {
    public static void spiralMatrix(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //Right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            //Bottom
            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //Left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {

        int[][] matrix =   {{1, 2, 3, 4},
                            {5, 6, 7, 8 },
                            {9,10,11,12 }};
        spiralMatrix(matrix);
    }
}
/*
Output:
1 2 3 4 8 12 11 10 9 5 6 7
 */