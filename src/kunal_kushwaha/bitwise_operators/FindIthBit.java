package kunal_kushwaha.bitwise_operators;

public class FindIthBit {
    public static int getIthBit(int number, int i) {
        // Create a bitmask with a 1 at the ith position
        int mask = 1 << i;
        // System.out.println(mask);
        // System.out.println(Integer.toBinaryString(mask));

        // Perform bitwise AND with the number and the mask
        int bit = (number & mask) >> i;
        
        return bit;
    }

    public static void main(String[] args) {
        int number = 29; // Binary representation: 11101
        int i = 3; // We want to find the 3rd bit (counting from 0)
        
        int bit = getIthBit(number, i);
        System.out.println("The " + i + "-th bit of " + number + " is: " + bit);
        System.out.println(Integer.toBinaryString(number));
    }
}
