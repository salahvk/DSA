package dsa_everything.arrays.permutation;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        System.out.println(result);
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        System.out.println(tempList);
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            System.out.println(tempList);
            backtrack(result, tempList, nums, i + 1);
            // tempList.remove(tempList.size() - 1);
            System.out.println("Templist removed");
            System.out.println(tempList);
        }
    }
}
