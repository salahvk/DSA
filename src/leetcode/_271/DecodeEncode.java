package leetcode._271;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeEncode {
    public static void main(String[] args) {
        DecodeEncode decodeEncode = new DecodeEncode();
        List<String> strings = Arrays.asList("we", "say", ":", "yes", "!@#$%^&*()");
        String encoded = decodeEncode.encode(strings);
        System.err.println(encoded);
        List<String> decoded = decodeEncode.decode(encoded);
        System.err.println(decoded);
    }

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String string : strs) {
            encodedString.append(string.length() + "#" + string);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
                j++;
            int length = Integer.valueOf(str.substring(i, j));
            i = length + j + 1;
            decodedStrings.add(str.substring(j + 1, i));
        }
        return decodedStrings;
    }

    // public List<String> decode(String str) {
    // ArrayList<String> decodedStrings = new ArrayList<>();
    // int i = 0;
    // while (i < str.length()) {
    // if (str.charAt(i) == '#') {
    // int length = Character.getNumericValue(str.charAt(++i));
    // decodedStrings.add(str.substring(++i, i += length));
    // }
    // }
    // return decodedStrings;
    // }

    // This is my first solution for decoding string but later it end up in infinity
    // loop if we check these like array ["we","say",":","yes","!@#$%^&*()"]
    // also decoding like #5salah instead of 5#salah
    // i used a function -> int length = Character.getNumericValue(str.charAt(++i));
    // but the issue is it only take characters and if the character is 10 it take 1
    // then 0 so that is a problem

}