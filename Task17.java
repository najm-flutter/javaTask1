public class Task17 {
    public static void main(String[] args) {
        int[] array = { 9, 5 };
        boolean islessThanTen = true;
        for (int number : array) {
            if (number >= 10) {
                islessThanTen = false;
                break;
            }
        }
        System.out.println("the elemnts of array are less than 10 : " + islessThanTen);
    }
}
