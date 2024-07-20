package leetcode._347;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {
        // int[] nums = {7,7};
        // int k = 1;
        // int[] nums = {2,3};
        // int k = 1;
        // int[] nums = {0,1,1};
        // int k = 1;
        // int[] nums = {0,1,1};
        // int k = 1;
        int[] nums = { 1,1,1,2,2,2,3,5,5,5,5,5};
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    // public static int[] topKFrequent(int[] nums, int k) {
    //     HashMap<Integer, Integer> hashMap = new HashMap<>();
    //     for (int i : nums) {
    //         hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
    //     }

    //       for (var val : hashMap.values()) {
    //         System.out.println(val);
    //       }
    //     return new int[] {};
    //     // return getKeyByValue(hashMap, k,nums);

    // }

    // This is a solution for k < frequent numbers

    // public static int[] getKeyByValue(Map<Integer, Integer> map, Integer
    // value,int[] nums) {
    // int count = 0;
    // for (var val : map.values()) {
    // if (val >= value && val > 1) {
    // count++;
    // }
    // }
    // if (count == 0) {
    // return nums;
    // }
    // System.out.println(count);
    // int[] numbers =new int[count];
    // int index = 0;
    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    // if (entry.getValue() >= value && entry.getValue()> 1) {
    // numbers[index] = entry.getKey();
    // System.out.println(Arrays.toString(numbers));
    // index++;
    // }
    // }
    // return numbers; // return null if the value is not found
    // }



     public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        System.out.println(Arrays.toString(freq));

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        System.out.println(count);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        System.out.println(Arrays.toString(freq));

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            // System.out.println(i);
            for (int n : freq[i]) {
                System.out.println(n);
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
