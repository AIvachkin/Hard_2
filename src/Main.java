import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int first = 0 ;
       int next = 0 ;
       int second = 1 ;
        System.out.print(first + " " + second + " ");
       for (int i=0 ; i < 8 ; i ++ ) {
           next = first + second ;
           System.out.print(next + " ");
           first = second ;
           second = next ;
       }
    }
}