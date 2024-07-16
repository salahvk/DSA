package leetcode._242;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String firstString = "aca";
        String secondString = "cfs";
        System.out.println(isAnagram1(firstString, secondString));
    }

    // brute force method with complexity of o(n^2)
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.toCharArray().length != t.toCharArray().length) {
            return false;
        }
        for (char character : s.toCharArray()) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        for (char character2 : t.toCharArray()) {
            if (!map.containsKey(character2)) {
                return false;
            } else if (map.containsKey(character2) && (map.get(character2) != 1)) {
                map.put(character2, map.get(character2) - 1);
            } else if (map.get(character2) == 1) {
                map.remove(character2);
            }
        }
        System.out.println(map);
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
    // We can actually minimize the above solution
    // Another better solution is sort both the string characters and check

    // Cost efficient solution with less memory (same TC as previous one)
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] values = new int[26];

        for (int i = 0; i < s.length(); i++) {
            values[s.charAt(i) - 'a']++;
            values[t.charAt(i) - 'a']--;
        }
        for (int i : values) {
            if (i != 0)
                return false;
        }
        return true;
    }

}
