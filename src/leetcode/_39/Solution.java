package leetcode._39;

import java.util.ArrayList;
import java.util.List;

//  The initial brute force method doesn't work
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<>();
        backTrack(candidates, target, 0, res, current);
        return res;
    }

    void backTrack(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> current) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
        } else if (target < 0 || index >= candidates.length) {
            return;
        } else {
            current.add(candidates[index]);
            backTrack(candidates, target - candidates[index], index, res, current);

            current.remove(current.get(current.size() - 1));
            backTrack(candidates, target, index + 1, res, current);
        }
    }
}