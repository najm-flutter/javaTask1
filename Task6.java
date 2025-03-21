import java.util.Scanner;

public class Task6 {
     public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
      
        System.out.println("Enter the value to search");
        int vlaue = input.nextInt();
        boolean isfound = false ;
        int index = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (vlaue == array[i]) {
                isfound = true ;
                 index = i ;
                break ;
            }
        }
        if (isfound) {
            System.out.println("the index: "+ index + " the value is : " +vlaue );
        }else{
            System.out.println("not found");
        }

        input.close();
    }
}
