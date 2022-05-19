public class Main {
    public static void main(String[] args) {

        String fullName = "Иванов Иван Иванович" ;
        int a = fullName.indexOf(" ");
        int b = fullName.indexOf(" ", a+1) ;
        String lastName = fullName.substring(0, a);
        String firstName = fullName.substring(a+1, b);
        String middleName = fullName.substring(b+1) ;

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("middleName = " + middleName);
    }
}