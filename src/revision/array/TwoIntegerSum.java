package revision.array;

import java.util.HashMap;

public class TwoIntegerSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff),i};
            } else {
                prevMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
