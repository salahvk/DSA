package revision.hashmap;

import java.util.HashSet;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        for (int i : nums) {
            if (store.contains(i)) {
                return true;
            } else {
                store.add(i);
            }
        }
        return false;
    }
}
