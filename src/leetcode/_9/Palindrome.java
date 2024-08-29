package leetcode._9;

public class Palindrome {
    // There are 4 ways to solve this problem
    // 1:- 1. String Conversion Approach (Simple but Memory Intensive)
    // 2 :-
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

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
}
