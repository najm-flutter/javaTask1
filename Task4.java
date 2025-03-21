import java.util.Scanner;

public class Task4 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println(" the sum : " + sum + " the average: " + sum / array.length);
        input.close();
    }
}
