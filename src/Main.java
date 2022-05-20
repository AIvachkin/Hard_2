public class Main {
    public static void main(String[] args) {
        String first = "Ade" ;
        String second = "nrw" ;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            result.append(first.charAt(i)) ;
            result.append(second.charAt(i)) ;
        }
        System.out.println(result);
    }
}