package leetcode._190;

public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1;

            result = (result << 1) | lastBit;

            n  >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        // System.out.println(Integer.toBinaryString(4 | 1001));
        ReverseBits solution = new ReverseBits();

        // binary: 00000010100101000001111010011100
        int input1 = 43261596;
        int output1 = solution.reverseBits(input1);
        System.out.println("Reversed bits: " + output1);
        // Expected output: 964176192 (binary: 00111001011110000010100101000000)

    }
}
