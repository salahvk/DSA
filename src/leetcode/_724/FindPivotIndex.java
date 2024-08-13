package leetcode._724;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; leftSum += nums[i++]) {
            if (leftSum * 2 == totalSum - nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
