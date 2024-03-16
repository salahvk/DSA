package brototype;

public class StringEncryptor {
    public static String encryptString(String str, int key) {
        int newKey = key % 26;
        char[] charArray = new char[str.length()];

        for (var i = 0; i < str.length(); i++) {
            int letterPosition = str.charAt(i) + newKey;
            if (letterPosition <= 122) {
                charArray[i] = (char) letterPosition;
            } else {
                charArray[i] = (char) (96 + letterPosition % 122);
            }

        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String value = "Salah";
        System.out.println(encryptString(value, 2));
    }
}
