package leetcode._242;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String firstString = "aca";
        String secondString = "cac";
        System.out.println(isAnagram(firstString, secondString));
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
                System.out.println(map);
            }
        }
        System.out.println(map);
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
