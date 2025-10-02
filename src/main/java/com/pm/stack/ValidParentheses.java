package com.pm.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    private boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty()){
                if (map.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean solution() {
        return isValid("([{}])");
    }
}
