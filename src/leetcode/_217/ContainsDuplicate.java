package leetcode._217;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 7 };
        System.out.println(containsDuplicate(arr));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        // hashset is a collection where it doesnt contain any duplicate numbers
        // HashSet: [1, 2, 3] hashset prints like this

        HashMap<Character, Integer> map = new HashMap<>();
        // map.put(1, 100); we add maps like this
        // String s = "dsg";
        // for(char m : s.toCharArray()){
        // map.cont
        // }

        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            } else {
                uniques.add(nums[i]);
            }
        }
        return false;
    }
}
