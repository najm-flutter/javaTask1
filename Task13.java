import java.util.Scanner;

public class Task13 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int number : array) {
            if (number % 2 == 0)
                System.out.print(number + " ,");
        }
        input.close();
    }
}
