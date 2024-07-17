package leetcode._1;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        System.out.println(twoSum(nums, 6));
    }

    // First of all you can solve the problem using two loops with complexity of
    // O(N^2)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int selectedNum = nums[i];
            int diff = target - selectedNum;
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            } else {
                prevMap.put(selectedNum, i);
            }
        }
        return new int[] {};
    }
}
