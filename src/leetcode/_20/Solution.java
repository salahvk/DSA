package leetcode._20;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> characterLookup = new HashMap<>(3);
        Stack<Character> characterStack = new Stack<>();

        characterLookup.put(')', '(');
        characterLookup.put('}', '{');
        characterLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterLookup.containsKey(c)) {
                if (!characterStack.isEmpty() && characterLookup.get(c).equals(characterStack.peek())) {
                    characterStack.pop();
                } else {
                    return false;
                }
            } else {
                characterStack.push(s.charAt(i));
            }
        }
        return characterStack.isEmpty();
    }
}
