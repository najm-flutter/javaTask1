import java.util.Scanner;

public class Task19 {
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
        boolean areEqual = true;
        if (lengthOne == lengthTow) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        System.out.println("Are array1 and array2 equal?: " + areEqual);
        input.close();
    }
}
