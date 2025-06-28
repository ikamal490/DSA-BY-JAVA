package Questions_Practice;
//Count how many times a number appears in a 2D array.
public class _040_CountOccurrences {
    public static int countOccurrence(int[][] matrix, int key) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{4, 7, 8},
                          {8, 8, 7}};

        System.out.println(countOccurrence(matrix,7));
    }
}
/*
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2

 */