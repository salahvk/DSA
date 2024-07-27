package leetcode._424;

public class LongestRepeatingChar {
    // Input: s = "AABABBAAAAAAA", k = 1
    // Two method for the solution -> one is using a hashmap
    public static void main(String[] args) {
        String s = "XYYX";
        int k = 2;
        System.out.println(characterReplacement(s, k));

    }

    public static int characterReplacement(String s, int k) {

        int left = 0;
        int right = 1;
        int longestStreak = 0;
        int replacement = k;
        int lastReplacementIndex = -1;
        String replacementString = s;
        StringBuilder sb = new StringBuilder(s);

        while (right < s.length()) {
            
            if (s.charAt(left) != s.charAt(right) && replacement == 0) {               
                longestStreak = Math.max(longestStreak, right - left + 1);
                left = lastReplacementIndex;
                replacement = k;
                replacementString = s;
            } else if (s.charAt(left) != s.charAt(right) && replacement != 0) {
                sb.setCharAt(right,replacementString.charAt(left));                    
                replacementString = sb.toString();                  
                // System.out.println(replacementString); 
                lastReplacementIndex = right;
                // System.out.println(right); 
                replacement--;
            }
            right++;
            // System.out.println(right); 
        }
        return longestStreak;
    }

}
