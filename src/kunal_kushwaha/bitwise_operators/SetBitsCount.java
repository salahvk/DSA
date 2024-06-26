package kunal_kushwaha.bitwise_operators;

public class SetBitsCount {
    public static void main(String[] args) {
        int num = 69;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBitsCount(num));
    }

    public static int setBitsCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num -= (num & -num);
        }
        return count;
    }
}
