package kunal_kushwaha.bitwise_operators;

public class ResetIthBit {
    public static void main(String[] args) {
        int num = 39; // 100111 is the binary
        int i = 2; // reset 2nd bit
        System.out.println("Number in binary before reset " + Integer.toBinaryString(num));
        System.out.println("After reset number " + resetIthBit(num, i));
    }

    public static int resetIthBit(int num, int i) {
        int mask = ~(1 << i);
        System.out.println(Integer.toBinaryString(mask));
        int numAfterSet = (num & mask);
        System.out.println(Integer.toBinaryString(numAfterSet));
        return numAfterSet;
    }
}

// Bitwise NOT Operator (~)