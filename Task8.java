public class Task8 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 8, 4, 6, 7, 0 };

        int max = 0;
        for (int number : array) {
            if (number > max)
                max = number;
        }
        System.out.println("the max : " + max);
    }
}
