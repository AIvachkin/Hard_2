import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String fullName = "petrov Ivan ivanovich";
        int a = fullName.indexOf(" ");
        int b = fullName.indexOf(" ", a + 1);
        String lastName = fullName.substring(0, a);
        String firstName = fullName.substring(a + 1, b);
        String middleName = fullName.substring(b + 1);
        char[] charLast = lastName.toCharArray();
        char[] charFirst = firstName.toCharArray();
        char[] charMiddle = middleName.toCharArray();
        charLast[0] = Character.toUpperCase(charLast[0]);
        charFirst[0] = Character.toUpperCase(charFirst[0]);
        charMiddle[0] = Character.toUpperCase(charMiddle[0]);
        String fullNameNew = String.copyValueOf(charLast, 0, charLast.length) + " "
                + String.copyValueOf(charFirst, 0, charFirst.length) + " " +
                String.copyValueOf(charMiddle, 0, charMiddle.length);
        System.out.println("fullNameNew = " + fullNameNew);

    }
}