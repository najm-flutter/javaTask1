import java.util.Scanner;

public class Task9 {
    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number  1 <= number <= 12");
        int number = input.nextInt();
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (number >= 1 && number <= 12) {
            System.out.println(months[number - 1]);
        } else {
            System.out.println("Enter a number between 1 and 12");
        }
        input.close();
    }
}
