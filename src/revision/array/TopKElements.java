package revision.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements {
    // The most frequent k elements
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        List<Integer>[] numList = new List[nums.length + 1];
        for (int i : nums) {
            numCount.put(i, numCount.getOrDefault(i, 0) + 1);
        }

        for (int i=0;i<numList.length;i++) {
            numList[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            numList[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = numList.length - 1; i > 0 && index < k; i--) {
          for (int n : numList[i]) {
            res[index++]= n;
            if (index == k) {
                return res;
            }
          }
        }
        return res;
    }
}
