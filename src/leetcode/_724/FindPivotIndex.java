package leetcode._724;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int leftSum = nums[i];
        int rightSum = nums[j];

        while (i < j) {
            if (leftSum == rightSum) {
                return nums[i];
            } else if (leftSum > rightSum) {
                rightSum = +nums[j];
                j--;

            } else if (leftSum < rightSum) {
                leftSum = +nums[i];
                i++;
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
