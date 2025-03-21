public class Task11 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 8, 4, 6, 7, 0 };

        int min = 0;
        for (int number : array) {
            if (number < min)
                min = number;
        }
        System.out.println("the min : " + min);
    }
}
