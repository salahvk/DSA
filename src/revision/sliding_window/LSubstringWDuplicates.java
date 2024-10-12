package revision.sliding_window;

import java.util.HashSet;

// my own method
public class LSubstringWDuplicates {
    public int lengthOfLongestSubstring(String s) {
        int longestStreak = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> charSet = new HashSet<>();
        while (r < s.length()) {
            if (!charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                r++;
                longestStreak = Math.max(longestStreak, r - l);
            } else {
                l = r;
                charSet.clear();
            }
        }
        return longestStreak;
    }
}
