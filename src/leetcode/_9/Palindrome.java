package leetcode._9;

public class Palindrome {
    // There are 4 ways to solve this problem
    // Use iteration with Time complexity of O(log n) which is best
    public boolean isPalindrome(int x) {
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

    // This solution only uses O(log n) TC

    // public boolean isPalindrome2(int x) {
    //     if (x < 0 || (x != 0 && x % 10 == 0))
    //         return false;
    // }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        // System.out.println(palindrome.isPalindrome());
    }
}
