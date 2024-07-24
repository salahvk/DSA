package leetcode._3;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        System.out.println(s.isEmpty());
        if (s.isEmpty()) {
            return s.length() ;
        }
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0;
        int right = 1;
        int longestSubstring = 0;
        hashSet.add(s.charAt(left));
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
