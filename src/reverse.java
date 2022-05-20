public class reverse {

    public static void reverseMassive (int[] massive) {
//                int a = 0 ;
        for (int i = 0; i < massive.length; i++) {
            if (i < massive.length / 2) {
                System.out.print(massive[massive.length-1-i]);
                int a = massive[i];
                massive[i] = massive[massive.length - 1 - i];
                massive[massive.length - 1 - i] = a;
            }
            else  {
                System.out.print(massive[i]);
            }
//                System.out.print();

//                System.out.print(massive [massive.length - 1 - i]);
            }
        }
    }

