package leetcode._49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String string : strs) {
            int[] count = new int[26];
            for (char eachCharacter : string.toCharArray()) {
                count[eachCharacter - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(string);
        }
        return new ArrayList<>(hashMap.values());
    }
}
