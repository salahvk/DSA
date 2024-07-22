package leetcode._271;

import java.util.Arrays;
import java.util.List;

public class DecodeEncode {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("neet", "code", "love", "you");
        // decode(encode(strings));
    }

    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strs) {
            stringBuilder.append(string.length() + "#" + string);
        }

        return stringBuilder.toString();
    }

    // public static List<String> decode(String str) {

    // }
}
