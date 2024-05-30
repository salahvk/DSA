import java.util.Scanner;

public class ReverseNumber {
    // User will enter a number and make it reversed
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed_number = 0;

        while (num > 0) {
           int rem = num % 10;
           num /= 10;
           reversed_number = reversed_number * 10 + rem;
        }
        System.out.println("Reversed Number: "+reversed_number);
    }
}
