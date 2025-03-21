public class Task15 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 3, 2, 5, 8, 5, 7, 4, 6, 7, 0 };
        int[] dublicatedItems = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    dublicatedItems[i] = array[j];
                }
            }

        }
        for (int number : dublicatedItems) {
            if (number != 0)
                System.out.print(number + " ,");
        }
    }
}
