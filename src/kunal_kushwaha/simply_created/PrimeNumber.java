package kunal_kushwaha.simply_created;

public class PrimeNumber {
    public static void main(String[] args) {
        // checkWhetherPrimeorNot(20);
        printAllPrimeNumbersToLimit(50);
    }

    public static void checkWhetherPrimeorNot(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            }

        }
        System.out.println(num + " is a prime number");
    }

    public static void printAllPrimeNumbersToLimit(int num) {
        for (int i = 2; i <= num; i++) {
            checkWhetherPrimeorNot(i);
        }
    }
}
