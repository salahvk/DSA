package kunal_kushwaha.recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(skipCharacter("salah", "", 's'));
    }

    public static String skipCharacter(String up, String p, char skipingChar) {
        if (up.isEmpty()) {
            return p;
        }
        char firstChar = up.charAt(0);

        if (firstChar == skipingChar) {
            return skipCharacter(up.substring(1), p, skipingChar);
        } else {
            return skipCharacter(up.substring(1), p + firstChar, skipingChar);
        }
    }
}
