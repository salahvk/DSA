package kunal_kushwaha.linear_search;

public class SearchString {
    public static void main(String[] args) {
        String name = "salah";
        char target = 'h';
        System.out.println(searchStringChar(name, target));
    }

    static Boolean searchStringChar(String name, char target) {
        Boolean isTargetFound = false;
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                isTargetFound = true;
            }
        }
        return isTargetFound;
    }
}
