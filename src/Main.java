import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = Random.generateRandomArray() ;

        String a = Arrays.toString(array) ;
        System.out.println("array = " + a);

    }
}