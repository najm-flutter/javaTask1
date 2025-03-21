public class Task16 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 3, 2, 5, 8, 5, 7, 4, 6, 7, 0 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isPremary = true;
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    isPremary = false;
                    break;
                }
            }
            if (isPremary && array[i] > 1) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
