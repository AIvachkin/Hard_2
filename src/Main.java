import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {4,6,2,3,9,1} ;
        float mediana = arr1.length / 2f;
        for (int i = 0; i < arr1.length; i++) {
            if (i < mediana) {
            int temp = arr1[i];
            arr1 [i] = arr1[arr1.length - 1 - i] ;
            arr1 [arr1.length - 1 -i] = temp ;
            System.out.print(arr1 [i] + " ");
        } else if (i == arr1.length - 1) {
                System.out.print(arr1 [i]) ; }
            else System.out.print(arr1 [i] + " ");
            }
    }
}