package revision.array;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> storeMap = new HashMap<>();
        for (String cuString : strs) {
            int[] store = new int[26];
            for (char cuChar : cuString.toCharArray()) {
                store[cuChar - 'a']++;
            }
            String key = Arrays.toString(store);
            if (!storeMap.containsKey(key)) {
                storeMap.put(key,new ArrayList<>());
            }
            storeMap.get(key).add(cuString);
        }
        return new ArrayList<>(storeMap.values());
    }
}
