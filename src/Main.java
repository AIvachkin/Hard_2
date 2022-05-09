import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [][] matrix = new int[3][3] ;
       int number = 3 ;
//       matrix[0][0] = 1 ;
//       matrix[0][2] = 1 ;
//       matrix[1][1] = 1 ;
//       matrix[2][0] = 1 ;
//       matrix[2][2] = 1 ;

        for (int i = 0 ; i < matrix.length ; i ++) {
            for (int j = 0 ; j < matrix[0].length ; j ++) {
                if ((i + j) % 2 == 0) matrix [i] [j] = number ;
//                else matrix [i] [j] = 0 ;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}