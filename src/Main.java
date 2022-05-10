import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr1 =  {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -10} ;
        int summ = -2 ;
        int lenNew = 0 ;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
//        int i = 0 ;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1 ; j < arr1.length ; j++) {

            if (arr1 [i] + arr1 [j] == summ) {
                System.out.println(arr1 [i] + " и " + arr1 [j]);
            }
        }
//            break;
    }}}
