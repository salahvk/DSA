package kunal_kushwaha.recursion.subset;

public class Subset {
    public static void main(String[] args) {
        subset("", "abc");
    }

    public static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char firstChar = up.charAt(0);
        subset(p + firstChar , up.substring(1));
        subset(p, up.substring(1));       
    }
}
