public class FibonacciSeries {

    public static void main(String[] args) {
        showFibonacciNumbers(100);
    }

    // Printing Fibonacci number upto given number
    static void showFibonacciNumbers(int num) {
        int a = 0;
        int b = 1;
        while (a < num) {
            System.out.println(a);
            a = (b += a) - a;
        }

        // short of above expression
        // int c = a + b;
        // a = b;
        // b = c;
    }

}
