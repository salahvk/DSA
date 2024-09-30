package revision.two_pointers;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            Character char1 = s.charAt(i);
            Character char2 = s.charAt(j);
            while (i < j && !Character.isLetterOrDigit(char1)) {
                char1 = s.charAt(++i);
            }
            while (i < j && !Character.isLetterOrDigit(char2)) {
                char2 = s.charAt(--j);
            }
            if (Character.toLowerCase(char1) != Character.toLowerCase(char2)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
