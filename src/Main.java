import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {5,6,3,9,1} ;
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2 [i] = arr1[arr1.length - 1 - i] ;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));
    }}