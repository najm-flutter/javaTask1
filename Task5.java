import java.util.Scanner;

public class Task5 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of A and B");
        int length = input.nextInt();
        int[] A = new int[length];
        int[] B = new int[length];
        int[] C = new int[length];

        // Enter elements of A

        System.out.println("Enter elements of A");
        for (int i = 0; i < A.length; i++) {

            A[i] = input.nextInt();
        }
        // Enter elements of B

        System.out.println("Enter elements of B");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }

        // find C from 2A+3B
        for (int i = 0; i < C.length; i++) {
            C[i] = 2 * A[i] + 3 * B[i];
        }
        for (int number : C) {
            System.out.print(number + " ,");
        }
        input.close();
    }
}