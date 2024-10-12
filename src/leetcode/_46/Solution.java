package leetcode._46;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backTrack(nums, new ArrayList<>(), result);
    return result;
  }

  List<List<Integer>> backTrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
    if (current.size() == nums.length) {
      result.add(new ArrayList<>(current));
    }
    for (int num : nums) {
      if (current.contains(num)) {
        continue;
      }
      current.add(num);
      backTrack(nums, current, result);
      current.remove(current.size() - 1);
    }
    return result;
  }

}
