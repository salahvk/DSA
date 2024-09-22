package leetcode._53;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int sum = 0;
        int max = nums[0];

        for (int n : nums) {
            sum += n;
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
