public class Main {
    public static void main(String[] args) {
       String str = "aabccddefgghiijjkk" ;
//       StringBuilder result = new StringBuilder(str) ;
       StringBuilder result2 = new StringBuilder() ;

        for (int i = 0; i < str.length()-1 ; i++) {
//            if (str.charAt(i) == str.charAt(i+1)) {
//                result.deleteCharAt(i) ;
//            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                result2.append(str.charAt(i)) ;
            }
        }
//        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}