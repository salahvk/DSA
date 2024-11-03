package revision.d3_11_24;

public class Palindrome {
    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversedNumber = 0;
        while (temp > 0) {
            reversedNumber = reversedNumber * 10 + (temp % 10);
            temp /= 10;
        }
        return reversedNumber == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(313));
    }
}
