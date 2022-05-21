public class Random {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 10;
        }

        int sumRandom = Summ.summArray(arr) ;
        int quantityRandom = Quantity.quantity(arr) ;
        float averageRandom = Average.average(sumRandom, quantityRandom) ;
        System.out.println("sumRandom = " + sumRandom);
        System.out.println("quantityRandom = " + quantityRandom);
        System.out.println("averageRandom = " + averageRandom);

        return arr;
    }
}
