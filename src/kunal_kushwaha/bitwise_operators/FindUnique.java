package kunal_kushwaha.bitwise_operators;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 5, 1, 3, 1 };
        System.out.println(ans(arr));
    }

    static int ans(int[] num) {
        int unique = 0;
        for (var n : num) {
            unique ^= n;
            System.out.println(n +" to binary " + Integer.toBinaryString(n));
            System.out.println(unique+" unique to binary " + Integer.toBinaryString(unique));
        }
        return unique;
    }
}

// here in the xor take two 3's  both the binary values are same and thus the xor of both become zero
