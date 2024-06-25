package kunal_kushwaha.bitwise_operators;

public class PowerCalculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        long result = power(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }

    public static long power(int a, int b) {
        long result = 1;
        long base = a;

        while (b > 0) {
            // If b is odd, multiply the result with the base
            if ((b & 1) == 1) {
                result *= base;
            }
            // Square the base
            base *= base;
            // Right shift b by 1
            b >>= 1;
        }

        return result;
    }
}

