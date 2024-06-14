package kunal_kushwaha.Recursion;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to compute a different Fibonacci number
        System.out.println("Fibonacci series up to " + n + " terms:");
        System.out.println(fibonacci(n));
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
