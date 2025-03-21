import java.util.Scanner;

public class Task12 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        for (double number : array) {
            System.out.print(number / 2 + " ,");
        }
        input.close();
    }
}
