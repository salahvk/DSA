package leetcode._128;

import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            numberSet.add(num);
        }

        int longestStreak = 0;
        for (int number : numberSet) {
            if (!numberSet.contains(number - 1)) {
                int length = 1;
                while (numberSet.contains(number + length)) {
                    length++;
                }
                longestStreak = Math.max(longestStreak, length);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        LongestConsecutive longestConsecutiveSequence = new LongestConsecutive();
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutiveSequence.longestConsecutive(arr));
    }
}
