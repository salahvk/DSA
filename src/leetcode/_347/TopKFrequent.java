package leetcode._347;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 5, 5, 5, 5, 5 };
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> storeMap = new HashMap<>();
        List<Integer>[] frequencyStore = new List[nums.length + 1];
        for (int i : nums) {
            storeMap.put(i, storeMap.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < frequencyStore.length; i++) {
            frequencyStore[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : storeMap.entrySet()) {
            frequencyStore[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = frequencyStore.length - 1; i > 0 && index < k; i--) {
            for (int num : frequencyStore[i]) {
                res[index++] = num;
                if (index == k) {
                    return res;
                }
            }

        }
        return res;
    }
}
