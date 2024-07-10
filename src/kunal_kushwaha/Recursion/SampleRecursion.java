package kunal_kushwaha.recursion;

public class SampleRecursion {
    public static void main(String[] args) {
        // printNumbers(50);
        // System.out.println(factorial(10));
        // System.out.println(sumOfDigits(123456, 0));
    }

    public static void printNumbers(int num) {
        if (num <= 0) {
            return;
        }
        printNumbers(num - 1);
        System.out.println(num);
    }

    public static int factorial(int num) {
        if (num <= 0) {
            return 1;
        }
        return (num * factorial(num - 1));
    }

    public static int sumOfDigits(int num, int sum) {
        if (num <= 0) {
            return sum;
        }
        return sumOfDigits(num/10,sum + num%10);
    }
}
