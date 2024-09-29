package leetcode._153;

public class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return nums[s];
    }

    //  The above solution run in O(n) time actually this is wrong

    public int findMin1(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return nums[s];
    }
}
