package leetcode._125;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    // it uses default functions
    static Boolean isPalindrome(String name) {
        String convertedString = name.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < convertedString.length() / 2; i++) {
            if (convertedString.isEmpty()) {
                return true;
            }
            int start = i;
            int end = convertedString.length() - 1 - i;
            if (convertedString.charAt(start) != convertedString.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
