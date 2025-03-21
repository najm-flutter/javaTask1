public class task10 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 8, 4, 6, 7, 0 };

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int number : array) {
            System.out.print(number + " ,");
        }
    }
}
