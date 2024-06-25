package kunal_kushwaha.bitwise_operators;

public class RightmostSetBit {
    public static void main(String[] args) {
        int n = 2; // The binary is 10011 and right most digits position is 1st
        System.out.println(Integer.toBinaryString(n));
        System.out.println(findsetBitPosition(n));

    }

    public static int findsetBitPosition(int num) {
        int isolatedBit = num & -num;
        return (int)(Math.log(isolatedBit)/Math.log(2) + 1);
    }
}
