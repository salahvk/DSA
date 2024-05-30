import java.util.Scanner;
  // Armstrong problems like checking user entered number is armstrong and / enter the armstrong numbers between the limit
public class ArmStrong {
    // Pseudocode
    // find the digits in a number
    // a number to store the sum of each number that raise to (total digits length)
    // 153 is an example
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Following is a program that checks whether the user entered number is armstrong or not");
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int entered_number = scanner.nextInt();
        int num = entered_number;
        int num_of_digits = 0;
        double sum_of_power_of_num = 0.0;
        // find the number of digits
        int temp = num;
        while (num > 0) {
            num /= 10;
            num_of_digits++;
        }
        while (temp > 0) {
            int rem = temp % 10;
            sum_of_power_of_num += Math.pow(Double.valueOf(rem), Double.valueOf(num_of_digits));
            temp /= 10;
        }
        if (sum_of_power_of_num == entered_number) {
            System.out.println(entered_number + " is an armstrong number");
        } else {
            System.out.println(entered_number + " isn't an armstrong number");
        }

    }
}
