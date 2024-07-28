package dsa_everything.recursion;

public class SampleRecursion {
    public static void main(String[] args) {
        // printNumbers(50);
        // System.out.println(factorial(10));
        // System.out.println(sumOfDigits(123456, 0));
        // System.out.println(productOfNumbers(123456, 1));
        System.out.println(reverseANumber(123456, 0));
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
        return sumOfDigits(num / 10, sum + num % 10);
    }

    public static int productOfNumbers(int num, int product) {
        if (num <= 0) {
            return product;
        }
        return productOfNumbers(num / 10, product * (num % 10));
    }

    public static int reverseANumber(int num, int reversedNumber) {
        if (num <= 0) {
            return reversedNumber/10;
        }
        return reverseANumber(num / 10, (reversedNumber + num % 10) * 10);
    }
}
