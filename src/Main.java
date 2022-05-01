public class Main {
    public static void main(String[] args) {

        int a = 268 ;
        int b = a % 100 ;
        int c = b % 10 ;
        b = b - c ;
        int d = b / 10 ;
        System.out.println(d);
    }
}