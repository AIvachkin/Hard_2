import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [][] matrix = new int[3][3] ;
       matrix[0][0] = 1 ;
       matrix[0][2] = 1 ;
       matrix[1][1] = 1 ;
       matrix[2][0] = 1 ;
       matrix[2][2] = 1 ;
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}