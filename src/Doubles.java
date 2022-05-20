public class Doubles {

    public static void doubles (String letters) {

            for (int i = 0; i < letters.length() - 1; i++)
                if (letters.charAt(i) != letters.charAt(i + 1)) {
                } else {
                    System.out.println("Обнаружен дубль. Символ - " + letters.charAt(i));
                    break;
                }

        }


}
