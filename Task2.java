import java.util.Scanner;

public class Task2 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array1");
        int lengthOne = input.nextInt();
        System.out.println("Enter length of array2");
        int lengthTow = input.nextInt();
        int[] array1 = new int[lengthOne];
        int[] array2 = new int[lengthTow];

        // Enter elements of array1

        System.out.println("Enter elements of array1");
        for (int i = 0; i < array1.length; i++) {

            array1[i] = input.nextInt();
        }
        // Enter elements of array2

        System.out.println("Enter elements of array2");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }
        // print array1
        for (int number : array1) {
            if (number % 2 != 0)
                System.out.print(number + " ,");
        }
        System.out.println();
        // print array2
        for (int number : array2) {
            if (number % 2 != 0)
                System.out.print(number + " ,");
        }
        input.close();
    }
}
