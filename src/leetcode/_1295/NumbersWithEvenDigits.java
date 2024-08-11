package leetcode._1295;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Find Numbers with Even Number of digits
public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        int digitsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] /= 10;
                digitsCount++;
            }
            if (digitsCount % 2 == 0) {
                evenCount++;
            }
            digitsCount = 0;
        }
        return evenCount;
    }
}
