package revision.two_pointers;

import java.util.Arrays;
import java.util.List;

public class ThreeIntegerSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        while (true) {
            if (nums[i]+ nums[j] > 0)continue;
        }
    }
}
