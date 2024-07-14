package kunal_kushwaha.recursion.permutation;

public class Permutation {
    public static void main(String[] args) {
        permutation("abc", "");
    }

    public static void permutation(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char firstChar = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            permutation(up.substring(1), f + firstChar + l);
        }
    }
}
