package leetcode._3;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "12341";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {  
        if (s.isEmpty()) {
            return s.length();
        }
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0;
        int right = 0;
        int longestSubstring = 0;
        while (right < s.length()) {
            if (hashSet.contains(s.charAt(right))) {
                longestSubstring = Math.max(right - left, longestSubstring);
                left = right;
            }
            hashSet.add(s.charAt(right));
            right++;
        }
        return longestSubstring;
    }
}
