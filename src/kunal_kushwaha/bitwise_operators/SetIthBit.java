package kunal_kushwaha.bitwise_operators;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 39; // 100111 is the binary
        int i = 4; // set 5th bit
        System.out.println("Number in binary before set " + Integer.toBinaryString(num));
        System.out.println("After set number " + setIthBit(num, i));
    }

    public static int setIthBit(int num, int i) {
        int mask = 1 << i;
        int numAfterSet = (num | mask);
        System.out.println(Integer.toBinaryString(numAfterSet));
        return numAfterSet;
    }
}
