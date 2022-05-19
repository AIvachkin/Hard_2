import java.util.Arrays;

//import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -10};
        int summ = -2;
        int lenNew = 0;
        Arrays.sort(arr1);
        int min = arr1[0];
        int max = arr1[arr1.length - 1];
        int find = 5;
        System.out.println(arr1 [binarySearch(arr1, find, min, max)]) ;
//        System.out.println(arr1[index]);
        System.out.println(Arrays.toString(arr1));
        System.out.println(max);
    }

        private static int binarySearch (int[] sortedArray, int valueToFind, int min, int max) {
            int index = -1;

            while (min <= max) {
                int mid = (min + max) / 2;
                if (sortedArray[mid] < valueToFind) {
                    min = mid + 1;
                } else if (sortedArray[mid] > valueToFind) {
                    max = mid - 1;
                } else if (sortedArray[mid] == valueToFind) {
                    index = mid;
                    break;
                }
            }
            return index;
        }


//        int i = 0 ;
//        for (int i = 0; i < arr1.length - 1; i++) {
//            for (int j = i + 1 ; j < arr1.length ; j++) {
//
//            if (arr1 [i] + arr1 [j] == summ) {
//                System.out.println(arr1 [i] + " и " + arr1 [j]);
//            }
//        }}
//            break;

    }
