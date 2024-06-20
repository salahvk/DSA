package kunal_kushwaha.bitwise_operators;

public class OddEven {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(isOdd(n));
    }

    static Boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
